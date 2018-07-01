package package1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DetailsViewServlet extends HttpServlet{
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Employee obj= (Employee)req.getAttribute("empobj");
	  System.out.println(obj.getEmpName());
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("employee details are "+obj.getEmpName()+obj.getSalary()+" for given "+ obj.getEmpId());
			}
	

}
