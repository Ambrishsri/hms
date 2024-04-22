<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="../component/allcss.jsp" %>
<style trype="text/css">
.point-card{
box-shadow:0 0 10px 0 rgba(0,0,0,0.3);}
</style>
</head>
<body>
<%@ include file="navbar.jsp" %>
<div class="container p-5">
<p class="text-center fs-3">Admin Dashboard</p>
						
<div class="row">
<div class="col-md-4">
<div class="card point-card">
<div class="card-body text-center text-success">
<i class="fas fa-user-md fa-3x"></i><br>
<p class="fs-4 text-center">Doctor<br>5
</p>


</div>
</div>
</div>

<div class="col-md-4">
<div class="card point-card">
<div class="card-body text-center text-success">
<i class="fas fa-user-md fa-3x"></i><br>
<p class="fs-4 text-center">User<br>1
</p>


</div>
</div>
</div>

<div class="col-md-4">
<div class="card point-card">
<div class="card-body text-center text-success">
<i class="fas fa-user-md fa-3x"></i><br>
<p class="fs-4 text-center">Total Appointment<br>5
</p>


</div>
</div>
</div>

<div class="col-md-4 mt-2">
<div class="card point-card" data-bs-toggle="modal" data-bs-target="#examplemodal">
<div class="card-body text-center text-success">
<i class="fas fa-calendar-check fa-3x"></i><br>
<p class="fs-4 text-center">specialist<br>53
</p>


</div>
</div>
</div>

</div>

</div>

</body>
</html>