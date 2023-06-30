<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="row">&nbsp</div>
<div class="row">&nbsp</div>
<div class="row">&nbsp</div>
<div class="row">&nbsp</div>
<div class="row">&nbsp</div>
<div class="row">&nbsp</div>
<div class="row">&nbsp</div>
<div class="row">&nbsp</div>
<div class="row">&nbsp</div>
<div class="row"><p class="text-center display-3">Login</p></div>
<div class="row">&nbsp</div>

<form action=${pageContext.request.contextPath}/user/find method=post class="was-validated">
    <div class="row">
        <div class="col-2 offset-5"><input type="text" class="form-control" placeholder="username" name="username"
                                           required></div>
    </div>
    <div class="row">&nbsp</div>
    <div class="row">
        <div class="col-2 offset-5"><input type="password" class="form-control" placeholder="password" name="password"
                                           required></div>
    </div>
    <div class="row">&nbsp</div>
    <div class="row form-check form-switch">
        <div class="col-2 offset-5">
            <div class="form-check mb-3">
                <label class="form-check-label">
                    <input class="form-check-input" type="checkbox" name="remember"> Remember me
                </label>
            </div>
        </div>
        <div class="row">
            <div class="col-2 offset-5">
                <div class="row">
                    <div class="col-6"><input type="submit" class="btn text-muted" value=登录></div>
                    <div class="col-6 flex-row-reverse">
                        <a class="btn text-muted" href="${pageContext.request.contextPath}/user/newUser">注册</a></div>
                </div>
            </div>
        </div>
    </div>

</form>
</body>
</html>
