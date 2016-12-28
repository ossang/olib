<div class="modal fade filter_modal in" tabindex="-1" role="dialog" aria-hidden="true" style="display: none; padding-right: 15px;">
  <div class="modal-dialog">
    <div class="modal-content">

      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span>
        </button>
        <h4 class="modal-title" id="myModalLabel2">Custom Filter Serach</h4>
      </div>
      <div class="modal-body">
		<form id="" class="form-horizontal form-label-left" >
              <div class="form-group">
                <label class="control-label col-md-3 col-sm-3 col-xs-12">Keyword </label>
                <div class="col-md-8 col-sm-6 col-xs-12">
                  <input ng-model="filterKeyword" type="text" class="form-control col-md-7 col-xs-12">
                </div>
              </div>
              <div class="form-group">
                <label class="control-label col-md-3 col-sm-3 col-xs-12">Date Format </label>
                <div class="col-md-8 col-sm-6 col-xs-12">
                  <input ng-model="filterDateFormat" type="text" class="form-control col-md-7 col-xs-12">
                </div>
              </div>
              <div class="form-group">
                <label class="control-label col-md-3 col-sm-3 col-xs-12">Date Start </label>
                <div class="col-md-8 col-sm-6 col-xs-12">
                  <input ng-model="filterDateStart" type="text" class="form-control col-md-7 col-xs-12">
                </div>
              </div>
              <div class="form-group">
                <label class="control-label col-md-3 col-sm-3 col-xs-12">Date End </label>
                <div class="col-md-8 col-sm-6 col-xs-12">
                  <input ng-model="filterDateEnd" type="text" class="form-control col-md-7 col-xs-12">
                </div>
              </div>
              <div class="form-group">
                <div class="col-md-12 col-sm-6 col-xs-12">
                 <table class="table">
				   <thead>
				     <tr>
				       <th></th>
				       <th>Target</th>
				       <th>Replace</th>
				     </tr>
				   </thead>
				   <tbody>
				   		<tr>
				   			<td><i ng-click="addReplaceMap()" class="fa fa-plus-circle" aria-hidden="true" style="color:green;font-size:25px;cursor:hand;"></i></td>
				   			<td><input ng-model="filterTarget" type="text" class=""></td>
				   			<td><input ng-model="filterReplace" type="text" class=""></td>
				   		</tr>
				   		<tr ng-repeat="(key,value) in replaceMap">
				   			<td><i ng-click="removeReplaceMap(key)" class="fa fa-minus-circle" aria-hidden="true" style="color:red;font-size:25px;cursor:hand;"></i></td>
				   			<td> {{key}}</td>
				   			<td> {{value}} </td>
				   		</tr>
				   </tbody>
				 </table>
                </div>
              </div>
            </form>
        
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
        <button ng-click="customFilterSearch()" type="button" class="btn btn-success" data-dismiss="modal">Search</button>
      </div>

    </div>
  </div>
</div>