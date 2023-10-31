 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
 
 <nav class="navbar navbar-expand-lg bg-body-tertiary" style="background-color: #e3f2fd;">
    <div class="container-fluid">
    <a class="navbar-brand" href="#">MyBus App</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/">Home</a>
        </li>
        <li class="nav-item">
         <a class="nav-link" href="<%=request.getContextPath()%>/contact">Contact</a>
        </li>
         
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/all-routes">All Routes</a>
        </li>
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
 
<%-- 
 <div class="navbar">
		<a href="<%=request.getContextPath()%>/">Home</a> <span>|</span>
		 
		<a href="<%=request.getContextPath()%>/contact">Contact</a> <span>|</span>
		<a href="<%=request.getContextPath()%>/login">Login</a> <span>|</span>
		<a href="<%=request.getContextPath()%>/sign-up">Sign Up</a> <span>|</span>
		<a href="<%=request.getContextPath()%>/all-routes">All Routes</a>
			<hr>
</div>
 --%>

 