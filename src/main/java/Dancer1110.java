
public class Dancer1110 extends Character1107 {
	public void dance() {
		System.out.println(this.name + "は情熱的に踊った");
	}
	public void attack() {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.hp-= 3;
	}

}
