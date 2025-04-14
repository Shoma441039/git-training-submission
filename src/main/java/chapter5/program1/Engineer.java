package chapter5.program1;

public class Engineer extends Employee{
	private String language;
	public Engineer(String name, String language) {
        super(name, "エンジニア");  // 名前と部署（エンジニア）を親クラスに渡す
        this.language = language;  // 使用言語をエンジニア特有の属性として設定
    }
	public void showInfo() {
        // エンジニア専用の出力：名前、部署、使用言語
        System.out.println(getName() + "：" + getDepartment() + " 使用言語：" + language);
    }
	public void performDevelopment() {
        System.out.println(getName() + "は、" + language + "で開発を行なった。");
	}
	public String getLanguage() {
        return language;
    }

}
