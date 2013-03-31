<head>
	<title>Comunidade [show]</title>
</head>
<body>
	<p>
		<b>Nome:</b>
		${comunidade.nome}
	</p>
	<p>
		<b>Paroquia:</b>
		${comunidade.paroquia.nome}
	</p>

	<a href="${pageContext.request.contextPath}/comunidades/${comunidade.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/comunidades">Back</a>
</body>