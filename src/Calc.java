import sun.security.util.BitArray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: sbiefeld
 * Date: 12/22/11
 * Time: 9:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class Calc {
	
		public static ArrayList<Double> GetAllPrimes(int max)
		{
			ArrayList<Double> primes = new ArrayList<Double>();
			boolean[] primeArray = PrimesBySieveOfEratosthenes(max);

			for (int i = 0; i < primeArray.length; i++)
			{
				if (primeArray[i])
					primes.add(Double.valueOf(i));
			}

			return primes;
		}

		public static boolean[] PrimesBySieveOfEratosthenes(int max)
		{
			boolean[] primeArray = new boolean[max];
			Arrays.fill(primeArray, true);

			primeArray[0] = false;
			primeArray[1] = false;

			for (double i = 2; i < Math.sqrt(max); i++)
			{
				if (primeArray[(int) i])
				{
					for (double j = i * i; j < max; j += i)
					{
						primeArray[(int)j] = false;
					}
				}
			}

			return primeArray;
		}
}
