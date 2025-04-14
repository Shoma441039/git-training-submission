package chapter5.program1;

import java.util.ArrayList;

public class DE {

    private static ArrayList<Employee> allEmployees = new ArrayList<>();
    private static ArrayList<String> departments = new ArrayList<>();

    // 従業員を作成してDEクラスで管理するメソッド
    public static void createEmployee(Employee employee) {
        allEmployees.add(employee);
        if (!departments.contains(employee.getDepartment())) {
            departments.add(employee.getDepartment());
        }
    }

    // すべての従業員の情報を表示するメソッド
    public static void showAllEmployees() {
        System.out.println("【全従業員情報】");
        for (Employee emp : allEmployees) {
            emp.showInfo();
            if (emp instanceof Engineer) {
                ((Engineer) emp).performDevelopment();  // エンジニアの場合は開発言語も表示
            }
        }
    }

    // 部署別に従業員情報を表示するメソッド
    public static void showDepartmentEmployees() {
        for (String department : departments) {
            System.out.println("【" + department + "】");
            for (Employee emp : allEmployees) {
                if (emp.getDepartment().equals(department)) {
                    emp.showInfo();
                    if (emp instanceof Engineer) {
                        ((Engineer) emp).performDevelopment();
                    }
                }
            }
        }
    }

    // ランダムで従業員を生成するメソッド（ここでは手動で3人作成）
    public static void generateEmployees() {
        // 手動で従業員を作成
        HumanResource hr1 = new HumanResource("田中");
        Sales sales1 = new Sales("佐藤");
        Engineer engineer1 = new Engineer("鈴木", "Java");

        // 従業員をDEクラスで管理
        DE.createEmployee(hr1);
        DE.createEmployee(sales1);
        DE.createEmployee(engineer1);
    }

    public static void main(String[] args) {
        // 従業員を生成
        DE.generateEmployees();

        // すべての従業員情報を表示
        DE.showAllEmployees();

        // 部署別に従業員情報を表示
        DE.showDepartmentEmployees();
    }
}
