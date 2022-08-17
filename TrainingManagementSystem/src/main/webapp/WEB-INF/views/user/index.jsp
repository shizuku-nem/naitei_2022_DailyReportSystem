<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<div class="container-fluid pt-4 px-4">
	<div class="row g-4">
		<div class="col-md-12 col-md-12 col-xl-12">
			<div class="h-100 bg-secondary rounded p-4">
				<div class="d-flex align-items-center justify-content-between mb-4">
					<h1>Input Form</h1>
					<form:form method="post" action="http://localhost:8080/TrainingManagementSystem/users/" modelAttribute="user">
						<br />
						<form:input path="name" />
						<br />
						<form:input path="email" />
						<br />
						<button type="submit">Submit</button>
					</form:form>

					<%-- <h2>Users List</h2>
						<table>
							<tr>
								<td><strong>Name</strong></td>
								<td><strong>Email</strong></td>
							</tr>
							<c:forEach items="${users}" var="user">
								<tr>
									<td>${user.name}</td>
									<td>${user.email}</td>
								</tr>
							</c:forEach>
						</table> --%>
				</div>
			</div>
		</div>
	</div>
</div>


