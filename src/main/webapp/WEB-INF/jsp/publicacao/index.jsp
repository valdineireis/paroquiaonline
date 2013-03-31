<head>
	<title>Publicacao [index]</title>
</head>
<body>
	<h1>Listing publicacoes</h1>

	<table>
		<tr>
			<th>Titulo</th>
			<th>Chamada</th>
			<th>Conteudo</th>
			<th>Dh criada</th>
			<th>Dh publicada</th>
			<th>Sn publicada</th>
			<th>Imagem</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${publicacaoList}" var="publicacao">
			<tr>
				<td>${publicacao.titulo}</td>
				<td>${publicacao.chamada}</td>
				<td>${publicacao.conteudo}</td>
				<td><fmt:formatDate value="${publicacao.dhCriada.time}"/></td>
				<td><fmt:formatDate value="${publicacao.dhPublicada.time}"/></td>
				<td>${publicacao.snPublicada ? 'Sim' : 'Não'}</td>
				<td>${publicacao.imagem}</td>
				<td><a href="${pageContext.request.contextPath}/publicacoes/${publicacao.id}">show</a></td>
				<td><a href="${pageContext.request.contextPath}/publicacoes/${publicacao.id}/edit">edit</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/publicacoes/${publicacao.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<a href="${pageContext.request.contextPath}/publicacoes/new">New Publicacao</a> 
</body>