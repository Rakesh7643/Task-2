package employeedetails.com;

public class Employee {
	public void empId(int id) {
		System.out.println("employee id is :"+id);
		
	}
	public void empName(String name) {
		System.out.println("employee name is:"+name);
		
		
	}
	public void empPhnno(Long phn) {
		System.out.println("employee phn no is :"+phn);
		
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId(12345);
		e.empName("Rakesh v");
		e.empPhnno(8608653693l);
	}

}
