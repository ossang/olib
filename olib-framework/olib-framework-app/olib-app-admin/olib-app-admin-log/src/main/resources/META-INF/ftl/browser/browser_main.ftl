<head>
	<#include "browser_css.ftl">
</head>
<body>
	<div ng-controller="browser-controller" >
		<div class="page-title">
			<div class="title_left"></div>
			<div class="title_right"></div>
		</div>
		<div class="clearfix"></div>
		<div class="row">
			<div class="col-md-12">
				<div class="x_panel">
					<div class="x_title">
						<div class="col-md-9">
							<input ng-model="file_browser_path" ng-keypress="($event.which === 13)?getFileTypeList(file_browser_path):0" class="form-control" style="margin-bottom:10px;"/>
						</div>
						 <div class="col-md-3 col-sm-5 col-xs-12 form-group pull-right top_search" style="margin-bottom:0px;">
					       <div class="input-group">
					         <input ng-model="keyword" ng-keypress="($event.which === 13)?getFileBodySearch(file_browser_path,keyword):0" type="text" class="form-control" placeholder="Search for...">
					         <span class="input-group-btn">
					             <button ng-click="getFileBodySearch(file_browser_path,keyword)" class="btn btn-default" type="button" style="height:34px;">Go!</button>
					         </span>
					       </div>
					     </div>
					     
						<div class="clearfix"></div>
					</div>
					<div class="x_content">
						<div class="row">
							<div class="col-sm-3 mail_list_colum">
								<#include "browser_list.ftl">
							</div>
							<div class="col-sm-9 mail_view">
								<div class="inbox-body">
									<#include "browser_content.ftl">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			
		</div>
	</div>
	
	<content tag="local_script">
		<#include "browser_js.ftl">
	</content>
</body>
