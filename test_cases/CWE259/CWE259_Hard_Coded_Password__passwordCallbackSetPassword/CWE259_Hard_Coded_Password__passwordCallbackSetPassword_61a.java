/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 61 Data flow: data returned from one method to another in different classes in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__passwordCallbackSetPassword;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import javax.security.auth.callback.PasswordCallback;


public class CWE259_Hard_Coded_Password__passwordCallbackSetPassword_61a extends AbstractTestCase
{

	/* use badsource and badsink */
	public void bad() throws Throwable
    {
    	String data = (new CWE259_Hard_Coded_Password__passwordCallbackSetPassword_61b()).badSource();
    	
    	
        
        if (data != null)
        {
            try
            {
            	PasswordCallback passwordCallback = new PasswordCallback("test", false);
				passwordCallback.setPassword(data.toCharArray());
            	IO.writeLine(passwordCallback.getPassword().toString());
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
        
    /* goodG2B() - use goodsource and badsink */
    private void goodG2B() throws Throwable
    {
    	String data = (new CWE259_Hard_Coded_Password__passwordCallbackSetPassword_61b()).goodG2BSource();
    	
    	
        
        if (data != null)
        {
            try
            {
            	PasswordCallback passwordCallback = new PasswordCallback("test", false);
				passwordCallback.setPassword(data.toCharArray());
            	IO.writeLine(passwordCallback.getPassword().toString());
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
	/* goodChar() - uses the expected Properties file and a char[] data variable*/
	private void goodChar() throws Throwable
    {
    	char[] data = (new CWE259_Hard_Coded_Password__passwordCallbackSetPassword_61b()).goodCharSource();
    	
    	
        
        if (data != null)
        {
            try
            {
            	PasswordCallback passwordCallback = new PasswordCallback("test", false);				passwordCallback.setPassword(data);
            	IO.writeLine(passwordCallback.getPassword().toString());
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        	
        	/* Cleanup the password */
        	Arrays.fill(data, 'x');
        }
    }
	 		
	/* goodExpected() - uses the expected Properties file and uses the password directly from it*/
	private void goodExpected() throws Throwable
	{
		Properties properties = (new CWE259_Hard_Coded_Password__passwordCallbackSetPassword_61b()).goodExpectedSource();
		
		
        
        if (properties != null)
        {
            try
            {
            	PasswordCallback passwordCallback = new PasswordCallback("test", false);
				passwordCallback.setPassword(properties.getProperty("password").toCharArray());
            	IO.writeLine(passwordCallback.getPassword().toString());
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
	}
		
	public void good() throws Throwable
    {
        goodG2B();
        goodChar();
        goodExpected();
    } 
	
	/* Below is the main(). It is only used when building this testcase on
     * its own for testing or for building a binary to use in testing binary
     * analysis tools. It is not used when compiling all the testcases as one
     * application, which is how source code analysis tools are tested.
     */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}