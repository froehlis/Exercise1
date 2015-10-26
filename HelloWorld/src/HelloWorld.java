import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Hello ASE2015 - how are you now? :)");
		
		String name = "I";
		try {
			System.out.print("Please enter your name: ");
	    	BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			name = bufferRead.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		HelloUser hu = new HelloUser(name);
		
		hu.greetUser();

	}

}
