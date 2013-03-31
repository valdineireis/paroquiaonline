<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/comunidades" method="post">
  
	<c:if test="${not empty comunidade.id}">
		<input type="hidden" name="comunidade.id" value="${comunidade.id}"/>
		<input type="hidden" name="comunidade.endereco.id" value="${comunidade.endereco.id}"/>
		<input type="hidden" name="comunidade.endereco.localizacao.id" value="${comunidade.endereco.localizacao.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		Paroquias:<br />
	
		<select name="comunidade.paroquia.id">
			<option value="">Selecione uma paroquia ..........</option>
			<c:forEach items="${paroquiaList}" var="paroquia">
				<option value="${paroquia.id}"
					<c:if test="${paroquia.id eq comunidade.paroquia.id}">selected="selected"</c:if>
				>${paroquia.nome}</option>
			</c:forEach>
		</select>
	</div>

	<div class="field">
		Nome:<br />
	
		<input type="text" name="comunidade.nome" value="${comunidade.nome}"/>
	</div>
	
	<div class="field">
		Cep:<br />
	
		<input type="text" name="comunidade.endereco.cep" value="${comunidade.endereco.cep}"/>
	</div>
	
	<div class="field">
		Logradouro:<br />
	
		<input type="text" name="comunidade.endereco.logradouro" value="${comunidade.endereco.logradouro}"/>
	</div>
	
	<div class="field">
		Numero:<br />
	
		<input type="text" name="comunidade.endereco.numero" value="${comunidade.endereco.numero}"/>
	</div>
	
	<div class="field">
		Bairro:<br />
	
		<input type="text" name="comunidade.endereco.bairro" value="${comunidade.endereco.bairro}"/>
	</div>
	
	<div class="field">
		Cidade:<br />
	
		<input type="text" name="comunidade.endereco.cidade" value="${comunidade.endereco.cidade}"/>
	</div>
	
	<div class="field">
		Uf:<br />
	
		<input type="text" name="comunidade.endereco.uf" value="${comunidade.endereco.uf}"/>
	</div>
	
	<div class="field">
		Complemento:<br />
	
		<input type="text" name="comunidade.endereco.complemento" value="${comunidade.endereco.complemento}"/>
	</div>
	
	<div class="field">
		Localização X:<br />
	
		<input type="text" name="comunidade.endereco.localizacao.x" value="${comunidade.endereco.localizacao.x}"/>
	</div>
	
	<div class="field">
		Localização Y:<br />
	
		<input type="text" name="comunidade.endereco.localizacao.y" value="${comunidade.endereco.localizacao.y}"/>
	</div>
	
  <div class="actions">
	  <button type="submit">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/comunidades">Back</a>
