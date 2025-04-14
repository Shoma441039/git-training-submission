package chapter5.program1;

public class HumanResource extends Employee {
	
	public HumanResource(String name) {
		super(name,"人事");
	}
	
	public void conductInterview(boolean isHired, String department, String language) {
        if (isHired) {
            System.out.println("面接を行い、結果は採用でした。");
            
            if (department.equals("エンジニア")) {
                // エンジニアの場合、使用言語も引数として渡す
                Engineer engineer = new Engineer(this.getName(), language);
                DE.createEmployee(engineer);  // エンジニアとして従業員を作成
            } else if (department.equals("営業")) {
                // 営業の場合、言語は不要
                Sales sales = new Sales(this.getName());
                DE.createEmployee(sales);  // 営業として従業員を作成
            } else if (department.equals("人事")) {
                // 人事の場合、言語は不要
                HumanResource hr = new HumanResource(this.getName());
                DE.createEmployee(hr);  // 人事として従業員を作成
            } else {
                System.out.println("無効な部署です。");
            }
        } else {
            System.out.println("面接を行い、結果は不採用でした。");
        }
    }
        
        
	}
