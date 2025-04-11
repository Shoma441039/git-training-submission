package chapter4.progra1;

public class HumanResource extends Employee {
	public HumanResource(String name) {
        super(name, "人事");
    }

    public void interview(DE de, String result, String name, String department, String language) {
        System.out.println("面接を行い、結果は" + result + "だった");
        if ("採用".equals(result)) {
            de.createEmployee(name, department, language);
        }
    }

    public void calculateSalary() {
        System.out.println("給与計算を行なった");
    }
}