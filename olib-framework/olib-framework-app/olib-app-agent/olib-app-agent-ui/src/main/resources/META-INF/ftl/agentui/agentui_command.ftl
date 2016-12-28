<div class="x_panel">
	<div class="x_title">
		<h2><i class="fa fa-terminal" aria-hidden="true"></i> Commands</h2>
		<div class="clearfix"></div>
	</div>
	<div class="x_content">
		<table class="table table-striped jambo_table bulk_action" style="width: 100%">
			<thead>
				<tr>
					<th style="width: 5%;">NO</th>
					<th>COMMAND</th>
					<th style="width: 5%;">RUN</th>
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat = "command in commandList">
					<td>{{$index+1}}</td>
					<td>{{command}}</td>
					<td><button ng-click="runAgent(command)" type="button" class="btn btn-success"><i class="fa fa-play" aria-hidden="true"></i></button></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>