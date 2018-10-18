package CustomExceptions;

public class Factorisl {

	static void fact(int n){
		int fact = 1;
		for(int i=n;i>0;i--){
			fact = fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fact(6);
	}
}
