angular.module('WsDemoApp', [])
.controller('WsDemoController', function($scope, $http, $timeout) {
  const MINUTE_MS = 60 * 1000;
  const PING_TIME_MS = 3 * MINUTE_MS;

  $scope.clientId = 'Kan';
  $scope.endPoint = 'wss://l5zuna7160.execute-api.ap-southeast-2.amazonaws.com/dev';
  $scope.message = 'Hello from the Client';
  $scope.restEndPoint = 'http://localhost:8082/notify';
  
  let logs = [];
  
  $scope.connect = function(endPoint, clientId) {
    const url = `${endPoint}?clientId=${clientId}&clientName=Ranganathan`;
    console.log('connect: ', url);
    this.websocket = new WebSocket(url);
    schedulePing();

    this.websocket.onopen = (evt) => {
      console.log('onopen: ', evt);
      addTolog("CONNECTED");
    };

    this.websocket.onclose = (evt) => {
      console.log('onclose: ', evt);
      addTolog("DISCONNECTED");
    };

    this.websocket.onmessage = (evt) => {
      console.log('onmessage: ', evt);
    //   let data = JSON.parse(evt.data);
    //   addTolog('RECEIVED: ' + data.message);
      addTolog('RECEIVED: ' + evt.data);
    };

    this.websocket.onerror = (evt) => {
      console.log('onerror: ', evt);
      addTolog('ERROR: ' + evt.data);
    };
  }

  $scope.disconnect = function() {
    this.websocket.close();
  };

  $scope.send = function(message) {
    this.websocket.send(
      JSON.stringify({ action: 'message', data: message })
    );

    addTolog('SENT (WS): ' + message);
  };

  $scope.clear = function() {
    clearLog();
  };

  $scope.notify = function(restEndPoint, clientId, message) {
    let payload = {
        clientId: clientId,
        message: message
    }

    let data = JSON.stringify(payload);

    console.log(data);

    $http.post(restEndPoint, data).then((response) => {
        console.log('Notify response: ', response);
    });

    addTolog('SENT (REST): ' + message);
  }

  function schedulePing() {
    $timeout(() => {
      $scope.send('Ping...');
      schedulePing();
    }, PING_TIME_MS);
  }

  function addTolog(text){
    if(logs.length > 5) {
      logs.pop();
    }
    logs.push(getCurrentDateTime() + ': ' + text);
    document.getElementById('log').value = logs.join('\n\n'); 
  }

  function clearLog(){
    logs = [];
    document.getElementById('log').value = ''; 
  }

  function getCurrentDateTime() {
    return new Date().toLocaleString();
  }
});