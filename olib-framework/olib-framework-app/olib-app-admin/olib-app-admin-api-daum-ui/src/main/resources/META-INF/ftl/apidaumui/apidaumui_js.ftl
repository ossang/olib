<script>
	adminapp.controller('apimanager_main_controller',['$scope','$http','$compile', function($scope, $http,$compile) {
	//------------------------------------------------------------------------------
		$scope.tabIndex = 0;

		$scope.formData={
			apiKey : '',
			secretKey : '',
			customerId: '',
			campaignId:'',
			adgroupId:'',
			keywordId:''
		};
		
		$scope.initServiceNames = function(){
			$http({
				url: '/admin/api/daum/getServiceList',
				method: "GET"
			}).then(function(response) {
				$scope.serviceList = response.data;
			});
		};
		
		//탭삭제
		$scope.removeTab = function(index){
			angular.element('#tab_'+index).remove();
			angular.element('#tab_content_'+index).remove();
		};
		
		//탭 내용 추가
		$scope.addTabContent = function(index,content){
			angular.element('#resultContent')
				.append($compile("<div role='tabpanel' class='tab-pane fade' id='tab_content_"+index+"'><json-formatter json='"+JSON.stringify(content)+"'open='3'></json-formatter></div>")($scope));
		};
		
		//탭 추가
		$scope.addTab = function(method,content){
			$scope.tabIndex++;
			
			angular.element('#resultTab')
					.append($compile("<li role='presentation' class=''><a href='#tab_content_"+$scope.tabIndex+"' role='tab' id='tab_"+$scope.tabIndex+"' data-toggle='tab' aria-expanded='true'>"+method+" <i ng-click='removeTab("+$scope.tabIndex+")' class='fa fa-remove' style='cursor:pointer;'></i></a></li>")($scope));
				
			$scope.addTabContent($scope.tabIndex,content);
		};
		
		$scope.run = function(service,method){
			var param={};
			param['service'] = service;
			param['method'] = method;
			param['parameterTypes'] = $scope.selectedMethod[0].parameterTypes;
			param['parameters'] = $scope.formData;
			
			$http({
				url: '/admin/api/daum/run',
				method: 'POST',
				data:{
					'jsonData':JSON.stringify(param)
				},
				headers: {'Content-Type': 'application/json; charset=utf-8','X-CSRF-TOKEN':document.querySelector('#csrf_token').value}
			}).success(function(response){
				$scope.addTab(method,response);
				console.log(response);
			}).error(function(response){
				console.log(response);
			});
			
		};
		
		$scope.init = function(){
			$scope.initServiceNames();
		};
		
		$scope.init();
	//------------------------------------------------------------------------------
	
	}]);

</script>