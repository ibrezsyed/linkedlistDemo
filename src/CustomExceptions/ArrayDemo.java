package CustomExceptions;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		int [] a = new int[8];
		for(int i=0;i<a.length;i++){
			if(8-i>0){
				a[i] = i;
			}
		}
		System.out.println(Arrays.toString(a));
		int [] b = Arrays.copyOf(a, 5);
		Arrays.fill(a,200);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
