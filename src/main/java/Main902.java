
public class Main902 {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.hp = 400;
		Hero h2;
		h2 = h1;
		h1.hp = 150;
		System.out.println(h1.hp);
	}

}
