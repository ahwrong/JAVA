package com.varxyz.jv300.mod004;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewAdduser
 */
public class NewAdduser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String title = "회원가입";
	      String userId = request.getParameter("userId");
	      String passwd = request.getParameter("passwd");
	      String userName = request.getParameter("userName");
	      String ssn = request.getParameter("ssn");
	      String email1 = request.getParameter("email1");
	      String email2 = request.getParameter("email2");
	      String[] concerns = request.getParameterValues("concerns");
	      
	      
	      response.setContentType("text/html; charset=UTF-8");
	      PrintWriter out = response.getWriter();
	      out.println("<html>");
	      out.println("<head><title>" + title + "</title></head>");
	      out.println("<body>");
	      out.println("");
	      out.println("<html>");
	      out.println("<p>입력하신 정보가 맞으면 회원가입을 클릭해주세요.</p>");
	      out.println("<p>ID : " + userId + "</p>");
	      out.println("<p>비밀번호 : " + passwd + "</p>");
	      out.println("<p>이름 : " + userName + "</p>");
	      out.println("<p>주민번호 : " + ssn + "</p>");
	      out.println("<p>이메일 : " + email1 + "@" + email2 + "</p>");
	      out.print("<p>관심분야 : ");
	      for(String concern : concerns ) {
	         out.print(concern + ", ");
	      }
	      out.print("</p>");
	      out.println("</body></html>");
	      out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
