<head>
	<title>Endereco [index]</title>
</head>
<body>
	<h1>Listing Enderecos</h1>

	<table>
		<tr>
			<th>Cep</th>
			<th>Logradouro</th>
			<th>Numero</th>
			<th>Bairro</th>
			<th>Cidade</th>
			<th>Uf</th>
			<th>Complemento</th>
			<th>Localização X</th>
			<th>Localização Y</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${enderecoList}" var="endereco">
			<tr>
				<td>${endereco.cep}</td>
				<td>${endereco.logradouro}</td>
				<td>${endereco.numero}</td>
				<td>${endereco.bairro}</td>
				<td>${endereco.cidade}</td>
				<td>${endereco.uf}</td>
				<td>${endereco.complemento}</td>
				<td>${endereco.localizacao.x}</td>
				<td>${endereco.localizacao.y}</td>
				<td><a href="${pageContext.request.contextPath}/enderecos/${endereco.id}">show</a></td>
				<td><a href="${pageContext.request.contextPath}/enderecos/${endereco.id}/edit">edit</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/enderecos/${endereco.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<a href="${pageContext.request.contextPath}/enderecos/new">New Endereco</a> 
</body>