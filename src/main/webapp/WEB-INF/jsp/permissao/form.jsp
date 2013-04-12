<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/permissaos" method="post">
  
	<c:if test="${not empty permissao.id}">
		<input type="hidden" name="permissao.id" value="${permissao.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		Chave:<br />
	
		<input type="text" name="permissao.chave" value="${permissao.chave}"/>
	</div>
	
	<div class="field">
		Descricao:<br />
	
		<input type="text" name="permissao.descricao" value="${permissao.descricao}"/>
	</div>
	
  <div class="actions">
	  <button type="submit">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/permissaos">Back</a>
