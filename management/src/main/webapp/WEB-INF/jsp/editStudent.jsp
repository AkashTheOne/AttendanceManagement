<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
	<c:when test="${editdataMap == 'data'}">
		<div class="box">
			<form>
				<table class="tablecss">
					<h1>Update Student</h1>
					<c:forEach var="students" items="${students}">
						<tr>
							<td>Roll NO :</td>
							<td><input type="text" name="rollNo" id="rollNo"
								placeholder="Enter your Roll No" value="${students.ROLLNO}"
								autocomplete="off" onkeyup="return checkRollNo()" /></td>
						</tr>
						<tr>
							<td>First Name :</td>
							<td><input type="text" name="firstName" id="firstName"
								placeholder="Enter your First name"
								value="${students.FIRSTNAME}" autocomplete="off" /></td>
						</tr>
						<tr>
							<td>Last Name :</td>
							<td><input type="text" name="lastName" id="lastName"
								placeholder="Enter your Last name" value="${students.LASTNAME}"
								autocomplete="off" /></td>
						</tr>
						<tr>
							<td>Email Id :</td>
							<td><input type="text" name="emailId" id="emailId"
								placeholder="Enter your Email" value="${students.EMAILID}"
								autocomplete="off" /></td>
						</tr>
						<tr>
							<td>
								<button type="button" value="Update" onclick="onUpdateData()">Update</button>
							</td>
							<td><button type="button" value="Back"
									onclick="return onClickBack()">Back</button></td>
						</tr>
					</c:forEach>
				</table>
			</form>
		</div>
	</c:when>
	<c:when test="${dataMap == 'data'}">
		<div style="text-align: center; padding: 8%; box-shadow: 1px 8px 27px 2px cornflowerblue; width: 44%;
    				font-size: 34px; margin: auto; margin-top: 120px;">
			<p id="updateData">${updateDataMap}</p>
		</div>
	</c:when>
</c:choose>