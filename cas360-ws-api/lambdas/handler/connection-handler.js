'use strict';

const response = require('../common/response');
const dynamo = require('../common/dynamo');

const WS_CONNECTIONS_TABLE = process.env.WS_CONNECTIONS_TABLE;

exports.connect = async (event) => {
  console.log('CONNECT: ' + JSON.stringify(event));

  const { clientId } = event.queryStringParameters;
  const { connectionId, requestTime } = event.requestContext;
  
  const item = {
    connectionId: connectionId,
    clientId: clientId,
    connectionTime: requestTime
  }

  await dynamo.putItem(item, WS_CONNECTIONS_TABLE);
  return response.OK('Connected');
}

exports.disconnect = async (event) => {
  console.log('DISCONNECT: ' + JSON.stringify(event));

  const { connectionId } = event.requestContext;

  await dynamo.deleteItem(connectionId, WS_CONNECTIONS_TABLE);
  return response.OK('Disconnected');
}

exports.default = async (event) => {
  console.log('DEFAULT: ' + JSON.stringify(event));
  return response.BAD_REQUEST('Discarded');
}
