<head>
	<title>Permissao [show]</title>
</head>
<body>
	<p>
		<b>Chave:</b>
		${permissao.chave}
	</p>
	<p>
		<b>Descricao:</b>
		${permissao.descricao}
	</p>

	<a href="${pageContext.request.contextPath}/permissaos/${permissao.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/permissaos">Back</a>
</body>