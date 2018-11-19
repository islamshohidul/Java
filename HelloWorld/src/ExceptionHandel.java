
public class ExceptionHandel {
	
	public static void main(String[] args){
		
		try {
			getArray();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("The array item was out of bound");
		}
		System.out.println("System still working");
		
	}

	private static void getArray() throws ArrayIndexOutOfBoundsException{
		String [] string = {"Welcome!"};
		System.out.println(string[1]);
	}

}
