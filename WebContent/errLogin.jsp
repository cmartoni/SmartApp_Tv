<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mock login</title>
<link rel="stylesheet" href="css/smartStyle.css">
</head>
<body>
<div id="divCenter">
   	<h3>Login</h3>
  	
  		<table border="1" >
  				
			<tr>
				<td>
					Erro: <%=request.getAttribute("msg") %>
				 <button value="Voltar" type="button"></button> 
				</td> 
			</tr>
  		</table>
  </div>
</body>
</html>