<div class="x_panel fixed_height_430">
  <div class="x_title">
    <h2>Parameter</h2>
    <div class="clearfix"></div>
  </div>
  <div class="x_content">
  	<div ng-repeat="parameterName in selectedMethod[0].parameterNames">
	<label>{{parameterName}}</label>
   	<input ng-model="formData[parameterName]" class="form-control" placeholder="{{selectedMethod[0].parameterTypes[$index]}}" />
</div>
<br/>
<button ng-click="run(selectedService.name,selectedMethod[0].name)" id="executeBtn" type="button" class="btn btn-success">Execute</button>
<input id="csrf_token" type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
  </div>
</div>
