import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: sbiefeld
 * Date: 12/22/11
 * Time: 9:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class Problem3 implements IProblem{

	@Override
	public String Solve() {
		//assuming the largest prime is under 100000
		ArrayList<Double> primes = Calc.GetAllPrimes(100000);
		double largestPrime = 0;

		for(double prime : primes){
        	if (largestPrime < prime && 600851475143.0 % prime == 0)
				largestPrime = prime;
		}

		return String.valueOf(largestPrime);
	}
}
