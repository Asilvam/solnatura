<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta  charset=UTF-8">
        <title>Formulario Usuario</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
    </head>
    <body>
        <div class="container">
            <ol class="breadcrumb">
                <li><a href="usuariomant.htm" >Listado de Usuarios</a></li>
                <li class="active">Agregar</li>
            </ol>
            <div class="panel panel-primary">
                <div class="panel-heading">Agregar nuevo Usuario</div>
                <div class="panel-body">
                   
                        <form:form method="post" commandName="usuario">                    
                           <form:errors path="*" element="div" cssClass="alert alert-danger"/> 
                            <p>
                                <form:label path="user">User</form:label>
                                <form:input path="user" cssClass="form-control"/>
                            </p> 
                            <p>
                                <form:label path="pass">Password</form:label>              
                                <form:password path="pass" cssClass="form-control"/>
                            </p>
                            <p>
                                <form:label path="tipo">Tipo</form:label>
                                <form:select path="tipo" cssClass="form-control">
                                    <form:option value="Z">Seleccione.....</form:option>
                                    <form:options items="${tipolista}" />
                                </form:select>
                            </p>
                            <p>
                                <form:label path="email">email</form:label>
                                <form:input path="email" cssClass="form-control" />
                            </p>
                            <hr />
                            <input type="submit" value="Enviar" class="form-control" />    
                        </form:form>
                </div>
            </div>
        </div>
    </body>
</html>
