<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>학생 리스트</h2>
	<table border="1">
		<tr>
			<th>순번</th>
			<th>ID</th>
			<th>이름</th>
			<th>나이</th>
		</tr>
		<c:forEach var="student" items="${students }">
		<tr>
			<th>
				<a href="student_list.do?seq=${student.seq }">${student.seq }</a>
			</th>
			<th>${student.id }</th>
			<th>${student.name }</th>
			<th>${student.age }</th>
		</tr>
		</c:forEach>
	</table>

</body>
</html>