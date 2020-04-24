/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 74 Data flow: data passed in a HashMap from one method to another in different source files in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__basicAuthenticatorCheckCredentials;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.HashMap;
import java.util.logging.Level;
import java.io.*;
import com.sun.net.httpserver.BasicAuthenticator;

public class CWE259_Hard_Coded_Password__basicAuthenticatorCheckCredentials_74b
{

	public void badSink(HashMap<Integer,String> dataHashMap) throws Throwable
    {
    	String data = dataHashMap.get(2);
    	
    	BasicAuthenticator ba = new BasicAuthenticator("test_auth") {
			@Override
			public boolean checkCredentials(String username, String password) {
				return false;
			}};
        
        if (data != null)
        {
            try
            {
            	ba.checkCredentials("root", data);

            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
    public void goodG2BSink(HashMap<Integer,String> dataHashMap) throws Throwable
    {
    	String data = dataHashMap.get(2);
    	
    	BasicAuthenticator ba = new BasicAuthenticator("test_auth") {
			@Override
			public boolean checkCredentials(String username, String password) {
				return false;
			}};
        
        if (data != null)
        {
            try
            {
            	ba.checkCredentials("root", data);

            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
	public void goodCharSink(HashMap<Integer,char[]> dataHashMap) throws Throwable
    {
    	char[] data = dataHashMap.get(2);
    
    	BasicAuthenticator ba = new BasicAuthenticator("test_auth") {
			@Override
			public boolean checkCredentials(String username, String password) {
				return false;
			}};
        
        if (data != null)
        {
            try
            {
            	ba.checkCredentials("root", String.valueOf(data));

            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        	
        	/* Cleanup the password */
        	Arrays.fill(data, 'x');
        }
    }
	
	public void goodExpectedSink(HashMap<Integer,Properties> dataHashMap) throws Throwable
	{
		Properties properties = dataHashMap.get(2);
	
		BasicAuthenticator ba = new BasicAuthenticator("test_auth") {
			@Override
			public boolean checkCredentials(String username, String password) {
				return false;
			}};
        
        if (properties != null)
        {
            try
            {
            	ba.checkCredentials("root", properties.getProperty("password"));

            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
	}
}