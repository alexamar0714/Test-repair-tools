/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 52 Data flow: data passed as an argument from one method to another to another in three different classes in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__passwordCallbackSetPassword;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import javax.security.auth.callback.PasswordCallback;


public class CWE259_Hard_Coded_Password__passwordCallbackSetPassword_52c
{

	public void badSink(String data) throws Throwable
    {
    	
        
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
	
    public void goodG2BSink(String data) throws Throwable
    {
    	
        
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
	
	public void goodCharSink(char[] data) throws Throwable
    {
    	
        
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
	
	public void goodExpectedSink(Properties properties) throws Throwable
	{
		
        
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
}