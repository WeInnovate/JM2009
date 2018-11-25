<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="i" value="10" />
<c:set var="msg" value="This is amazing..." scope="request" />
<c:out value="${2+3+i}" />
<c:out value="${requestScope.msg}" />
<c:remove var="msg" scope="request" />
<c:out value="${requestScope.msg}" />