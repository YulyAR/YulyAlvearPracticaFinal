package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class principal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>SuBancoAmigo - Yuly Alvear</title>\n");
      out.write("\n");
      out.write("        <!-- Font Awesome Icons -->\n");
      out.write("        <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <!-- Google Fonts -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Merriweather+Sans:400,700\" rel=\"stylesheet\">\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("        <!-- Plugin CSS -->\n");
      out.write("        <link href=\"vendor/magnific-popup/magnific-popup.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Theme CSS - Includes Bootstrap -->\n");
      out.write("        <link href=\"css/creative.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("\n");
      out.write("        <!-- Navigation -->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light fixed-top py-3\" id=\"mainNav\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">Inicio</a>\n");
      out.write("                <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto my-2 my-lg-0\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link js-scroll-trigger\" href=\"#about\">Acerca de</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link js-scroll-trigger\" href=\"#services\">Nosotros</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link js-scroll-trigger\" href=\"#portfolio\">Su Banco Amigo</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link js-scroll-trigger\" href=\"#contact\">Contáctanos</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!-- Masthead -->\n");
      out.write("        <header class=\"masthead\">\n");
      out.write("            <div class=\"container h-100\">\n");
      out.write("                <div class=\"row h-100 align-items-center justify-content-center text-center\">\n");
      out.write("                    <div class=\"col-lg-10 align-self-end\">\n");
      out.write("                        <h1 class=\"text-uppercase text-white font-weight-bold\">Su Banco Amigo</h1>\n");
      out.write("                        <hr class=\"divider my-4\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-8 align-self-baseline\">\n");
      out.write("                        <p class=\"text-white-75 font-weight-light mb-5\"> Bienvenido a Su Banco Amigo donde encontrara grandes beneficios para usted y/o para su negocio</p>\n");
      out.write("                        <a class=\"btn btn-primary btn-xl js-scroll-trigger\" href=\"#about\">Conoce más</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <!-- About Section -->\n");
      out.write("        <section class=\"page-section bg-primary\" id=\"about\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col-lg-8 text-center\">\n");
      out.write("                        <h2 class=\"text-white mt-0\">Un banco con las mas bajas tasas de interes del mercado</h2>\n");
      out.write("                        <hr class=\"divider light my-4\">\n");
      out.write("                        <p class=\"text-white-50 mb-4\">En Su Banco Amigo somos proveedores de tarjetas débito y crédito, préstamos y otros servicios. Actuamos con principios de honestidad y transparencia con clientes, empleados, proveedores y accionistas  </p>\n");
      out.write("                        <a class=\"btn btn-light btn-xl js-scroll-trigger\" href=\"http://localhost:8080/LoginBanco/registro.jsp\">Regístrate ahora</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Services Section -->\n");
      out.write("        <section class=\"page-section\" id=\"services\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h2 class=\"text-center mt-0\">Nosotros</h2>\n");
      out.write("                <hr class=\"divider my-4\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 text-center\">\n");
      out.write("                        <div class=\"mt-5\">\n");
      out.write("                            <i class=\"fas fa-4x fa-gem text-primary mb-4\"></i>\n");
      out.write("                            <h3 class=\"h4 mb-2\">Historia</h3>\n");
      out.write("                            <p class=\"text-muted mb-0\">Su Banco Amigo fue fundada en 1970, por un grupo de 33 trabajadores de la Empresa M&N, que transformaron su natillera o fondo de ahorro para navidad, en un pequeño pero prometedor Banco de Ahorro y Crédito. </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 text-center\">\n");
      out.write("                        <div class=\"mt-5\">\n");
      out.write("                            <i class=\"fas fa-4x fa-heart text-primary mb-4\"></i>\n");
      out.write("                            <h3 class=\"h4 mb-2\">Sobre nosotros</h3>\n");
      out.write("                            <p class=\"text-muted mb-0\">Durante 4 décadas hemos participado activamente en la construcción de Colombia y nos hemos convertido en un referente importante en el sector financiero del país.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 text-center\">\n");
      out.write("                        <div class=\"mt-5\">\n");
      out.write("                            <i class=\"fas fa-4x fa-laptop-code text-primary mb-4\"></i>\n");
      out.write("                            <h3 class=\"h4 mb-2\">Cómo hacer parte de Su Banco Amigo</h3>\n");
      out.write("                            <p class=\"text-muted mb-0\">Si estas registrado en una de nuestras sucursales debes llamar a nuestra línea de servicio al cliente y solicitar una clave de acceso, si todavía no eres cliente debes registrarte en nuestra pagina web suministrando toda la información requerida</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 text-center\">\n");
      out.write("                        <div class=\"mt-5\">\n");
      out.write("                            <i class=\"fas fa-4x fa-globe text-primary mb-4\"></i>\n");
      out.write("                            <h3 class=\"h4 mb-2\">Beneficios</h3>\n");
      out.write("                            <p class=\"text-muted mb-0\">Como cliente podras acceder a nuestros beneficios, bajas tasas de interes, ingreso a parques de nuestros aliados, hipotecas y mucho más</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Portfolio Section -->\n");
      out.write("        <section id=\"portfolio\">\n");
      out.write("            <div class=\"container-fluid p-0\">\n");
      out.write("                <div class=\"row no-gutters\">\n");
      out.write("                    <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                        <a class=\"portfolio-box\" href=\"img/portfolio/fullsize/casa.jpg\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"img/portfolio/thumbnails/casa.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"portfolio-box-caption\">\n");
      out.write("                                <div class=\"project-category text-white-50\">\n");
      out.write("                                    Vivienda\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"project-name\">\n");
      out.write("                                    Cumplimos tu sueño de una vivienda propia\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                        <a class=\"portfolio-box\" href=\"img/portfolio/fullsize/estudios.jpg\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"img/portfolio/thumbnails/estudios.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"portfolio-box-caption\">\n");
      out.write("                                <div class=\"project-category text-white-50\">\n");
      out.write("                                    Estudios\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"project-name\">\n");
      out.write("                                    Tenemos diferentes convenios para que te conviertas en el profesional que quieres ser\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                        <a class=\"portfolio-box\" href=\"img/portfolio/fullsize/creditos.jpg\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"img/portfolio/thumbnails/creditos.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"portfolio-box-caption\">\n");
      out.write("                                <div class=\"project-category text-white-50\">\n");
      out.write("                                    Créditos\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"project-name\">\n");
      out.write("                                    Te prestamos para que comprés eso que te hace falta\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                        <a class=\"portfolio-box\" href=\"img/portfolio/fullsize/transaccion.jpg\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"img/portfolio/thumbnails/transaccion.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"portfolio-box-caption\">\n");
      out.write("                                <div class=\"project-category text-white-50\">\n");
      out.write("                                    Movivientos\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"project-name\">\n");
      out.write("                                    Facilidad para realizar todos tus tramites\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                        <a class=\"portfolio-box\" href=\"img/portfolio/fullsize/pventa.jpg\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"img/portfolio/thumbnails/pventa.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"portfolio-box-caption\">\n");
      out.write("                                <div class=\"project-category text-white-50\">\n");
      out.write("                                    Puntos de venta\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"project-name\">\n");
      out.write("                                    Contamos con mas de 500 sucursales en el país a tu servicio\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                        <a class=\"portfolio-box\" href=\"img/portfolio/fullsize/pagos.jpg\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"img/portfolio/thumbnails/pagos.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"portfolio-box-caption p-3\">\n");
      out.write("                                <div class=\"project-category text-white-50\">\n");
      out.write("                                    Pagos\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"project-name\">\n");
      out.write("                                    Desde tus cuentas puedes pagar diferentes facturas solo con el codigo QR\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Call to Action Section -->\n");
      out.write("        <section class=\"page-section bg-dark text-white\">\n");
      out.write("            <div class=\"container text-center\">\n");
      out.write("                <h2 class=\"mb-4\">Cuenta Personas</h2>\n");
      out.write("                <a class=\"btn btn-light btn-xl\" href=\"http://localhost:8080/LoginBanco/index.jsp\">¡Ingresa ya!</a>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Contact Section -->\n");
      out.write("        <section class=\"page-section\" id=\"contact\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col-lg-8 text-center\">\n");
      out.write("                        <h2 class=\"mt-0\">Contáctanos</h2>\n");
      out.write("                        <hr class=\"divider my-4\">\n");
      out.write("                        <p class=\"text-muted mb-5\" >Si tienes alguna duda nuestros asesores pueden ayudarte</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4 ml-auto text-center mb-5 mb-lg-0\">\n");
      out.write("                        <i class=\"fas fa-envelope fa-3x mb-3 text-muted\"></i>\n");
      out.write("                        <div>E-mail</div>\n");
      out.write("                        <a class=\"d-block\" >servicioalcliente@subancoamigo.com</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 mr-auto text-center\">\n");
      out.write("                        <i class=\"fas fa-phone fa-3x mb-3 text-muted\"></i>\n");
      out.write("                        <!-- Make sure to change the email address in anchor text AND the link below! -->\n");
      out.write("                        <div>Telefono</div>\n");
      out.write("                        <a class=\"d-block\" >(054) 44 32 32</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer class=\"bg-light py-5\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"small text-center text-muted\"></div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core JavaScript -->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Plugin JavaScript -->\n");
      out.write("        <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("        <script src=\"vendor/magnific-popup/jquery.magnific-popup.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom scripts for this template --><body id=\"page-top\">\n");
      out.write("        <script src=\"js/creative.min.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
