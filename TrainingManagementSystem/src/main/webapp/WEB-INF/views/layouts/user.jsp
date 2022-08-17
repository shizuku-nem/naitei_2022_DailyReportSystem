<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
    <title>TMS</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="keywords">
    <meta content="" name="description">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="<c:url value="/assets/user/css/bootstrap.min.css"/>" rel="stylesheet">

    <!-- Template Stylesheet -->

    <link href="<c:url value="/assets/user/css/style.css"/>" rel="stylesheet">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&family=Roboto:wght@500;700&display=swap" rel="stylesheet"> 
    
    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="<c:url value="/assets/user/lib/owlcarousel/assets/owl.carousel.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/assets/user/lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css"/>" rel="stylesheet">
<head/>

<div class="container-fluid position-relative d-flex p-0">
	<%@ include file="/WEB-INF/views/layouts/user/spinner.jsp" %>
	<%@ include file="/WEB-INF/views/layouts/user/sidebar.jsp"%>
	<div class="content">
		<%@ include file="/WEB-INF/views/layouts/user/navbar.jsp"%>
		<decorator:body />
	</div>
</div>

<div>
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
	<script src="<c:url value="/assets/user/lib/easing/easing.min.js"/>"></script>
	<script src="<c:url value="/assets/user/lib/waypoints/waypoints.min.js"/>"></script>
	<script src="<c:url value="/assets/user/lib/owlcarousel/owl.carousel.min.js"/>"></script>
	<script src="<c:url value="/assets/user/lib/tempusdominus/js/moment.min.js"/>"></script>
	<script src="<c:url value="/assets/user/lib/tempusdominus/js/moment-timezone.min.js"/>"></script>
	<script src="<c:url value="/assets/user/lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"/>"></script>
	<script src="<c:url value="/assets/user/js/main.js"/>"></script>
	
</div>
