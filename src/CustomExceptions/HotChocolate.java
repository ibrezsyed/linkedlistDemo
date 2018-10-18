package CustomExceptions;

import java.util.concurrent.TimeUnit;

public class HotChocolate {

	public static final double tooHot = 185;
	public static final double tooCold = 160;
	
	public static void  drinkHotChocolate(double cocoaTemp)throws TooHot,TooCold{
		
		if(cocoaTemp >= tooHot){
			throw new TooHot();
		}else if(cocoaTemp <= tooCold){
			throw new TooCold();
		}
	}
			
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		double currentCocoaTemp = 200;
		boolean wrongTemp  =  true;
		while(wrongTemp){
		try{
			drinkHotChocolate(currentCocoaTemp);
			System.out.println("That Cocoa was Good!!");
			wrongTemp = false;
		}catch(TooHot e1){
			System.out.println("THAT'S TOO HOT!!");
			System.out.println(e1.getMessage());
			currentCocoaTemp -= 5;
		}catch(TooCold e2){
			System.out.println("THAT'S SO COLD! It's like the artic");
			System.out.println(e2);
			currentCocoaTemp += 5;
		}
		TimeUnit.SECONDS.sleep(2);
		}
		System.out.println("And it's gone.");
	}

}
