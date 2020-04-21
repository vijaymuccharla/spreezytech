//ExcelServlet.java
package com.vijay.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ExcelServlet extends HttpServlet{
	PrintWriter pw=null;
	//supplye zero param constructor
	public ExcelServlet(){
		System.out.println("ExcelServlet(-) Zero Param Constructor");
	}

	@Override
	public void init() throws ServletException {
	System.out.println("ExcelServlet.init()");
	}
	
	//Override protected void service(-,-) method
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		
		System.out.println("ExcelServlet servcie(-,-) method");
		//get PrintWriter object from response object
		pw=res.getWriter();
		//set content type of the response output
		res.setContentType("application/vnd.ms-excel");
		//write output to Response object using the PW stream object
		pw.println("<table border='1' align='center'>");
		pw.println("<tr><th>Subject</th><th>marks</th></tr>");
		pw.println("<tr><td> English </td><td> 75 </td></tr>");
		pw.println("<tr><td> Hindi </td><td> 82 </td></tr>");
		pw.println("<tr><td> Social </td><td> 65 </td></tr>");
		pw.println("<tr><td> Mathematics </td><td> 78 </td></tr>");
		pw.println("<tr><td> Biology </td><td> 49 </td></tr>");
		pw.println("</table>");

		//close stream object
		pw.close();
	}//service
	@Override
	public void destroy() {
		System.out.println("ExcelServlet.destroy()");
	}
}//class
