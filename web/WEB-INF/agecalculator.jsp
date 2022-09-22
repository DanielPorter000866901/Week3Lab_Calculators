<%-- 
    Document   : agecalculator
    Created on : 22-Sep-2022, 9:11:22 AM
    Author     : porte
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
            Enter your age: <input type="number" name="currAge" value="${currAge}" min="0" step="1"><br>
            <input type="submit" value="Age next birthday">
        </form>
        <p>${nextAge}</p>
        <p><a href="arithmetic">Arithmetic Calculator</a></p>
    </body>
</html>
