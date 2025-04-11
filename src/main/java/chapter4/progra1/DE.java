package chapter4.progra1;

import java.util.ArrayList;
import java.util.List;

public class DE {
    private String companyName = "BT/DE";
    private List<Employee> employees = new ArrayList<>();

    // 従業員を追加するメソッド
    public void createEmployee(String name, String department, String language) {
        switch (department) {
            case "人事":
                employees.add(new HumanResource(name));
                break;
            case "営業":
                employees.add(new Sales(name));
                break;
            case "エンジニア":
                employees.add(new Engineer(name, language));
                break;
        }
    }

    // 全従業員の情報を表示
    public void showAllEmployees() {
        System.out.println("会社名：" + companyName);
        for (Employee emp : employees) {
            emp.showInfo();
        }
    }

    // 実行スタート
    public static void main(String[] args) {
        DE de = new DE();

        // 人事の社員を作って、面接を実行
        HumanResource hr1 = new HumanResource("田中");
        HumanResource hr2 = new HumanResource("鈴木");

        // 採用（人事経由で追加）
        hr1.interview(de, "採用", "佐藤", "人事", "Java");
        hr1.interview(de, "採用", "山田", "営業", "");
        hr2.interview(de, "採用", "斎藤", "エンジニア", "Python");

        // DEが直接採用（テスト用）
        de.createEmployee("伊藤", "営業", "");
        de.createEmployee("渡辺", "エンジニア", "C++");

        // 全従業員の情報を表示
        de.showAllEmployees();
    }
}