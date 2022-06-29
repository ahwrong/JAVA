package com.varxyz.jv300.mod004;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mod004/hello.do")
public class FormBasedHelloServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
   private static final String DEFAULT_NAME = "World";

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { // formHtml 에서 get으로 보냈기 때문에 doGet
      String name = request.getParameter("userName");
      if(name == null || name.length() == 0 ) {
         name = DEFAULT_NAME;
      }
      String pageTitle = "Hello World";
      response.setContentType("text/html; charset=utf-8");
      PrintWriter out = response.getWriter();
      out.println("<html>");
      out.println("<head><title>" + pageTitle + "</title></head>");
      out.println("<body>");
      out.println("<h3> 안녕하세요 " + name + "</h3>");
      out.println("</body></html>");
      out.close();
      
      response.getWriter().append("Served at: ").append(request.getContextPath());
   }


   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }

}