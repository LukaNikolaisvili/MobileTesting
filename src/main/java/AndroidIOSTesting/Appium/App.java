package AndroidIOSTesting.Appium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    @Test	
    public void test() {
    	String ActualText = "hello world";
    	String Expected = "hello world";
    	
    	assertEquals(ActualText,Expected);
    }
}
