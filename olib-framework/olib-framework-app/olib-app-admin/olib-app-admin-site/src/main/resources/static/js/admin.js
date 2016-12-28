var adminapp = angular.module('admin-app',['jsonFormatter']);
adminapp.controller('navi-controller',['$scope','$http', function($scope, $http) {
//------------------------------------------------------------------------------
	$scope.getMenuList = function(){
		$http({
			url: '/admin/menu',
			method: "GET"
		}).then(function(response) {
			$scope.menuList = response.data;
		});
	};
	
	$scope.selectMenu = function(index){
		var selected = document.getElementById('subMenu_'+index),
			display = selected.style.display;

		if(display == 'block'){
			selected.style.display = 'none';
		}else{
			selected.style.display = 'block';
		}
	};
	
	$scope.init = function(){
		$scope.getMenuList();
		
	};
	$scope.init();
//------------------------------------------------------------------------------
}]);

//------------------------------------------------------------------------------
//html 태그 인식 필터
//------------------------------------------------------------------------------
adminapp.filter('html',function($sce){
 return function(input){
     return $sce.trustAsHtml(input);
 }
});
