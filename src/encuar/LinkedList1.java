package encuar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedList1 {
	public static void main(String[] args) {
		double old = System.currentTimeMillis();
		Queue<Integer> AList = new LinkedList<Integer>();
		for (int i = 0; i < 100000; i++) {
			AList.add(i);
		}
		for (int i = 0; i < 100000; i++) {
			AList.remove(i);
		}
		double neww = System.currentTimeMillis();
		System.out.println(neww - old);
		System.out.println(AList);
	}
}
