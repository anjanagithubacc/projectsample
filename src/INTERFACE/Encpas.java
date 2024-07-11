package INTERFACE;
class Employee
{
	private int empid;
	private String empname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
}
public class Encpas {
public static void main(String[] args) {
	Employee e=new Employee();
	e.setEmpid(101);
	e.setEmpname("Anjana");
	System.out.println(e.getEmpid());
	System.out.println(e.getEmpname());
	}
}
