package chapter4.progra1;
import java.util.ArrayList;

// DEクラス（会社クラス）
public class DE {
    private final String companyName = "BT/DE"; // 会社名（固定）
    private ArrayList<Employee> employeeList = new ArrayList<>(); // 従業員リスト
    private ArrayList<String> departmentList = new ArrayList<>(); // 部署リスト

    // コンストラクタ - 部署リストの初期化
    public DE() {
        // 3部署の設定
        departmentList.add("人事");
        departmentList.add("営業");
        departmentList.add("エンジニア");
    }

    // 従業員作成メソッド（エンジニア以外用）
    public Employee newEmployee(String name, String department) {
        Employee employee = new Employee(name, department);
        employeeList.add(employee);
        return employee;
    }

    // 従業員作成メソッド（エンジニア用）- オーバーロード
    public Engineer newEngineer(String name, String department, String language) {
        Engineer engineer = new Engineer(name, department, language);
        employeeList.add(engineer);
        return engineer;
    }

    // 従業員情報表示
    public void displayEmployeeList() {
        System.out.println("【" + companyName + " 従業員一覧】");
        for (Employee employee : employeeList) {
            employee.displayInfo();
        }
    }

    // 🔧 追加されたgetterメソッド
    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    // メインメソッド（動作確認）
    public static void main(String[] args) {
        // 会社を作る
        DE company = new DE();

        // 人事部の田中を作る
        HumanResource hr = new HumanResource("田中");
        company.employeeList.add(hr);

        // 田中が面接をして、エンジニアの佐藤さんを採用
        hr.interview(company, "佐藤", "エンジニア");

        // 田中が営業部の鈴木さんを採用
        hr.interview(company, "鈴木", "営業");

        // 従業員一覧を表示
        company.displayEmployeeList();

        // 各従業員に応じた動作を確認（追加）
        System.out.println("\n【従業員の個別動作確認】");
        for (Employee employee : company.getEmployeeList()) {
            if (employee instanceof Engineer) {
                ((Engineer) employee).develop();
            } else if (employee instanceof Sales) {
                ((Sales) employee).meetingArrangement();
            } else if (employee instanceof HumanResource) {
                ((HumanResource) employee).payrollCalculation();
            } else {
                System.out.println(employee.getName() + " は特別な動作はありません。");
            }
        }
    }
}