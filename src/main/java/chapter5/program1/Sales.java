package chapter5.program1;

public class Sales extends Employee{
	
    public Sales(String name) {
        super(name, "営業");
    }

    // 週報の返信をするメソッド
    public void replyWeeklyReport() {
        System.out.println(getName() + "は週報の返信をした。");
    }

    // 面談を組むメソッド（引数としてエンジニアを受け取る）
    public void arrangeMeeting(Engineer engineer) {
        System.out.println(getName() + "は、" + engineer.getName() + "の面談を組んだ。");
    }

    // 打ち合わせをするメソッド
    public void conductMeeting() {
        System.out.println(getName() + "は新規の打ち合わせをした。");
    }

    
}