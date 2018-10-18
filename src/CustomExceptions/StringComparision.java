package CustomExceptions;

public class StringComparision {

	public static void main(String[] args) {
		String s1 = "Syed";
		String s2 ="syed";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));
	}
}
