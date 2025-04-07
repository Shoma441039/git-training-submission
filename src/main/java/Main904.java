
public class Main904 {
		public static void main(String[] args) {
			Hero h = new Hero();
			h.name ="ミナト";
			h.hp =100;
			
			Matango m1 =new Matango();
			m1.hp =50;
			m1.suffix ='A';
			
			Matango m2 =new Matango();
			m2.hp =48;
			m2.suffix ='B';
			
			Sword s=new Sword();
			s.name ="炎の剣";
			s.damage =10;
			h.sword = s;
			
			System.out.println("現在の武器は"+h.sword.name);
			
		}

	}

