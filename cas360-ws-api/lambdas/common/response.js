'use strict';

const Response = {
  OK : (body) => {
    return generateResponse(200, body);
  },

  NO_CONTENT : (body) => {
    return generateResponse(204, body);
  },

  BAD_REQUEST : (body) => {
    return generateResponse(400, body);
  }
}

const generateResponse = (statusCode = 200, body) => {
  return {
    headers: {
        'Content-Type': 'application/json',
        'Access-Control-Allow-Methods': '*',
        'Access-Control-Allow-Origin': '*',
    },
    statusCode: statusCode,
    body: body
  };
}

module.exports = Response;