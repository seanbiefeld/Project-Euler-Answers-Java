import sun.awt.windows.ThemeReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: sbiefeld
 * Date: 12/21/11
 * Time: 1:45 PM
 * To change this template use File | Settings | File Templates.
 */

public class Main {
	public static void main (String args[]) {
		while(true) {
			System.out.println("Please enter problem number to continue or exit to leave.");
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			String command = "";
			try {
				command = bufferedReader.readLine();
			} catch (IOException exception) {
				System.out.println(exception);
			}
			System.out.println("your command was: " + command);
			if(!command.equals(null))
			{
				if(command.toUpperCase().equals("EXIT"))
					break;
			}

			int problemNumber;

			//ensure the command is a number
			try {
				problemNumber = Integer.parseInt(command);
				IProblem problem = (IProblem) Class.forName("Problem"+problemNumber).newInstance();

				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date start = new Date();
				String answer = problem.Solve();
				Date end = new Date();
				
				System.out.println("The answer is: " + answer);
				System.out.println("The answer took " + (end.getTime() - start.getTime()) + " milliseconds to process");
			} catch (Exception exception) {
				System.out.println(exception);
				break;
			}
		}
	}
}

