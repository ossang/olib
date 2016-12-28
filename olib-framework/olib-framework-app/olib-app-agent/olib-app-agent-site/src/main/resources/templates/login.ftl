<head>
	<link href="/agent/webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
	<link href="/agent/webjars/font-awesome/4.6.1/css/font-awesome.min.css" rel="stylesheet">
	<link href="/agent/webjars/gentelella/1.3.0/vendors/animate.css/animate.min.css" rel="stylesheet">
	<link href="/agent/webjars/gentelella/1.3.0/build/css/custom.min.css" rel="stylesheet">
	<link rel="SHORTCUT ICON" href="">
</head>
<body class="login">
	<div>
      <a class="hiddenanchor" id="signup"></a>
      <a class="hiddenanchor" id="signin"></a>
      <div class="login_wrapper">
        <div class="animate form login_form">
          <section class="login_content">
            <form role="form" action="/agent/login" method="POST">
              <h1>Login</h1>
              <div>
                <input name="username" type="text" class="form-control" placeholder="Username" required="">
              </div>
              <div>
                <input name="password" type="password" class="form-control" placeholder="Password" required="">
              </div>
              <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
              <div>
              	<input type="submit" value="Log in" class="btn btn-default submit" style="margin-left:145px;"></>
              </div>

              <div class="clearfix"></div>

              <div class="separator">
                <div>
                  <h1><i class="fa fa-paw"></i> OLibrary</h1>
                </div>
              </div>
            </form>
          </section>
        </div>
</body>