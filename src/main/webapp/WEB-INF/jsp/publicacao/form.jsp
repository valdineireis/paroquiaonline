<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/publicacoes" method="post">
  
	<c:if test="${not empty publicacao.id}">
		<input type="hidden" name="publicacao.id" value="${publicacao.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		Título:<br />
	
		<input type="text" name="publicacao.titulo" value="${publicacao.titulo}"/>
	</div>
	
	<div class="field">
		Imagem:<br />
	
		<input type="text" name="publicacao.imagem" value="${publicacao.imagem}"/>
	</div>
	
	<div class="field">
		Data e hora de publicação:<br />
	
		<input type="text" name="publicacao.dhPublicada" value="<fmt:formatDate type="both" value='${publicacao.dhPublicada.time}'/>"/>
	</div>
	
	<div class="field">
		Chamada:<br />
	
		<textarea rows="5" cols="50" name="publicacao.chamada">${publicacao.chamada}</textarea>
	</div>
	
	<div class="field">
		Conteúdo:<br />
	
		<textarea rows="10" cols="50" name="publicacao.conteudo">${publicacao.conteudo}</textarea>
	</div>
	
	<div class="field">
		Tags:<br />
	
		<input type="text" name="publicacao.tags" value="${publicacao.tags}"/>
	</div>
	
	<div class="field">
		Publicar:<br />
	
		<input type="checkbox" name="publicacao.snPublicada" <c:if test="${publicacao.snPublicada}">checked="checked"</c:if> />
	</div>
	
  <div class="actions">
	  <button type="submit">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/publicacoes">Back</a>
