<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%-- <c:redirect url="https://www.google.co.in/" /> --%>

<c:url value="../login.jsp" var="failedLogin">
<c:param name="msg" value="Login failed!!! You can try after #3 hours" />
</c:url>

<c:redirect url="${failedLogin}" /> 