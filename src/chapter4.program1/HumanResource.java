package chapter4.program1;
public class HumanResource extends Employee {
	public HumanResource(String name) {
		super(name,"人事部");
	}
	public void interview(boolean hired) {
		if(hired) {
			System.out.println("面接を行い、結果は採用だった");
			
		}else {
			System.out.println("面接を行い、結果は不採用だった");
		}
	}
	public void calcSalary() {
	    System.out.println("給与計算を行なった");
	}

}
