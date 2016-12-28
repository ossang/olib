<head>
	<#include "apidaumui_main_css.ftl">
</head>
<body>
	<div ng-controller="apimanager_main_controller" class="col-md-12">
		<div class="col-md-3">
			<#include "apidaumui_serviceType.ftl">
			<#include "apidaumui_parameter.ftl">
		</div>
		<div class="col-md-9">
			<#include "apidaumui_result.ftl">
		</div>
	</div>
	
	<content tag="local_script">
		<#include "apidaumui_js.ftl">
	</content>
</body>