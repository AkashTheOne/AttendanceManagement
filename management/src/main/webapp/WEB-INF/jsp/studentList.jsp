<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
<link rel="stylesheet" href="/css/studentList.css" />
<script src="/js/index.js"></script>
</head>
<body>
	<section>
		<div>
			<table>
				<thead>
					<tr>
						<th>Roll NO.</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email ID</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="student" items="${students}">
						<tr>
							<td>${student.ROLLNO}</td>
							<td>${student.FIRSTNAME}</td>
							<td>${student.LASTNAME}</td>
							<td>${student.EMAILID}</td>
							<td><a href="#" onclick="onEditData(${student.ROLLNO})">Edit</a> | <a href="#">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</section>
</body>
</html>
