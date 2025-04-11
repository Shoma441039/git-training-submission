package chapter4.progra1;

// 人事クラス
public class HumanResource extends Employee {

	// コンストラクタ
    public HumanResource(String name) {
        super(name, "人事"); // 所属部署は人事固定
    }
    
    // 社員面接
    public boolean interview(DE company, String candidateName, String department) {
        boolean result = true; // 採用結果
        
        if (result) {
            System.out.println("面接を行い、結果は採用だった");
            
            // 部署に応じて従業員を作成
            if (department.equals("エンジニア")) {
                // エンジニアの場合は言語も指定（例としてJavaを設定）
                company.newEngineer(candidateName, department, "Java");
            } else {
                // 人事または営業の場合
                company.newEmployee(candidateName, department);
            }
        } else {
            System.out.println("面接を行い、結果は不採用だった");
        }
        
        return result;
    }
    
    // 給与計算
    public void payrollCalculation() {
        System.out.println("給与計算を行なった");
    }
}
