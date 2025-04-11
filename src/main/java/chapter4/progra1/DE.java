package chapter4.progra1;
import java.util.ArrayList;


// DEクラス（会社クラス）
public class DE {
    private final String companyName = "BT/DE"; // 会社名（固定）
    private ArrayList<Employee> employeeList = new ArrayList<>(); // 従業員リスト
    
    // コンストラクタ - 部署リストの初期化
    public DE() {
        // 部署リストは実際には使っていないので省略
    }
    
    // 従業員作成メソッド（エンジニア以外用）
    public Employee newEmployee(String name, String department) {
        Employee employee = new Employee(name, department);
        employeeList.add(employee);  // 従業員を追加
        return employee;
    }
    
    // 従業員作成メソッド（エンジニア用）- オーバーロード
    public Engineer newEngineer(String name, String department, String language) {
        Engineer engineer = new Engineer(name, department, language);
        employeeList.add(engineer);  // エンジニアを追加
        return engineer;
    }
    
    // 従業員情報表示
    public void displayEmployeeList() {
        System.out.println("【" + companyName + " 従業員一覧】");
        if (employeeList.isEmpty()) {
            System.out.println("従業員がいません");
        } else {
            for (Employee employee : employeeList) {
                employee.displayInfo();
            }
        }
    }
    
    public static void main(String[] args) {
        // 会社を作る
        DE company = new DE();

        // 人事部の田中を作る
        HumanResource hr = new HumanResource("田中");

        // 田中が面接をして、エンジニアの佐藤さんを採用
        hr.interview(company, "佐藤", "エンジニア");

        // 田中が営業部の鈴木さんを採用
        hr.interview(company, "鈴木", "営業");

        // 従業員一覧を表示
        company.displayEmployeeList();
    }
}