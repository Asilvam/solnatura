
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultados de Usuario</h1>
        <ul>
            <li>User : <c:out value="${user}" /></li>
            <li>Pass : <c:out value="${pass}" /></li>
            <li>Tipo : <c:out value="${tipo}" /></li>
            <li>Email : <c:out value="${email}" /></li>
        </ul>      
    </body>
</html>
