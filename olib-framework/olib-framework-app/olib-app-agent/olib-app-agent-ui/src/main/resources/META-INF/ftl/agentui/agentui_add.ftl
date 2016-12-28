<div class="x_panel fixed_height_430">
  <div class="x_title">
    <h2><i class="fa fa-floppy-o" aria-hidden="true"></i> Add Agent</h2>
    <div class="clearfix"></div>
  </div>
  <div class="x_content">
  	<div>
		<label>AGENT ID</label>
   		<input ng-model="agentId" class="form-control" placeholder="" />
	</div>
  	<div>
		<label>IP</label>
   		<input ng-model="ip" class="form-control" placeholder="" />
	</div>
  	<div>
		<label>MEMO</label>
   		<input ng-model="memo" class="form-control" placeholder="" />
	</div>
	<br/>
	<button ng-click="addAgent(agentId, ip, memo)" type="button" class="btn btn-success">ADD</button>
	<input id="csrf_token" type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
  </div>
</div>
