
  <div class="container">

	<!-- Row having 2 columns (3,9) -->
    <div class="row">

	  <!-- Sidebar Column -->
      <div class="col-lg-3">
		<%@include file="../shared/sidebar.jsp" %>
      </div>
      <!-- /.col-lg-3 -->

	  <!-- Content Column -->
      <div class="col-lg-9">

		<div class="row">
			<!--  Breadcrumbs -->
			<div class="col-lg-">
				
				<c:if test="${userClickedCategory == true}">
					
					<ol class="breadcrumb">
						
						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">Category</li>
						<li class="active">${menuCategory.name}</li>
					
					</ol>
				</c:if>
			
			</div>
		
		
		</div>

      </div>
      <!-- /.col-lg-9 -->

    </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->

 