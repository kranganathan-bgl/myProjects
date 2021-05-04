'use strict';

const aws = require('aws-sdk');

const documentClient = new aws.DynamoDB.DocumentClient();

const Dynamo = {
  async putItem(item, tableName) {
    const params = {
        TableName: tableName,
        Item: item,
    };

    return await documentClient.put(params).promise();
  },

  async deleteItem(connectionId, tableName) {
    const params = {
        TableName: tableName,
        Key: {
            connectionId: connectionId
        }
    };

    return await documentClient.delete(params).promise();
  },

  async getItems(clientId, tableName, ExclusiveStartKey) {
    const params = {
        TableName: tableName,
        FilterExpression: 'clientId = :clientId',
        ExpressionAttributeValues: {
            ':clientId': clientId
        },
        ExclusiveStartKey
    };

    const { Items, LastEvaluatedKey } = await documentClient.scan(params).promise();
  
    const items = Items.map(({ connectionId }) => connectionId);
    if(LastEvaluatedKey) {
        items.push(...await get(clientId, tableName, LastEvaluatedKey));
    }
  
    return items;
  }
}

module.exports = Dynamo;