
public class MethodWithLoop {
	
	public static void main(String[] args){
		printSomething();
		loopMe();
		
	}
	private static void loopMe() {
		int top =10;
		for(int i=0; i<top; i++){
			System.out.println("The value is:"+i);
		}
	}
	public static void printSomething(){
		System.out.println("This is the demo method");
		
	}

}
