package chapter4.program1;
public class Employee {
	protected String name;
	protected String department;
	
	public Employee(String name,String department) {
		this.name = name;
		this.department = department;
		
	}
	
	public void showInfo() {
        System.out.println(name + "：" + department);
    }
	

}
