package encuar;

import java.util.ArrayList;

public class ArrayList3 {
	public static void main(String[] args) {
		int hola=0;
		double old = System.currentTimeMillis();
		ArrayList<Integer> AList = new ArrayList<Integer>();
		for (int i = 0; i < 50; i++) {
			AList.add(i);
		}
		for (int i = 0; i < 20; i++) {
			AList.remove(0);
		}
		double neww = System.currentTimeMillis();
		System.out.println(neww - old);
		System.out.println(AList);
	}
}
