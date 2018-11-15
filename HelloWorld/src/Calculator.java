import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
	
	public static void main(String[] args) throws IOException {
		
		String s1 = getInput("Enter a Value:");
		double d1 = Double.parseDouble(s1);
		System.out.println(d1);

	}
	
	private static String getInput(String prompt) throws IOException{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(prompt);
		System.out.flush();
		return stdin.readLine();
	}

}
