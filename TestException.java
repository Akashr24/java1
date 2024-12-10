package pkg1;

@SuppressWarnings("serial")
class DivByZeroException extends Exception{
	public DivByZeroException(String message) {
		super(message);
	}
}
public class TestException {

	public static void main(String[] args) {
		System.out.println("Exception");
		int nr=10;
		int dr=0;
		int result;
		try {
			if(dr==0) {
				throw new DivByZeroException("division by zero not allowed");
			}
			
			
		}
		
		catch(DivByZeroException e1) {
			System.out.println("error:"+e1.getMessage());
		}
		catch(ArithmeticException e2) {
			System.out.println("error2"+e2.getMessage());
		}
		finally {
			System.out.println("Finally block executed");
		}

	}

}