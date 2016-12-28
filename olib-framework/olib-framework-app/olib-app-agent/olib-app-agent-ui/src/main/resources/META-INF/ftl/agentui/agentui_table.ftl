<div class="x_panel">
	<div class="x_title">
		<h2><i class="fa fa-desktop" aria-hidden="true"></i> Agents</h2>
		<div class="clearfix"></div>
	</div>
	<div class="x_content">
		<table class="table jambo_table bulk_action" style="width: 100%">
			<thead>
				<tr>
					<th style="width: 5%;"><i class="fa fa-check-square-o" aria-hidden="true" style="cursor: hand;"></i></th>
					<th style="width: 5%;">NO</th>
					<th style="width: 30%;">AGENT ID</th>
					<th style="width: 30%;">IP</th>
					<th style="width: 20%;">Memo</th>
					<th style="width: 10%;">Status</th>
					<th style="width: 10%;">x</th>
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat="agent in agentList"
					ng-click="selectAgent($index, agent)"
					id="agent_row_{{$index}}"
			      	class="agent_row"
			      	style="cursor:pointer"
				>
					<td class="a-center ">
			      		<i id="agent_row_check_{{$index}}" class="agent_row_icon" aria-hidden="false"></i>
                    </td>
					<td>{{$index+1}}</td>
					<td>{{agent.agentId}}</td>
					<td>{{agent.ip}}</td>
					<td>{{agent.memo}}</td>
					<td>{{agent.status}}</td>
					<td><i ng-click="deleteAgent(agent.agentId)" class="fa fa-trash" aria-hidden="true" style="cursor: hand;"></i></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>

