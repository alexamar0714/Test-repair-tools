/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__passwordAuthentication;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import java.net.PasswordAuthentication;

public class CWE259_Hard_Coded_Password__passwordAuthentication_81_good extends CWE259_Hard_Coded_Password__passwordAuthentication_81_base
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
       	
       	
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
				PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
            	IO.writeLine(credentials.toString());
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
    
    public void action(char[] data) throws Throwable
    {
    	
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
				PasswordAuthentication credentials = new PasswordAuthentication("user", data);
            	IO.writeLine(credentials.toString());
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
    	
        
        if (properties != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
				PasswordAuthentication credentials = new PasswordAuthentication("user", properties.getProperty("password").toCharArray());
            	IO.writeLine(credentials.toString());
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
}