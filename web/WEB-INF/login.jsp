<%-- 
    Document   : login
    Created on : Sep 18, 2017, 4:07:19 PM
    Author     : 608964
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="index" method="post">
            <p>Username: <input type="text" name="uName" value="${userName}" /></p>
            <p>Password: <input type="text" name="pass" value="${password}" /></p>
            <p><input type="submit" value="Login" /></p>
        </form>
        ${message}
    </body>
</html>
