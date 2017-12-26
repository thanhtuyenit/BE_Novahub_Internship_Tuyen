package com.journaldev.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "My First Servlet", urlPatterns = { "/FirstServlet", "/FirstServlet.do" }, initParams = {
    @WebInitParam(name = "id", value = "1"), @WebInitParam(name = "name", value = "pankaj") })
public class FirstServlet extends HttpServlet {
  private static final long  serialVersionUID = 1L;
  public static final String HTML_START       = "<html><body>";
  public static final String HTML_END         = "</body></html>";
  
  public FirstServlet() {
    super();
    
  }
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    Date date = new Date();
    out.println(HTML_START + "<h2>Hi There!</h2><br/><h3>Date=" + date + "</h3>" + HTML_END);
  }
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  }
  
}