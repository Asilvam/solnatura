<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>Listado Usuarios</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h1>Listado de Usuarios</h1>
                <p>
                    <a href="<c:url value="usuarioform.htm" />" class="btn btn-success"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar</a>
                </p>
                <table class="table table-bordered table-striped table-hover">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>User</th>
                            <th>Pass</th>
                            <th>Tipo</th>
                            <th>Email</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${datos}" var="dato">
                            <tr>
                                <td><c:out value="${dato.id}" /></td>
                                <td><c:out value="${dato.user}" /></td>
                                <td><c:out value="${dato.pass}" /></td>
                                <td><c:out value="${dato.tipo}" /></td>
                                <td><c:out value="${dato.email}" /></td>
                                <td>
                                <a href="<c:url value="usuarioedit.htm?id=${dato.id}" />"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a>
                                <a href="<c:url value="usuariodelete.htm?id=${dato.id}" />"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            
        </div>
    </body>
</html>
