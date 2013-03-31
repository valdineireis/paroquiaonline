<head>
	<title>Endereco [show]</title>
</head>
<body>
	<p>
		<b>Cep:</b>
		${endereco.cep}
	</p>
	<p>
		<b>Logradouro:</b>
		${endereco.logradouro}
	</p>
	<p>
		<b>Numero:</b>
		${endereco.numero}
	</p>
	<p>
		<b>Bairro:</b>
		${endereco.bairro}
	</p>
	<p>
		<b>Cidade:</b>
		${endereco.cidade}
	</p>
	<p>
		<b>Uf:</b>
		${endereco.uf}
	</p>
	<p>
		<b>Complemento:</b>
		${endereco.complemento}
	</p>
	<p>
		<b>Localização X:</b>
		${endereco.localizacao.x}
	</p>
	<p>
		<b>Localização Y:</b>
		${endereco.localizacao.y}
	</p>

	<a href="${pageContext.request.contextPath}/enderecos/${endereco.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/enderecos">Back</a>
</body>