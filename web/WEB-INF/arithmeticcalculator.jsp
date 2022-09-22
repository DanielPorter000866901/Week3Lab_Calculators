<%-- 
    Document   : arithmeticcalculator
    Created on : 22-Sep-2022, 9:46:34 AM
    Author     : porte
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            First <input type="number" name="fistNum" value="${fistNum}" step="1"><br>
            Second <input type="number" name="secondNum" value="${secondNum}" step="1"><br>
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="%">
        </form>
        <p>Result: ${output}</p>
        <p><a href="age">Age Calculator</a></p>
    </body>
</html>
