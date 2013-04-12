<head>
	<title>Usuario [index]</title>
</head>
<body>
	<h1>Listing Usuarios</h1>

	<table>
		<tr>
			<th>Login</th>
			<th>Senha</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${usuarioList}" var="usuario">
			<tr>
				<td>${usuario.login}</td>
				<td>${usuario.senha}</td>
				<td><a href="${pageContext.request.contextPath}/usuarios/${usuario.id}">show</a></td>
				<td><a href="${pageContext.request.contextPath}/usuarios/${usuario.id}/edit">edit</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/usuarios/${usuario.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<a href="${pageContext.request.contextPath}/usuarios/new">New Usuario</a> 
</body>