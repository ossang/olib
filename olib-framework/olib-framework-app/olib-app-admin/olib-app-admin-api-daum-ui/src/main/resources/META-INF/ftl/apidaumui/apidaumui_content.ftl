<div class="col-lg-12" >
	<div class="clearfix"></div>
	<div id="apimanager_main" class="col-lg-3">
	
		<div class="x-panel row">
   		 	<div class="x-title">
			    SERVICE
			</div>
			<div id="serviceType" class="x-content">
				<#include "apidaumui_serviceType.ftl">
			</div>
		</div>
		
		<div class="x-panel row">
			<div id="parameterDiv">
			 	<div class="x-panel">
				    <div class="x-title">
				        {{selectedMethod[0].name}} ({{selectedMethod[0].returnType}})
				    </div>
				    <div class="x-content">
                    	<#include "apidaumui_parameter.ftl">
				    </div>
				</div>
			</div>
		</div>
	</div>
	
	<div class="col-lg-9">
		<div id="manager_result" class="row">
			<#include "apidaumui_result.ftl">
		</div>
	</div>
</div>
    