/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 51 Data flow: data passed as an argument from one function to another in different classes in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__keyStoreGetKey;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import java.security.Key;
import java.security.KeyStore;


public class CWE259_Hard_Coded_Password__keyStoreGetKey_51b
{

	public void badSink(String data) throws Throwable
    {
    	
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance("JKS");
				Key key = keystore.getKey("alias", data.toCharArray());
            	IO.writeLine(key.toString());
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
            	KeyStore keystore = KeyStore.getInstance("JKS");
				Key key = keystore.getKey("alias", data.toCharArray());
            	IO.writeLine(key.toString());
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
            	KeyStore keystore = KeyStore.getInstance("JKS");
       		Key key = keystore.getKey("alias", data);
            	IO.writeLine(key.toString());
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
            	KeyStore keystore = KeyStore.getInstance("JKS");
		        Key key = keystore.getKey("alias", properties.getProperty("password").toCharArray());
            	IO.writeLine(key.toString());
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
	}
}