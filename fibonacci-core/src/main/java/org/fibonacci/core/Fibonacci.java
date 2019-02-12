package org.fibonacci.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to compute the Fibonacci sequence
 * This class is based on the design pattern "SINGLETON".
 * There are two methods :
 * 		Fibonacci.get() : to get the unique instance of this class
 * 		this.run(int n) : to compute the nth term of the Fibonacci sequence
 * @author Erwan Viegas
 *
 */
public class Fibonacci {
	/**
	 * List of results previously computed and stacked in memory.
	 * 
	 */
	private List<Long> results;
	
	/**
	 * Instance of Fibonacci singleton
	 */
	private static Fibonacci INSTANCE;
	
	/**
	 * Private constructor of Fibonacci called by getInstance().
	 * The list 'results' is initialized with the values : 0 and 1
	 */
	private Fibonacci() {
		this.results = new ArrayList<Long>();
		this.results.add(0L);
		this.results.add(1L);
	}
	
	/**
	 * Get the unique instance of this class
	 * @return Fibonacci instance with the previous results
	 */
	public static Fibonacci get() {
		if (Fibonacci.INSTANCE == null) {
			Fibonacci.INSTANCE = new Fibonacci();
		}
		
		return Fibonacci.INSTANCE;
	}
	
	/**
	 * Compute the Fibonacci sequence for the nth term
	 * The list 'results' is updated
	 * @param n Term index to calculate F(n)
	 * @return 0 if n < 0 || F(n) else
	 */
	public Long run(int n) {
		if (n < 0) {
			// Negative case
			return 0L;
		} else {
			// Positive case
			if (n >= this.results.size()) {
				// Not previously computed ==> Extend the results list
				for (int k = this.results.size(); k <= n; k ++) {
					// F(n) = F(n - 1) + F(n - 2)
					this.results.add(
							this.results.get(k - 1) + this.results.get(k - 2)
					);
				}
			}
			
			return this.results.get(n);
		} 
	}
}
