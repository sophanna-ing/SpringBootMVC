// app module
var springApp = angular.module('SpringBootMVC', []);

// routes
springApp.config(function ($routeProvider) {

   $routeProvider
    .when('/',
        {
            controller: 'HomeController',
            templateUrl: 'views/welcome.html'
        })
    .when('/about',
        {
            controller: 'AboutController',
            templateUrl: 'views/about.html'
        })
    .otherwise({ redirectTo: '/' });

});
