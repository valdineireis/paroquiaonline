<head>
	<title>Publicacao [show]</title>
</head>
<body>
	<p>
		<b>Titulo:</b>
		${publicacao.titulo}
	</p>
	<p>
		<b>Chamada:</b>
		${publicacao.chamada}
	</p>
	<p>
		<b>Conteudo:</b>
		${publicacao.conteudo}
	</p>
	<p>
		<b>Dh criada:</b>
		<fmt:formatDate value="${publicacao.dhCriada.time}"/>
	</p>
	<p>
		<b>Dh publicada:</b>
		<fmt:formatDate value="${publicacao.dhPublicada.time}"/>
	</p>
	<p>
		<b>Sn publicada:</b>
		${publicacao.snPublicada}
	</p>
	<p>
		<b>Imagem:</b>
		${publicacao.imagem}
	</p>

	<a href="${pageContext.request.contextPath}/publicacoes/${publicacao.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/publicacoes">Back</a>
</body>