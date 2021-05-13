<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Data</title>
</head>
<body>
  <form action = "insertdata" method = "POST">
         Account ID: <input type = "text" name = "accountId">
         <br />
         Account Name: <input type = "text" name = "accName" />
         <br />
         Opeing Balance: <input type = "text" name = "openingBalance" />
         <input type = "submit" value = "Submit" />
      </form>
</body>
</html>