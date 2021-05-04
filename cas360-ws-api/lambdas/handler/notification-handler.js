'use strict';

const aws = require('aws-sdk');

const response = require('../common/response');
const dynamo = require('../common/dynamo');

const WS_CONNECTIONS_TABLE = process.env.WS_CONNECTIONS_TABLE;

const wsApi = new aws.ApiGatewayManagementApi({
  endpoint: process.env.WS_ENDPOINT
});

exports.notify = async (event) => {
  console.log('NOTIFY: ' + JSON.stringify(event));

  const { clientId, message } = event;
  
  try {
      const connections = await dynamo.getItems(clientId, WS_CONNECTIONS_TABLE);
      await Promise.all(
        connections.map(connectionId => postToConnection(connectionId, message))
      );

      if(connections.length > 0) {
        return response.OK('Notified');
      } else {
        return response.NO_CONTENT('No connections found');
      }
  } catch (error) {
      return response.BAD_REQUEST('Could not be notified');
  }
}

const postToConnection = async (connectionId, data) => {
  const params = {
      ConnectionId: connectionId,
      Data: data
  };

  try {
      await wsApi.postToConnection(params).promise();
  } catch (error) {
      // Ignore if connection no longer exists
      if(error.statusCode !== 400 && error.statusCode !== 410){
          throw error;
      }
  }
}