/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 73 Data flow: data passed in a LinkedList from one method to another in different source files in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__passwordAuthentication;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.LinkedList;
import java.util.logging.Level;
import java.io.*;
import java.net.PasswordAuthentication;

public class CWE259_Hard_Coded_Password__passwordAuthentication_73b
{

	public void badSink(LinkedList<String> dataLinkedList) throws Throwable
    {
    	String data = dataLinkedList.remove(2);
    	
    	
        
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
	
    public void goodG2BSink(LinkedList<String> dataLinkedList) throws Throwable
    {
    	String data = dataLinkedList.remove(2);
    	
    	
        
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
	
	public void goodCharSink(LinkedList<char[]> dataLinkedList) throws Throwable
    {
    	char[] data = dataLinkedList.remove(2);
    
    	
        
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
	
	public void goodExpectedSink(LinkedList<Properties> dataLinkedList) throws Throwable
	{
		Properties properties = dataLinkedList.remove(2);
	
		
        
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