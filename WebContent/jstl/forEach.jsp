<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*"%>

<%
	List<String> fruits = new ArrayList<>();
	fruits.add("Apple");
	fruits.add("Guava");
	fruits.add("Pine Aplle");
	request.setAttribute("frts", fruits);
%>


<c:forEach var="fruit" items="${requestScope.frts}">
${fruit}
</c:forEach>

<c:forEach var="i" begin="0" end="9">
${i}
</c:forEach>