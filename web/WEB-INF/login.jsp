<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />

<h1>Login</h1>
    <form action="index" method="post">
        <p>Username: <input type="text" name="uName" value="${user.username}" /></p>
        <p>Password: <input type="text" name="pass" value="${user.password}" /></p>
        <p><input type="submit" value="Login" /></p>
    </form>
${message}

<c:import url="/includes/footer.html" />