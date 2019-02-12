package org.fibonacci.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.fibonacci.core.Fibonacci;

/**
 * Hello world!
 *
 */
@Mojo(name = "fibo")
@Parameter( property = "fibo.n")
public class GreetingMojo extends AbstractMojo {
	private int n;
	
    public void execute() throws MojoExecutionException{
    	Fibonacci fb = new Fibonacci.get();
    	getLog().info(Long.toString(fb.run(n)));
    }
}
