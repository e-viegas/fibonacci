package org.fibonacci.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to compute the Fibonacci sequence
 * @author Erwan Viegas
 *
 */
public class Fibonacci {
	/**
	 * List of results previously computed and stacked in memory
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
		if (INSTANCE == null) {
			INSTANCE = new Fibonacci();
		}
		
		return INSTANCE;
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
		} else if (n < this.results.size()) {
			// Results previously computed
			return this.results.get(n);
		} else {
			// Extend the results list
			for (int k = this.results.size(); k <= n; k ++) {
				// F(n) = F(n - 1) + F(n - 2)
				this.results.add(
						this.results.get(k - 1) + this.results.get(k - 2)
				);
			}
			
			return this.results.get(n);
		}
	}
}
