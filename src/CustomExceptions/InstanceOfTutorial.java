package CustomExceptions;

import java.util.ArrayList;

public class InstanceOfTutorial {

	public static void main(String[] args) {
		ArrayList list =  new ArrayList();
		HotChocolate h = new HotChocolate();
		HotChocolate h1 = new HotChocolate();
		
		list.add(h);
		list.add(h1);
		list.add(h1);
		System.out.println(count(list));
	}

	private static int count(ArrayList list) {
		
		int count = 0;
		for(int i=0;i<list.size();i++){
			Object element = list.get(i);
			if(element instanceof HotChocolate){
				count++;
			}
		}
		return count;
	}
}
