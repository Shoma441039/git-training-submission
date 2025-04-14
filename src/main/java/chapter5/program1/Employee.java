package chapter5.program1;

public abstract class Employee {
	
	protected String name;
    protected String department;
    
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void showInfo() {
        System.out.println(name + "：" + department);
    }
    public String getName() {
        return name;
    }
    
    public String getDepartment() {
        return department;
    }
}
