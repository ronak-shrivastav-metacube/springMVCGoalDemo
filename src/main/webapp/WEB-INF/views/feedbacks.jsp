<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Feedback</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="container-fluid bg-danger">
		<h2 class="text-center m-5 text-light">Feedbacks List</h2>
		<div class="row">
			<div class="col-12">
				<table class="shawdow-lg table table-sm table-hover text-light">
					<thead class="bg-success text-center">
						<tr>
							<th>#</th>
							<th>Heading</th>
							<th>Feedback</th>
						</tr>
					</thead>
					<thead>
						<c:forEach items="${feedbacks}" var="feedback">
							<tr style="text-align: center">
								<td scope="row">
									<p>${feedback.getId()}</p>
								</td>
								<td scope="row">
									<p>${feedback.getTitle()}</p>
								</td>
								<td scope="row">
									<p>${feedback.getContent()}</p>
								</td>
							</tr>
						</c:forEach>
					</thead>
				</table>
			</div>
		</div>

	</div>

</body>
</html>