'use strict';

// to be changed
exports.authorize = async (event) => {
  console.log('CONNECT: ' + JSON.stringify(event));

  const authToken = event.queryStringParameters.auth
  const resource = event.methodArn;
  
  let effect = 'Allow';

  console.log("authToken " + authToken + " resource " + resource);

  return {
    "principalId": "user",
    "policyDocument": {
      "Version": "2012-10-17",
      "Statement": [
        {
          "Action": "execute-api:Invoke",
          "Effect": effect,
          "Resource": resource
        }
      ]
    }
  };
}