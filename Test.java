package package1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		
	}
	public Employee details(int empId){
		System.out.println("calling configuration");
		Configuration con=new Configuration();
		con.configure();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Employee emp = session.get(Employee.class, empId);
	          System.out.println(emp.getEmpId());
	          System.out.println(emp.getEmpName());
		      System.out.println(emp.getSalary());
		session.close();
		sf.close();
		
		
		return emp;	
		
	}
	
	
	
	

}
