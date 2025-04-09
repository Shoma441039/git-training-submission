package chapter4.program1;

public class Sales extends Employee {
	public Sales(String name) {
		super(name, "営業部");
	}
	public void reportReply() {
        System.out.println("週報の返信をした");
    }

    public void arrangeMeeting(Engineer eng) {
        System.out.println(eng.getName() + "の面談を組んだ");
    }

    public void makeMeeting() {
        System.out.println("新規の打ち合わせをした");
    }

}
