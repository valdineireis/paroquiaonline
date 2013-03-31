<head>
	<title>Paroquia [index]</title>
</head>
<body>
	<h1>Listing Paroquias</h1>

	<table>
		<tr>
			<th>Nome</th>
			<th>Endereço [cep]</th>
			<th>Localização [x]</th>
			<th>Localização [y]</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${paroquiaList}" var="paroquia">
			<tr>
				<td>${paroquia.nome}</td>
				<td>${paroquia.endereco.cep}</td>
				<td>${paroquia.endereco.localizacao.x}</td>
				<td>${paroquia.endereco.localizacao.y}</td>
				<td><a href="${pageContext.request.contextPath}/paroquias/${paroquia.id}">show</a></td>
				<td><a href="${pageContext.request.contextPath}/paroquias/${paroquia.id}/edit">edit</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/paroquias/${paroquia.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<a href="${pageContext.request.contextPath}/paroquias/new">New Paroquia</a> 
</body>