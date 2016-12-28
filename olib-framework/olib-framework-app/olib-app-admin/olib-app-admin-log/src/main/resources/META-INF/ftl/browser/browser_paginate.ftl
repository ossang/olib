<div id="content_pagination_area">
	<ul class="pagination">
		<li class="paginate_button previous" id="datatable_previous">
			<a ng-click="getPaginationPage(file_browser_path,1)" aria-controls="datatable" data-dt-idx="0" tabindex="0">
				First
			</a>
		</li>
		
		<li class="paginate_button previous" id="datatable_previous">
			<a ng-click="getPaginationPage(file_browser_path,tabCurrentPage[selectTabIndex]-1)" aria-controls="datatable" data-dt-idx="0" tabindex="0">
				Back
			</a>
		</li>
		
		<li class="paginate_button">
			<a aria-controls="datatable" data-dt-idx="1" tabindex="0">
			{{tabCurrentPage[selectTabIndex]}}
			</a>
		</li>
		<li class="paginate_button active">
			<a aria-controls="datatable" data-dt-idx="2" tabindex="0">
			/
			</a>
		</li>
		<li class="paginate_button ">
			<a aria-controls="datatable" data-dt-idx="3" tabindex="0">
			{{tabTotalPage[selectTabIndex]}}
			</a>
		</li>
		
		
		<li class="paginate_button next" id="datatable_next">
			<a ng-click="getPaginationPage(file_browser_path,tabCurrentPage[selectTabIndex]+1)" aria-controls="datatable" data-dt-idx="7" tabindex="0">
				Forward
			</a>
		</li>
		<li class="paginate_button next" id="datatable_next">
			<a ng-click="getPaginationPage(file_browser_path,tabTotalPage[selectTabIndex])" aria-controls="datatable" data-dt-idx="7" tabindex="0">
			End
			</a>
		</li>
	</ul>
</div>
