package chapter4.progra1;

// 営業クラス
public class Sales extends Employee {
    
    // コンストラクタ
    public Sales(String name) {
        super(name, "営業"); // 所属部署は営業固定
    }
    
    // 週報返信
    public void replyToWeeklyReport() {
        System.out.println("週報の返信をした");
    }
    
    // 面談組む
    public void scheduleInterview(Engineer engineer) {
        System.out.println(engineer.getName() + "の面談を組んだ");
    }
    
    // 打ち合わせ
    public void meetingArrangement() {
        System.out.println("新規の打ち合わせをした");
    }
}
