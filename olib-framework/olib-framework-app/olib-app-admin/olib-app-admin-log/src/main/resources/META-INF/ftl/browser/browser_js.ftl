<script>
adminapp.controller('browser-controller',['$scope','$http','$compile', function($scope, $http,$compile) {
//------------------------------------------------------------------------------	
// 로그 브라우져
//------------------------------------------------------------------------------	
	$scope.tabIndex = 0;								// 추가한 탭 수
	$scope.selectTabIndex = 0;							// 선택한 탭 번호
	$scope.tabCurrentPage = {};							// 탭 번호별 현재 페이지 설정 (ex : {1:3, 2:1, 3:10})
	$scope.tabTotalPage = {};							// 탭 번호별 전체 페이지 설정 (ex : {1:10, 2:14, 3:41})
	$scope.tabContent = {};								// 탭 번호별 화면에 표시할 내용 저장 (ex : {1:page content1, 2:page content2}) 
	
	$scope.replaceMap = {};								// filter serarch replace map data
	
	var defaultPath = "/Users",							// 파일 리스트를 표시할 주소 기본값
		file_separator = "/";
	
	// 파일리스트 출력
	$scope.getFileTypeList = function(filePath){
		$http({
			url: '/admin/log/browser/fileTypeList?path='+encodeURIComponent(filePath),
			method: "GET"
		}).then(function(response) {
			$scope.file_browser_list = response.data;
			$scope.file_browser_path = filePath;
		});
	};
	
	//페이지 번호 설정
	$scope.setPagenation = function(tabIndex, currentPage, totalPage){
		$scope.tabCurrentPage[tabIndex] = currentPage;
		$scope.tabTotalPage[tabIndex] = totalPage;
	};
	
	// 상위 경로의 파일 리스트 출력
	$scope.getParentPath = function(filePath){
		var split = filePath.split(file_separator),
			parentPath='';
		
		if(split.length == 1) return;
		
		for(var i = 0; i<split.length-1; i++){
			parentPath+= split[i] +file_separator;
		}
		parentPath = parentPath.substring(0,parentPath.length-1)
		$scope.getFileTypeList(parentPath);
	};
	
	// 디렉토리의 파일 리스트 또는 파일의 내용 출력
	$scope.selectFile = function(select){
		if(select.fileType === 'TYPE_DIR'){
			$scope.getFileTypeList(select.filePath);
		}else{
			$scope.getFileBody(select);
		}
	};
	
	//탭삭제
	$scope.removeTab = function(index){
		angular.element(document.getElementById('tab_'+index)).remove();
		angular.element(document.getElementById('tab_content_'+index)).remove();
		$scope.tabCurrentPage[index] = null;
		$scope.tabTotalPage[index] = null;
		$scope.tabContent[index] = null;
	};
	
	//탭선택
	$scope.selectTab = function(index){
		$scope.selectTabIndex = index;
		angular.element("#tab_content_"+index).html("<p>"+$scope.tabContent[index]+"</p>");
	};
	
	//탭 내용 추가
	$scope.addTabContent = function(index,content){
		$scope.tabContent[index] = content.fileBody;
		angular.element(
			document.getElementById('resultContent'))
			.append("<div role='tabpanel' class='tab-pane fade' id='tab_content_"+index+"'><p>{{tabContent[selectTabIndex]</p></div>");
	
	};
	
	//탭 추가
	$scope.addTab = function(content){
		$scope.tabIndex++;
		
		angular.element(
			document.getElementById('resultTab'))
			.append($compile("<li ng-click='selectTab("+$scope.tabIndex+")' role='presentation' class=''><a href='#tab_content_"+$scope.tabIndex+"' role='tab' id='tab_"+$scope.tabIndex+"' data-toggle='tab' aria-expanded='true'>"+content.fileName+" <i ng-click='removeTab("+$scope.tabIndex+")' class='fa fa-remove' style='cursor:pointer;'></i></a></li>")($scope));
		
		$scope.addTabContent($scope.tabIndex,content);
	};
	
	// 선택한 파일의 내용 출력 
	$scope.getFileBody = function(select){
		$http({
			url: '/admin/log/browser/fileBody?path='+encodeURIComponent(select.filePath)+"&currentPage=1",
			method: "GET"
		}).then(function(response) {
			$scope.addTab(response.data);
			$scope.file_browser_path = response.data.filePath;
			$scope.setPagenation($scope.tabIndex,1,response.data.totalPageCount);
		});
	};
	
	// 파일내용 검색
	$scope.getFileBodySearch = function(filePath, keyword){
		$http({
			url: '/admin/log/browser/fileBodySearch?path='+encodeURIComponent(filePath)+"&keyword="+keyword+"&currentPage=1",
			method: "GET"
		}).then(function(response) {
			$scope.addTab(response.data);		
			$scope.setPagenation($scope.tabIndex,1,response.data.totalPageCount);
		});
	};
		
	// 페이징 처리 
	$scope.getPaginationPage = function(filePath,page){
		if(page < 1){
			page = 1;
		}
		if(page >= $scope.tabTotalPage[$scope.selectTabIndex]){
			page = $scope.tabTotalPage[$scope.selectTabIndex];
		}
		
		var url = '';
		if($scope.keyword != undefined && $scope.keyword != ''){
			url = '/admin/log/browser/fileBodySearch?path='+encodeURIComponent(filePath)+"&currentPage="+page+"&keyword="+$scope.keyword;
		}else{
			url = '/admin/log/browser/fileBody?path='+encodeURIComponent(filePath)+"&currentPage="+page;
		}
		
		$http({
			url: url,
			method: "GET"
		}).then(function(response) {
			$scope.tabContent[$scope.selectTabIndex] = response.data.fileBody;
			$scope.selectTab($scope.selectTabIndex);
			$scope.setPagenation($scope.selectTabIndex,page,response.data.totalPageCount);
		});
	};
	
	$scope.addReplaceMap = function(){
		if($scope.filterReplace){
			$scope.replaceMap[$scope.filterTarget] = $scope.filterReplace;
		}else{
			$scope.replaceMap[$scope.filterTarget] = "";
		}
		
		$scope.filterTarget = '';
		$scope.filterReplace = '';
	};
	
	$scope.removeReplaceMap = function(key){
		delete $scope.replaceMap[key];
	};
	
	$scope.customFilterSearch = function(){
		var param={};
		
		param['keyword'] = $scope.filterKeyword;
		param['dateFormat'] = $scope.filterDateFormat;
		param['dateStart'] = $scope.filterDateStart;
		param['dateEnd'] = $scope.filterDateEnd;
		param['path'] = $scope.file_browser_path;
		param['currentPage'] = 1;
		param['replaceMap'] = $scope.replaceMap;
		
		$http({
			url: '/admin/log/browser/customFilterSearch',
			method: "POST",
			headers: {'Content-Type': 'application/json; charset=utf-8','X-CSRF-TOKEN':document.querySelector('#csrf_token').value},
			data: angular.toJson(param)
		}).then(function(response) {
			$scope.addTab(response.data);		
			$scope.setPagenation($scope.tabIndex,1,response.data.totalPageCount);
		});
	};
	
	// 최초 동작	
	$scope.init = function(){
		$scope.getFileTypeList(defaultPath);
	};
	
	$scope.init();
}]);
</script>
