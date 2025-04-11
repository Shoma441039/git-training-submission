package chapter4.progra1;

// 従業員クラス
public class Employee {
    protected String name; // 名前
    protected String department; // 所属部署
    
    // コンストラクタ
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    
    // 情報表示
    public void displayInfo() {
        System.out.println(name + "：" + department);
    }
    
    // getterメソッド
    public String getName() {
        return name;
    }
    
    public String getDepartment() {
        return department;
    }
}