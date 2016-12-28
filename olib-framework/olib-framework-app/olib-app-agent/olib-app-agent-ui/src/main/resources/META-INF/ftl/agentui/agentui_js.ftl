<script>
agentapp.controller('agentui_controller',['$scope','$http',function($scope, $http){
	$scope.commandList={};
	var selectAgent;
	
	$scope.updateAgentList = function(){
		$http({
			url:'/agent/agentlist',
			method:'GET'
		}).then(function(response){
			$scope.agentList = response.data;
		});
	};
	
	
	$scope.addAgentRequest = function(param){
		$http({
			url:'/agent/agent',
			method:'POST',
			data:{
				'jsonData':JSON.stringify(param)
			},
			headers: {'Content-Type': 'application/json; charset=utf-8','X-CSRF-TOKEN':document.querySelector('#csrf_token').value}
		}).then(function(response){
			$scope.updateAgentList();
		});
	};
	
	$scope.addAgent = function(agentId,ip,memo){
		var msg = agentId+" - "+ip+" add?";
		var param={};
		
		if(confirm(msg)){
			param['agentId'] = agentId;
			param['ip'] = ip;
			param['memo'] = memo;
			
			$scope.addAgentRequest(param);
		}
	};
	
	$scope.deleteAgentRequest = function(param){
		$http({
			url:'/agent/agent',
			method:'DELETE',
			data:{
				'jsonData':JSON.stringify(param)
			},
			headers: {'Content-Type': 'application/json; charset=utf-8','X-CSRF-TOKEN':document.querySelector('#csrf_token').value}
		}).then(function(response){
			$scope.updateAgentList();
		});
	};
	
	$scope.deleteAgent = function(agentId){
		var msg = agentId+" delete?";
		var param={};
		if(confirm(msg)){
			param['agentId'] = agentId;
			$scope.deleteAgentRequest(param);
		}
	};
	
	$scope.runAgentRequest = function(agentId, path){
		$http({
			url:'/agent/run?agentId='+agentId+"&path="+path,
			method:'GET'
		}).then(function(response){
			$scope.updateResult(response.data);
		});
	};
	
	$scope.runAgent = function(path){
		var msg = path+" run?";
		if(confirm(msg)){
			$scope.runAgentRequest(selectAgent.agentId,path);
		}
	};
	
	$scope.updateResult = function(result){
		$scope.resultList = result;
	};
	
	// agent 선택
	$scope.selectAgent = function(index, agent){
		$scope.commandList = agent.commandList;
		selectAgent = agent;
		$scope.resultList = {};
		
		angular.element(".agent_row").removeClass("selected");
		angular.element(".agent_row_icon").removeClass("fa fa-check");
		angular.element("#agent_row_"+index).toggleClass("selected");
		angular.element("#agent_row_check_"+index).toggleClass("fa fa-check");
	};
	
	$scope.init = function(){
		console.log("agent_ui_controller initialized");
		$scope.updateAgentList();
	};

	$scope.init();
}]);
</script>