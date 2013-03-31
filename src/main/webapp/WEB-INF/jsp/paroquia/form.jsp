<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/paroquias" method="post">
  
	<c:if test="${not empty paroquia.id}">
		<input type="hidden" name="paroquia.id" value="${paroquia.id}"/>
		<input type="hidden" name="paroquia.endereco.id" value="${paroquia.endereco.id}"/>
		<input type="hidden" name="paroquia.endereco.localizacao.id" value="${paroquia.endereco.localizacao.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		Nome:<br />
	
		<input type="text" name="paroquia.nome" value="${paroquia.nome}"/>
	</div>
	
	<div class="field">
		Cep:<br />
	
		<input type="text" name="paroquia.endereco.cep" value="${paroquia.endereco.cep}"/>
	</div>
	
	<div class="field">
		Logradouro:<br />
	
		<input type="text" name="paroquia.endereco.logradouro" value="${paroquia.endereco.logradouro}"/>
	</div>
	
	<div class="field">
		Numero:<br />
	
		<input type="text" name="paroquia.endereco.numero" value="${paroquia.endereco.numero}"/>
	</div>
	
	<div class="field">
		Bairro:<br />
	
		<input type="text" name="paroquia.endereco.bairro" value="${paroquia.endereco.bairro}"/>
	</div>
	
	<div class="field">
		Cidade:<br />
	
		<input type="text" name="paroquia.endereco.cidade" value="${paroquia.endereco.cidade}"/>
	</div>
	
	<div class="field">
		Uf:<br />
	
		<input type="text" name="paroquia.endereco.uf" value="${paroquia.endereco.uf}"/>
	</div>
	
	<div class="field">
		Complemento:<br />
	
		<input type="text" name="paroquia.endereco.complemento" value="${paroquia.endereco.complemento}"/>
	</div>
	
	<div class="field">
		Localização X:<br />
	
		<input type="text" name="paroquia.endereco.localizacao.x" value="${paroquia.endereco.localizacao.x}"/>
	</div>
	
	<div class="field">
		Localização Y:<br />
	
		<input type="text" name="paroquia.endereco.localizacao.y" value="${paroquia.endereco.localizacao.y}"/>
	</div>
	
  <div class="actions">
	  <button type="submit">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/paroquias">Back</a>
