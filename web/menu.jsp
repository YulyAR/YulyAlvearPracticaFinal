<%-- 
    Document   : menu
    Created on : 24/09/2019, 11:14:38 PM
    Author     : yuly
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    HttpSession objsesion = request.getSession(false);
    String usuario = (String) objsesion.getAttribute("cc");
    if (usuario.equals("")) {
        response.sendRedirect("index.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Menu Usuario</title>
        <!-- Font Awesome Icons -->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Merriweather+Sans:400,700" rel="stylesheet">
        <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic' rel='stylesheet' type='text/css'>

        <!-- Plugin CSS -->
        <link href="vendor/magnific-popup/magnific-popup.css" rel="stylesheet">

        <!-- Theme CSS - Includes Bootstrap -->
        <link href="css/creative.min.css" rel="stylesheet">


    </head>
    <body id="page-top">

        <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-light fixed-top py-3" id="mainNav">
            <div class="container">
                <a class="navbar-brand js-scroll-trigger" href="#page-top">Inicio</a>
                <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto my-2 my-lg-0">
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="#about">Productos</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="#portfolio">Cuenta</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="#contact">Contáctanos</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <!-- Masthead -->
        <header class="masthead">
            <div class="container h-100">
                <div class="row h-100 align-items-center justify-content-center text-center">
                    <div class="col-lg-10 align-self-end">
                        <h2 class="text-uppercase text-white font-weight-bold">Cuenta <% out.println(usuario);%> Bienvenido a tu portal</h2>
                        <hr class="divider my-4">
                    </div>
                    <div class="col-lg-8 align-self-baseline">
                        <p class="text-white-75 font-weight-light mb-5"> Gracias por hacer parte de nosotros, juntos lograremos que realices todos tus sueños</p>
                        <a class="btn btn-primary btn-xl js-scroll-trigger" href="#about">Solicitudes</a>
                    </div>
                </div>
            </div>
        </header>

        <!-- About Section -->
        <section class="page-section bg-primary" id="about">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-lg-8 text-center">
                        <h2 class="text-white mt-0">PRODUCTOS</h2>
                        <hr class="divider light my-4">
                        <p class="text-white-50 mb-4">En Su Banco Amigo contamos con creditos con interés  compuesto del  1.1% efectivo mensual, con plazos hasta 18 meses.</p>
                        <a class="btn btn-light btn-xl js-scroll-trigger">Solicitar Crédito</a>
                    </div>
                </div>
            </div>
        </section>

        <!-- Portfolio Section -->
        <section id="portfolio">
            <div class="container-fluid p-0">
                <div class="row no-gutters">
                </div>
            </div>
        </section>

        <!-- Call to Action Section -->
        <section class="page-section bg-dark text-white">
            <div class="container text-center">
                <h2 class="mb-4">Gestionar Cuentas</h2>
                <a class="btn btn-light btn-xl" href="http://localhost:8080/LoginBanco/eliminar.jsp">Eliminar Usuario</a>
                <a class="btn btn-light btn-xl" href="http://localhost:8080/LoginBanco/modificar.jsp">Modificar Usuario</a>
            </div>
        </section>

        <!-- Contact Section -->
        <section class="page-section" id="contact">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-lg-8 text-center">
                        <h2 class="mt-0">Contáctanos</h2>
                        <hr class="divider my-4">
                        <p class="text-muted mb-5" >Si tienes alguna duda nuestros asesores pueden ayudarte</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4 ml-auto text-center mb-5 mb-lg-0">
                        <i class="fas fa-envelope fa-3x mb-3 text-muted"></i>
                        <div>E-mail</div>
                        <a class="d-block" >servicioalcliente@subancoamigo.com</a>
                    </div>
                    <div class="col-lg-4 mr-auto text-center">
                        <i class="fas fa-phone fa-3x mb-3 text-muted"></i>
                        <!-- Make sure to change the email address in anchor text AND the link below! -->
                        <div>Telefono</div>
                        <a class="d-block" >(054) 44 32 32</a>
                    </div>
                </div>
            </div>
        </section>

        <!-- Footer -->
        <footer class="bg-light py-5">
            <div class="container">
                <div class="small text-center text-muted"></div>
            </div>
        </footer>

        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Plugin JavaScript -->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
        <script src="vendor/magnific-popup/jquery.magnific-popup.min.js"></script>

        <!-- Custom scripts for this template --><body id="page-top">
        <script src="js/creative.min.js"></script>

    </body>

</html>
