<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="i" value="10" />
<c:catch var="e">
	<%
		int val = 10 / 0;
	%>
</c:catch>


${e}
