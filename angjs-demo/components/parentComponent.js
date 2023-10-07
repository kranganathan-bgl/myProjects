(function(angular){
  'use strict';

  angular.module('AngJsDemoApp').component('parentComponent', {
    templateUrl: '../components/templates/parentComponent.html',
    controllerAs: 'vmParent',

    controller: function () {
      let vmParent = this;

      vmParent.save = function () {
        console.log("Save - p: ", vmParent.p)
      };

      vmParent.$onInit = function () {
        vmParent.p = 10;
      };

      vmParent.childListener = (eventName, eventData) => {
        console.log("childListener - event:", eventName);

        if(eventName === 'change') {
          childUpdate(eventName, eventData);
        }
      }

      function childUpdate(eventName, eventData) {
        vmParent.p = eventData;
      }

    }
  });

})(angular);