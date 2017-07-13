<html>
<body>
<h2>Hello World!</h2>
	<form action=" ${pageContext.request.contextPath}/login.action" method="POST">
		<input type ="text" name = "username"/>
		<input type = "password" name ="password">
		<input type="submit">
	</form>
</body>
</html>
