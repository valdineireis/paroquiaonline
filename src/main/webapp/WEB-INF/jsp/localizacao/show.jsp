<head>
	<title>Localizacao [show]</title>
</head>
<body>
	<p>
		<b>X:</b>
		${localizacao.x}
	</p>
	<p>
		<b>Y:</b>
		${localizacao.y}
	</p>

	<a href="${pageContext.request.contextPath}/localizacoes/${localizacao.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/localizacoes">Back</a>
</body>