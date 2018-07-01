package package1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeDetailsServlet extends HttpServlet{
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
         int empId = Integer.parseInt(req.getParameter("empId"));
         System.out.println("calling test class");
         Test test = new Test();
		
		Employee obj = test.details(empId);
//		PrintWriter pw = resp.getWriter();
//		pw.println("employee details are "+obj.getEmpName()+obj.getSalary()+" for given "+ obj.getEmpId());
		
		req.setAttribute("empobj",obj);
		RequestDispatcher rd = req.getRequestDispatcher("detailsview");
		rd.forward(req, resp);
		
	}
	
	

}
