package chapter4.program1;
import java.util.ArrayList;

public class DE {
	private final String companyName = "BT/DE";
	private ArrayList<Employee> employeeList = new ArrayList<>();
	private ArrayList<String> departmentList = new ArrayList<>();

	public DE() {
		departmentList.add("人事部");
		departmentList.add("営業部");
		departmentList.add("エンジニア部");
	}

	public void addEmployee(Employee emp) {
		employeeList.add(emp);
	}

	public void showAllEmployees() {
		System.out.println("【従業員情報一覧】");
		for (Employee emp : employeeList) {
			emp.showInfo();
		}
	}


	public static void main(String[] args) {
		DE de = new DE();

		
		de.addEmployee(new HumanResource("田中"));
		de.addEmployee(new Sales("佐藤"));
		de.addEmployee(new Engineer("山本", "Java"));


		de.showAllEmployees();
	}
}