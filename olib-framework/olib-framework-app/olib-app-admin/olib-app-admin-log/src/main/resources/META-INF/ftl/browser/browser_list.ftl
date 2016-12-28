<div class="x_panel">
	<div id="file_browser_body" class="panel-body container-fluid theme-showcase">
		<a href="" ng-click="getParentPath(file_browser_path)"><i class="fa fa-level-up"></i> ... <br></a>
		<a href="" ng-repeat="list in file_browser_list" ng-click="selectFile(list)" style="color: black;">
			<i class="fa fa-file-text-o" ng-if="list.fileType=='TYPE_FILE'"></i>
			<i class="fa fa-folder-open" ng-if="list.fileType=='TYPE_DIR'"></i>
			 {{list.fileName}}
			<i class="fa fa-ellipsis-h" ng-if="list.fileType=='TYPE_FILE'" ></i>
			 {{(list.fileType=='TYPE_FILE')?'('+ list.fileSize+')':''}}<br>
			
		</a>
	</div>	
	<div id="file_browser_footer" class="panel-footer">
		<div style="float: left;">{{file_browser_list.length}} Files</div>
	</div>	
</div>