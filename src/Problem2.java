/**
 * Created by IntelliJ IDEA.
 * User: sbiefeld
 * Date: 12/21/11
 * Time: 4:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem2 implements IProblem{
	@Override
	/// By considering the terms in the Fibonacci sequence
	/// whose values do not exceed four million,
	/// find the sum of the even-valued terms.
	public String Solve() {
		long sum = 0;

		long previousNum = 0;
		long currentNum = 1;

		while (currentNum < 4000001)
		{
			long tempNum = currentNum;
			currentNum = previousNum + currentNum;
			previousNum = tempNum;

			if (currentNum % 2 == 0)
				sum += currentNum;
		}

		return String.valueOf(sum);
	}
}
