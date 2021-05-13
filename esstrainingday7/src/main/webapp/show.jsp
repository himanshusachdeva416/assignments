<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<title>ViewData</title>
</head>
<body>
<table border="2" width="70%" cellpadding="2">  
<tr><th>accountId</th>
	<th>accName</th>
	<th>openingbalance</th>
	</tr>
	  
   <c:forEach var="account" items="${accountdata}">   
   <tr>  
   <td>${account.accountId}</td>  
   <td>${account.accName}</td> 
   <td>${account.openingBalance}</td>
   </tr>  
   </c:forEach>  
   </table>  
</body>
</html>