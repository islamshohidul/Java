import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchWithInt {

public static void main(String[] args) throws IOException {
		
		String input = getInput("Enter a Value:");
		int month = Integer.parseInt(input);
		switch(month){
		case 1:
			System.out.print("The month is January");
			break;
		case 2:
			System.out.println("This month is February");
			break;
		default:
			System.out.println("Teype something selse");
			break;
			
		
		}

	}
	
	private static String getInput(String prompt) throws IOException{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(prompt);
		System.out.flush();
		return stdin.readLine();
	}
}
