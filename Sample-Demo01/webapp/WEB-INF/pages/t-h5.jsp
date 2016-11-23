<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test</title>
<link href="../css/bootstrap.min.css" rel="stylesheet"></link>
<script src="../js/jquery.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>信息传递为： ${message}</h2>
		
		<mvc:label path="message">lala</mvc:label>
		<mvc:select path="message">
			<mvc:option value="0">--Select--</mvc:option>
			<mvc:option value="1">option1</mvc:option>
			<mvc:option value="2" cssStyle="color:red;">${message}</mvc:option>
		</mvc:select>
		
		<div class="container">
			<div class="row clearfix">
				<div class="col-md-6 column">
					<h3>
						h3. 这是一套可视化布局系统.
					</h3>
				</div>
				<div class="col-md-6 column">
					<h3>
						h3. 这是一套可视化布局系统.
					</h3>
				</div>
			</div>
		</div>
	</div>
</body>
</html>