package com.varxyz.jv300.mod002;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestCount extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String body = "";
		PrintWriter write = response.getWriter();
	      body += "<html><head><title>GuGudan</title></head><body><p>";
	      for(int i = 1; i<=9; i++) {
	         for(int j = 2; j <=9; j++) {
	            body += j + "X" + i + "=" + j*i + ", " ;
	         }
	         body += "</p>";
	      }
	      body += "</body></html>";
	      
	      write.println(body);
	      write.close();
	      
	}
}
