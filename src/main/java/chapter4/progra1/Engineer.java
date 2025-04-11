package chapter4.progra1;

// エンジニアクラス
public class Engineer extends Employee {
    private String programmingLanguage; // 使用言語
    
    // コンストラクタ
    public Engineer(String name, String department, String language) {
        super(name, "エンジニア");
        this.programmingLanguage = language;
    }
    
    // 開発実施
    public void develop() {
        System.out.println(programmingLanguage + "で開発を行なった");
    }
    
    // 情報表示（オーバーライド）
    @Override
    public void displayInfo() {
        System.out.println(name + "：" + department + "　使用言語：" + programmingLanguage);
    }
    
    // getter
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}