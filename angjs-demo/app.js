let myApp = angular.module('AngJsDemoApp', []);

myApp.controller('AngJsDemoController', ['$scope', '$rootScope', function($scope, $rootScope) {

  let digestCounter = 0;

  $scope.a = 1;
  $scope.b = 2;
  $scope.c = 0;

  $rootScope.$watch(() => {
    digestCounter++
    console.log(digestCounter + " - digest process started..");
  });

  $scope.$watch('a', (newValue, oldValue) => {
    console.log("watch -> a:- oldValue: " + oldValue + ", newValue: " + newValue);

    //if(newValue && newValue !== oldValue) {
    //  $scope.b = Number(newValue) + 1;
    //}
  });

  $scope.$watch('b', (newValue, oldValue) => {
    console.log("watch -> b:- oldValue: " + oldValue + ", newValue: " + newValue);

    //if(newValue && newValue !== oldValue) {
    //  $scope.a = Number(newValue) + 1;
    //}
  });


  $scope.getUsers = () => {
    return [{name: 'Hank'}, {name: 'Francisco'}];
  };

  $scope.users = $scope.getUsers();


  $scope.doSum = () => {
    $scope.c = Number($scope.a) + Number($scope.b);
  }

}]);

var doSum2 = () => {
  const $scope = angular.element($("#main")).scope();
  $scope.c = Number($scope.a) + Number($scope.b);
  //$scope.$apply();
  //$scope.$digest();
}