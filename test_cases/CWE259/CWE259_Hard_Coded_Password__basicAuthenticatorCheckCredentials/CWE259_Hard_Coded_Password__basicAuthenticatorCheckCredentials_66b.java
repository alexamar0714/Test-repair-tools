/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 66 Data flow: data passed in an array from one method to another in different source files in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__basicAuthenticatorCheckCredentials;

import testcasesupport.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import com.sun.net.httpserver.BasicAuthenticator;

public class CWE259_Hard_Coded_Password__basicAuthenticatorCheckCredentials_66b
{

	public void badSink(String dataArray[]) throws Throwable
    {
    	String data = dataArray[2];
    	
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
	
    public void goodG2BSink(String dataArray[]) throws Throwable
    {
    	String data = dataArray[2];
    	
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
	
	public void goodCharSink(char[][] dataArray) throws Throwable
    {
    	char[] data = dataArray[2];
    	
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
        	for (char[] content : dataArray)
        	{
        		Arrays.fill(content, 'x');
        	}
        }
    }
	
	public void goodExpectedSink(List<Properties> propertiesList) throws Throwable
	{
		Properties properties = propertiesList.get(2);
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