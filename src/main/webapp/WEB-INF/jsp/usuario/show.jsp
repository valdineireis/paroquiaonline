<head>
	<title>Usuario [show]</title>
</head>
<body>
	<p>
		<b>Login:</b>
		${usuario.login}
	</p>
	<p>
		<b>Senha:</b>
		${usuario.senha}
	</p>

	<a href="${pageContext.request.contextPath}/usuarios/${usuario.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/usuarios">Back</a>
</body>