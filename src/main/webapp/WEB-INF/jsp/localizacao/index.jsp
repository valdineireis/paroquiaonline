<head>
	<title>Localizacao [index]</title>
</head>
<body>
	<h1>Listing Localizacoes</h1>

	<table>
		<tr>
			<th>X</th>
			<th>Y</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${localizacaoList}" var="localizacao">
			<tr>
				<td>${localizacao.x}</td>
				<td>${localizacao.y}</td>
				<td><a href="${pageContext.request.contextPath}/localizacoes/${localizacao.id}">show</a></td>
				<td><a href="${pageContext.request.contextPath}/localizacoes/${localizacao.id}/edit">edit</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/localizacoes/${localizacao.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<a href="${pageContext.request.contextPath}/localizacoes/new">New Localizacao</a> 
</body>