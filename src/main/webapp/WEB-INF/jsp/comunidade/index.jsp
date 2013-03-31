<head>
	<title>Comunidade [index]</title>
</head>
<body>
	<h1>Listing Comunidades</h1>

	<table>
		<tr>
			<th>Nome</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${comunidadeList}" var="comunidade">
			<tr>
				<td>${comunidade.nome}</td>
				<td><a href="${pageContext.request.contextPath}/comunidades/${comunidade.id}">show</a></td>
				<td><a href="${pageContext.request.contextPath}/comunidades/${comunidade.id}/edit">edit</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/comunidades/${comunidade.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<a href="${pageContext.request.contextPath}/comunidades/new">New Comunidade</a> 
</body>