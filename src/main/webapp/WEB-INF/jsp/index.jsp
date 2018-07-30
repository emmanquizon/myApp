<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html class="no-js" lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css">

</head>

<body>

	<div class="container">
		<form action="price" method="post" >
			<div>
				<strong>Price :</strong> <input type="text" name="price">
				<input type="submit" class="btn btn-success btn-sm" value="submit">
			</div>
		</form>
		<div class="pull-right">
			<strong>Average :</strong>
			<span>${average}</span>
		</div>
		<ul class="nav nav-tabs">
			<li class="active"><a data-toggle="tab" href="#home">Price History</a></li>
		</ul>
		<div class="tab-content">
			<div id="home" class="tab-pane fade in active">
				<table class="historyTable">
					<tr>
						<th>Timestamp</th>
						<th>Price</th>
					</tr>
					<c:forEach items="${priceList}" var="price">
					<tr>
						<td>${price.time}</td>
						<td>${price.price}</td>
					</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>

</body>
</html>
