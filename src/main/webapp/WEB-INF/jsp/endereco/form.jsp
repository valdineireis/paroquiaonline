<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/enderecos" method="post">
  
	<c:if test="${not empty endereco.id}">
		<input type="hidden" name="endereco.id" value="${endereco.id}"/>
		<input type="hidden" name="endereco.localizacao.id" value="${endereco.localizacao.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		Cep:<br />
	
		<input type="text" name="endereco.cep" value="${endereco.cep}"/>
	</div>
	
	<div class="field">
		Logradouro:<br />
	
		<input type="text" name="endereco.logradouro" value="${endereco.logradouro}"/>
	</div>
	
	<div class="field">
		Numero:<br />
	
		<input type="text" name="endereco.numero" value="${endereco.numero}"/>
	</div>
	
	<div class="field">
		Bairro:<br />
	
		<input type="text" name="endereco.bairro" value="${endereco.bairro}"/>
	</div>
	
	<div class="field">
		Cidade:<br />
	
		<input type="text" name="endereco.cidade" value="${endereco.cidade}"/>
	</div>
	
	<div class="field">
		Uf:<br />
	
		<input type="text" name="endereco.uf" value="${endereco.uf}"/>
	</div>
	
	<div class="field">
		Complemento:<br />
	
		<input type="text" name="endereco.complemento" value="${endereco.complemento}"/>
	</div>
	
	<div class="field">
		Localização X:<br />
	
		<input type="text" name="endereco.localizacao.x" value="${endereco.localizacao.x}"/>
	</div>
	
	<div class="field">
		Localização Y:<br />
	
		<input type="text" name="endereco.localizacao.y" value="${endereco.localizacao.y}"/>
	</div>
	
  <div class="actions">
	  <button type="submit">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/enderecos">Back</a>
