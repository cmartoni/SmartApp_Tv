<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SmartTv App</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<div>
		Usuário: <%=request.getAttribute("username")%>
		Modelo da TV: <%=request.getAttribute("tvModel")%>
	</div>
	<c:forEach items="${appList}" var="app">
		<img class="app-img" src="<%=request.getContextPath()%>/img/app_banner/${app.imgApp}" height="150" width="320"/>
		<c:if test="${app.installation =='1' }">
			Instalado!
		</c:if>
	</c:forEach>
	

</body>
</html>
