package chapter4.program1;
public class Engineer extends Employee{
	private String language;

    public Engineer(String name, String language) {
        super(name, "エンジニア部");
        this.language = language;
    }

    public void develop() {
        System.out.println(language + "で開発を行なった");
    }

    @Override
    public void showInfo() {
        System.out.println(name + "：" + department + "　使用言語：" + language);
    }
}
