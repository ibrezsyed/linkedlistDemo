package CustomExceptions;

import java.util.Arrays;

public class TryExceptions {

	int i=10;
	int j= 20;
	
	static void callException() throws ArithmeticException{
		
		try{
			int j = 5/0;
		}
		finally{
			System.out.println("Finally  Block!!");
		}
//		System.out.println("Called Exception");
//		i << j;
	}
	public static void main(String[] args) {
		
		try{
			callException();
			
		}catch(ArithmeticException e){
			System.out.println("Caught Exception");
			System.out.println(e);
		}
	}
}
