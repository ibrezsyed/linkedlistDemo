package CustomExceptions;

public class TemparatureException extends Exception{

	public String getMessage(){
		
		return "Temperature!!! ";
	}
	public String  toString(){
		return Exception.class.getCanonicalName()+": "+getMessage();
	}
}
