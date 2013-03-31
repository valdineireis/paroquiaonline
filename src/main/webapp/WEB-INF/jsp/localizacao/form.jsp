<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/localizacoes" method="post">
  
	<c:if test="${not empty localizacao.id}">
		<input type="hidden" name="localizacao.id" value="${localizacao.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		X:<br />
	
		<input type="text" name="localizacao.x" value="${localizacao.x}"/>
	</div>
	
	<div class="field">
		Y:<br />
	
		<input type="text" name="localizacao.y" value="${localizacao.y}"/>
	</div>
	
  <div class="actions">
	  <button type="submit">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/localizacoes">Back</a>
