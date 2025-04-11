package chapter4.progra1;

public class Sales extends Employee {
	 public Sales(String name) {
	        super(name, "営業");
	    }

	    public void replyReport() {
	        System.out.println("週報の返信をした");
	    }

	    public void scheduleMeeting(Engineer engineer) {
	        System.out.println(engineer.name + "の面談を組んだ");
	    }

	    public void haveMeeting() {
	        System.out.println("新規の打ち合わせをした");
	    }
	}
