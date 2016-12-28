<div class="x_panel">
   <div class="x_content">
     <div class="" role="tabpanel" data-example-id="togglable-tabs">
       <div class="row"><ul id="resultTab" class="nav nav-tabs bar_tabs" role="tablist"></ul></div>
       <div id="resultContent" class="tab-content row"></div>
       <div class="row">
       			<button type="button" class="btn btn-info" data-toggle="modal" data-target=".filter_modal">Filter</button>
       			<#include "browser_paginate.ftl">
       </div>
       			<#include "browser_filter_modal.ftl">
     </div>
   </div>
   <input id="csrf_token" type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
 </div>