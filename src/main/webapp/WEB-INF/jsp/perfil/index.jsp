<head>
	<title>Perfil [index]</title>
</head>
<body>
	<h1>Listing Perfils</h1>

	<table>
		<tr>
			<th>Nome</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${perfilList}" var="perfil">
			<tr>
				<td>${perfil.nome}</td>
				<td><a href="${pageContext.request.contextPath}/perfils/${perfil.id}">show</a></td>
				<td><a href="${pageContext.request.contextPath}/perfils/${perfil.id}/edit">edit</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/perfils/${perfil.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<a href="${pageContext.request.contextPath}/perfils/new">New Perfil</a> 
</body>