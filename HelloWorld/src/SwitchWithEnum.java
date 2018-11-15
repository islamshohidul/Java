import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchWithEnum {

	public static void main(String[] args) {

		
		Month month = Month.FEBRUARY ;
		switch(month){
		case JANUARY:
			System.out.print("The month is January");
			break;
		case FEBRUARY:
			System.out.println("This month is February");
			break;
		default:
			System.out.println("Teype something selse");
			break;
			
		
		}

	}
	
	

}
