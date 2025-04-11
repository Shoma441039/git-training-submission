import java.util.ArrayList;
public class Main1601 {
	public static void main(String[] args) {
		ArrayList<Integer> points =new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		
		points.add(0, 30);
		points.remove(2);
		
		System.out.println(points.get(2));
		/*
		for (int i:points) {
			System.out.println(i);
			*/
		}
	}

