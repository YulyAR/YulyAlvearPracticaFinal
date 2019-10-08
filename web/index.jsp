<%-- 
    Document   : index
    Created on : 24/09/2019, 10:22:59 PM
    Author     : yuly
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesión</title>
        <script src="js/main.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>

    <body>
        <div class="container"><br>
            <h2>Iniciar Sesión</h2><br>
            <form action="iniciar" method="post" id=forminicio>
                <div class="col-sm-5">
                    <label>Identificación</label>
                    <input class="form-control" type="text" name="cc" id="txtcc" /><br>
                    <label>Contraseña</label>
                    <input class="form-control"type="password" name="contrasena" id="txtcontrasena" /><br>
                    <input class="btn btn-primary" type="button" value="Iniciar Sesión" id="btniniciar" />
                </div>
            </form>
            <br>
            ¿No tienes cuenta? <a href="registro.jsp"> Registrarse</a>
        </div><br><br>

    </body>

</html>
