<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/usuarios" method="post">
  
	<c:if test="${not empty usuario.id}">
		<input type="hidden" name="usuario.id" value="${usuario.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		Login:<br />
	
		<input type="text" name="usuario.login" value="${usuario.login}"/>
	</div>
	
	<div class="field">
		Senha:<br />
	
		<input type="text" name="usuario.senha" value="${usuario.senha}"/>
	</div>
	
  <div class="actions">
	  <button type="submit">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/usuarios">Back</a>
