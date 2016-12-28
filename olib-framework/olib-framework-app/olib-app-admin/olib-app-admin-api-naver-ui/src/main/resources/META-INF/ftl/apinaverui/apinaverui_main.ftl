<head>
	<#include "apinaverui_main_css.ftl">
</head>
<body>
	<div ng-controller="apimanager_main_controller" class="col-md-12">
		<div class="col-md-3">
			<#include "apinaverui_serviceType.ftl">
			<#include "apinaverui_parameter.ftl">
		</div>
		<div class="col-md-9">
			<#include "apinaverui_result.ftl">
		</div>
	</div>
	
	<content tag="local_script">
		<#include "apinaverui_js.ftl">
	</content>
</body>