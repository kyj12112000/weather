<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="regOk" method="GET">
	<input type="text" name="name" value="GET"/>
	<input type="submit" value="GET요청">
</form>
<form action="regOk" method="POST">
	<input type="text" name="name" value="POST"/>
	<input type="submit" value="POST요청">
</form>

<form action="regOk2" method="POST">
	<input type="text" name="name" value="POST-regOk2"/>
	<input type="submit" value="POST요청"/>
</form>


</body>
</html>