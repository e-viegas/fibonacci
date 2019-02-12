package org.fibonacci.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.fibonacci.core.Fibonacci;

/**
 * Mojo used for this plugin
 * @author Erwan Viegas
 */
@Mojo(name = "fibonacci")
@Parameter(property = "rank", required = true)
public class GreetingMojo extends AbstractMojo {
	private int rank;
	
	/**
	 * Exceute the Fibonacci plugin with a specify rank
	 */
    public void execute(){
    	Fibonacci fb = Fibonacci.get();
    	getLog().info(Long.toString(fb.run(this.rank)));
    }
}
