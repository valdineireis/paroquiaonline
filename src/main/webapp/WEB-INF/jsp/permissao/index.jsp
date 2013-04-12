<head>
	<title>Permissao [index]</title>
</head>
<body>
	<h1>Listing Permissaos</h1>

	<table>
		<tr>
			<th>Chave</th>
			<th>Descricao</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${permissaoList}" var="permissao">
			<tr>
				<td>${permissao.chave}</td>
				<td>${permissao.descricao}</td>
				<td><a href="${pageContext.request.contextPath}/permissaos/${permissao.id}">show</a></td>
				<td><a href="${pageContext.request.contextPath}/permissaos/${permissao.id}/edit">edit</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/permissaos/${permissao.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<a href="${pageContext.request.contextPath}/permissaos/new">New Permissao</a> 
</body>