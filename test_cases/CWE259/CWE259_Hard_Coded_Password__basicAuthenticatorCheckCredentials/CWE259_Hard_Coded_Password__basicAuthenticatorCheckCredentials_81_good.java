/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__basicAuthenticatorCheckCredentials;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import com.sun.net.httpserver.BasicAuthenticator;

public class CWE259_Hard_Coded_Password__basicAuthenticatorCheckCredentials_81_good extends CWE259_Hard_Coded_Password__basicAuthenticatorCheckCredentials_81_base
{

	public void action(String data) throws Throwable
    {
        /* FIX */
        try
        {
        	InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
        		BufferedReader readerBuffered = new BufferedReader(readerInputStream);
        	
        		/* POTENTIAL FLAW: Read data from the console using readLine */
        		data = readerBuffered.readLine();
       	}
       	catch (IOException exceptIO)
       		{
       			IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
       		}
       	
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
    
    public void action(char[] data) throws Throwable
    {
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
    
    public void action(Properties properties) throws Throwable
    {
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