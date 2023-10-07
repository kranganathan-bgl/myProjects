(function(angular){
  'use strict';

  angular.module('AngJsDemoApp').component('childComponent', {
    templateUrl: '../components/templates/childComponent.html',
    bindings: {
      input: '<',
      listener: '<?'
    },
    controllerAs: 'vmChild',

    controller: function () {
      let vmChild = this;

      vmChild.$onInit = function () {
        vmChild.c = vmChild.input;
        notify('init');
      };

      vmChild.onFieldChange = () => {
        notify('change', vmChild.c);
      }

      function notify(event, data) {
        if(!vmChild.listener) {
          return;
        }

        vmChild.listener(event, data);
      }
    }
  });
})(angular);