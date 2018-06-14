//package servletgenericservlet;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
 
 @WebServlet("/go")
public class ServletDemo extends GenericServlet {
     
   public void init() throws ServletException {
       // Put your code here
   }
 
   @Override
   public void service(ServletRequest request, ServletResponse response)
           throws ServletException, IOException {
       // TODO Auto-generated method stub
 
       response.setContentType("text/html");  
           
       PrintWriter out=response.getWriter();
 
       out.print("<html><body>");  
       out.print("<h1><b>welcome to Splessons</b></h1>"); 
       out.print("<h2><b>example on GenericsServlets</b></h2>"); 
       out.print("</body></html>");  
           
       }  
 
   public void destroy() {
       super.destroy(); // Just puts "destroy" string in log
       // Put your code here
   }
     
}