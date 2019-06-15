<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>登录页面</title>
<meta http-equiv=Content-Type content="text/html; charset=utf-8">
<link href="${pageContext.request.contextPath}/css/style.css"
	   type=text/css rel=stylesheet>
<link href="${pageContext.request.contextPath}/css/boot-crm.css"
	   type=text/css rel=stylesheet>
<script src=
       "${pageContext.request.contextPath}/js/jquery-1.11.3.min.js">
</script>
<meta content="MSHTML 6.00.2600.0" name=GENERATOR>
<script>
// 判断是登录账号和密码是否为空
function check(){
    var usercode = $("#usercode").val();
    var password = $("#password").val();
    if(usercode=="" || password==""){
    	$("#message").text("账号或密码不能为空！");
        return false;
    }  
    return true;
}

</script>
<style type="text/css">
	#content {
		margin: 0 auto;
		padding-top: 50px;
	}
</style>
</head>
<body style="background-color:#FFFFF0 ">
<div ALIGN="center">
		<div style="font-size: 30px;font-family: 宋体;font-weight: 900">欢迎使用用户管理系统</div>
		<div id="content">
			<form action="${pageContext.request.contextPath }/login.action" 
			                       method="post" onsubmit="return check()">
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br /><br />
	          账&nbsp;号：<input id="usercode" type="text" name="usercode" style="width: 156px;"/>
	          <br /><br />
	          密&nbsp;码：<input id="password" type="password" name="password" style="width: 156px; "/>
	          <br /><br />
	          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	          <center><input type="submit" value="登录" /></center>
		 </form>
		</div>

</div>
</body>
</html>
