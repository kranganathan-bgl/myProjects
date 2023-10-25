# angjs-demo

digest process / cycle / loop:
    - responsible to walk through entire watch list for modifications
    - execute watch listeners if modifications exist
    - keeps notes of all modifications and notifies Angular Js framework to update DOM

digest process triggered by:
    - DOM Events (ng-model, ng-click etc.)
    - Ajax with callbacks ($http etc.)
    - Timers with callbacks ($timeout etc.)
    - Browser location changes
    - Manual Invocation ($apply, $digest)

$apply vs $digest
    - $apply calls $digest internally
    - $scope.$apply() or $rootScope.$apply() - always start from rootScope
    - $scope.digest() - starts from this scope not from the rootScope