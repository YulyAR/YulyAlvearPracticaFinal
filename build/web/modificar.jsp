<%-- 
    Document   : modificar
    Created on : 6/10/2019, 12:37:55 PM
    Author     : yuly
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <div class="container"><br>
            <h2>Ingresar datos</h2><br> 
            <form action="cambiar" method="post">
                <div class="col-sm-5">           
                    <label>Nombre</label>
                    <input class="form-control" type="text" name="nombre"/><br>      
                    <label>Apellido</label>
                    <input class="form-control" type="text" name="apellido"/><br>            
                    <label>CC</label>
                    <input class="form-control" type="text" name="cc"/><br>
                    <label>Telefono</label>
                    <input class="form-control" type="text" name="telefono"/><br>
                    <label>Correo</label>
                    <input class="form-control" type="text" name="correo"/><br>
                    <label>Contraseña</label>
                    <input class="form-control" type="password" name="contrasena"/><br>            
                    <input class="btn btn-primary" type="submit" value="Modificar Usuario" />
                </div><br><br>
            </form>
            Volver al inicio <a href="principal.jsp"> Volver</a><br><br><br>
        </div>

    </body>
</html>