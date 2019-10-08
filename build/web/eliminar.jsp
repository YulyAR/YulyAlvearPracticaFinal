<%-- 
    Document   : eliminar
    Created on : 4/10/2019, 09:48:09 PM
    Author     : yuly
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Usuario</title>
        <script src="js/main.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>

    <body>
        <div class="container"><br>
            <h2>Eliminar Usuario</h2><br>
            <form action="suprimir" method="post">
                <div class="col-sm-5">
                    <label>Identificación</label>
                    <input class="form-control" type="text" name="cc"/><br>
                    <input class="btn btn-primary" type="submit" value="Eliminar Usuario" />
                </div>
            </form>
            <br>
            Volver al inicio <a href="principal.jsp"> Volver</a>
        </div><br><br>

    </body>

</html>
