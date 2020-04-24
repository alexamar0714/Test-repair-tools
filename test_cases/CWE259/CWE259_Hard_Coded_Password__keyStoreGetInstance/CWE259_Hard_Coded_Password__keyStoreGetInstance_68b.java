/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 68 Data flow: data passed as a member variable in the "a" class, which is used by a method in another class in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__keyStoreGetInstance;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import java.security.KeyStore;


public class CWE259_Hard_Coded_Password__keyStoreGetInstance_68b
{

	public void badSink() throws Throwable
    {
    	String data = CWE259_Hard_Coded_Password__keyStoreGetInstance_68a.data;
    	
    	
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance(new File("temp_file"), data.toCharArray());

            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
    public void goodG2BSink() throws Throwable
    {
    	String data = CWE259_Hard_Coded_Password__keyStoreGetInstance_68a.data;
    
    	
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance(new File("temp_file"), data.toCharArray());

            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
	public void goodCharSink() throws Throwable
    {
    	char[] data = CWE259_Hard_Coded_Password__keyStoreGetInstance_68a.dataChar;
    
    	
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance(new File("temp_file"), data);

            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        	
        	/* Cleanup the password */
        	Arrays.fill(data, 'x');
        }
    }
	
	public void goodExpectedSink() throws Throwable
	{
		Properties properties = CWE259_Hard_Coded_Password__keyStoreGetInstance_68a.properties;
	
		
        
        if (properties != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance(new File("temp_file"), properties.getProperty("password").toCharArray());

            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
	}
}