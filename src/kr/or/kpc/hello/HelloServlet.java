package kr.or.kpc.hello;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost/hello.kpc?id=jk04115&pwd=1234
@WebServlet("/hello.kpc")
public class HelloServlet extends HttpServlet {
   public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
      response.setContentType("text/html;carset=utf-8");
      PrintWriter out = response.getWriter();
      out.print("<html>                     ");
      out.print("   <head>                     ");
      out.print("      <title>hello servlet</title>");
      out.print("   </head>                     ");
      out.print("   <body>                     ");
      out.print("      <h1>Hello Servlet</h1>      ");
      out.print("   </body>                     ");
      out.print("</html>                     ");
      
      String id = request.getParameter("id");
      String pwd = request.getParameter("pwd");
      out.println("<h1>");
      out.println("id : " +id+",pwd : "+pwd);
      out.println("<h1>");
      out.println("</body>");
      out.println("</html>");
      
      

   }
}