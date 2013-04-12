<head>
	<title>Perfil [show]</title>
</head>
<body>
	<p>
		<b>Nome:</b>
		${perfil.nome}
	</p>

	<a href="${pageContext.request.contextPath}/perfils/${perfil.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/perfils">Back</a>
</body>