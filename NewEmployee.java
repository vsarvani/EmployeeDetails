package package1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NewEmployee extends HttpServlet{

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		         String eName = req.getParameter("ename");
		         int eId = Integer.parseInt(req.getParameter("eid"));
		         int eSal = Integer.parseInt(req.getParameter("esal"));
		         
		         System.out.println(eName);
		
	Configuration con = new Configuration();	
	con.configure();
	SessionFactory sf = con.buildSessionFactory();
	Session session = sf.openSession();
	
	session.beginTransaction();
	Employee emp=new Employee();
	
	emp.setEmpId(eId);
	emp.setEmpName(eName);
	emp.setSalary(eSal);
	
	session.save(emp);
	session.getTransaction().commit();
	session.close();
	sf.close();
	
	PrintWriter pw = resp.getWriter();
	pw.println("employee created successfully");
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
