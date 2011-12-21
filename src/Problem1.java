/**
 * Created by IntelliJ IDEA.
 * User: sbiefeld
 * Date: 12/21/11
 * Time: 3:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem1 implements IProblem{
	@Override
	//Find the sum of all the multiples of 3 or 5 below 1000.
	public String Solve() {
		int sum = 0;
		for (int i = 0; i < 1000; i++)
		{
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		return String.valueOf(sum);
	}
}
