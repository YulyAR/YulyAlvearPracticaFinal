package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    HttpSession objsesion = request.getSession(false);
    String usuario = (String) objsesion.getAttribute("cc");
    if (usuario.equals("")) {
        response.sendRedirect("index.jsp");
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>Menu Usuario</title>\n");
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
      out.write("\n");
      out.write("    </head>\n");
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
      out.write("                            <a class=\"nav-link js-scroll-trigger\" href=\"#about\">Productos</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link js-scroll-trigger\" href=\"#portfolio\">Cuenta</a>\n");
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
      out.write("                        <h2 class=\"text-uppercase text-white font-weight-bold\">Cuenta ");
 out.println(usuario);
      out.write(" Bienvenido a tu portal</h2>\n");
      out.write("                        <hr class=\"divider my-4\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-8 align-self-baseline\">\n");
      out.write("                        <p class=\"text-white-75 font-weight-light mb-5\"> Gracias por hacer parte de nosotros, juntos lograremos que realices todos tus sueños</p>\n");
      out.write("                        <a class=\"btn btn-primary btn-xl js-scroll-trigger\" href=\"#about\">Solicitudes</a>\n");
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
      out.write("                        <h2 class=\"text-white mt-0\">PRODUCTOS</h2>\n");
      out.write("                        <hr class=\"divider light my-4\">\n");
      out.write("                        <p class=\"text-white-50 mb-4\">En Su Banco Amigo contamos con creditos con interés  compuesto del  1.1% efectivo mensual, con plazos hasta 18 meses.</p>\n");
      out.write("                        <a class=\"btn btn-light btn-xl js-scroll-trigger\">Solicitar Crédito</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Portfolio Section -->\n");
      out.write("        <section id=\"portfolio\">\n");
      out.write("            <div class=\"container-fluid p-0\">\n");
      out.write("                <div class=\"row no-gutters\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Call to Action Section -->\n");
      out.write("        <section class=\"page-section bg-dark text-white\">\n");
      out.write("            <div class=\"container text-center\">\n");
      out.write("                <h2 class=\"mb-4\">Gestionar Cuentas</h2>\n");
      out.write("                <a class=\"btn btn-light btn-xl\" href=\"http://localhost:8080/LoginBanco/eliminar.jsp\">Eliminar Usuario</a>\n");
      out.write("                <a class=\"btn btn-light btn-xl\" href=\"http://localhost:8080/LoginBanco/modificar.jsp\">Modificar Usuario</a>\n");
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
      out.write("</html>\n");
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
