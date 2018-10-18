package linkedList;

import java.util.LinkedList;

public class LinkedAddition {

	public static void main(String[] args) {

		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		LinkedList<Integer> l3 = new LinkedList<Integer>();
		
		l1.add(10);
		l1.add(20);
		l1.add(null);
		l1.add(null);
		l1.add(null);
		
		l2.add(1);
		l2.add(1);
		l2.add(1);
		
		int size = (l1.size()>l2.size())? l1.size():l2.size();
		System.out.println(size);
		
		for(int i=0;i<size;i++){
			int sum = l1.get(i)+l2.get(i);
			 l3.add(sum);
		}
		System.out.println(l3);
	}

}
