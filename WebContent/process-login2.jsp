<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${param.userName eq param.password}">
	<jsp:forward page="profile">
		<jsp:param value="Login Successful from JSP !!!" name="msg" />
	</jsp:forward>
</c:if>