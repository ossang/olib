<div class="x_panel fixed_height_390">
  <div class="x_title">
    <h2>Service</h2>
    <div class="clearfix"></div>
  </div>
  <div class="x_content">
<select ng-model="selectedService" ng-options="service.name for service in serviceList" class="form-control">
</select>
<select ng-model="selectedMethod" ng-options="method.name for method in selectedService.methodList | orderBy:'name'" multiple="" class="form-control" style="height:250px;margin-top:10px;">
</select>
  </div>
</div>

