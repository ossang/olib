<head>
	<#include "agentui_css.ftl">
</head>
<body>
	<div ng-controller="agentui_controller" class="col-md-12">
		<div class="col-md-5">
			<#include "agentui_table.ftl">
			<#include "agentui_add.ftl">
		</div>
		<div class="col-md-7">
			<#include "agentui_command.ftl">
			<#include "agentui_result.ftl">
		</div>
	</div>
	
	<content tag="local_script">
		<#include "agentui_js.ftl">
	</content>

</body>