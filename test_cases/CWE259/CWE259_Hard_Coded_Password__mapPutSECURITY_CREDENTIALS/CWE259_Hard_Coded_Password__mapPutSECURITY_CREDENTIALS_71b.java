/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 71 Data flow: data passed as an Object reference argument from one method to another in different classes in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__mapPutSECURITY_CREDENTIALS;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import javax.naming.Context;

public class CWE259_Hard_Coded_Password__mapPutSECURITY_CREDENTIALS_71b
{

	public void badSink(Object dataObject) throws Throwable
    {
    	String data = (String) dataObject;
    	
    	Properties dataProperties = new Properties();
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				dataProperties.put(Context.SECURITY_CREDENTIALS, data);
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
    public void goodG2BSink(Object dataObject) throws Throwable
    {
    	String data = (String) dataObject;
    	
    	Properties dataProperties = new Properties();
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				dataProperties.put(Context.SECURITY_CREDENTIALS, data);
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
	public void goodCharSink(Object dataObject) throws Throwable
    {
    	char[] data = (char[]) dataObject;
    
    	Properties dataProperties = new Properties();
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				dataProperties.put(Context.SECURITY_CREDENTIALS, String.valueOf(data));
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        	
        	/* Cleanup the password */
        	Arrays.fill(data, 'x');
        }
    }
	
	public void goodExpectedSink(Object dataObject) throws Throwable
	{
		Properties properties = (Properties) dataObject;
	
		
        
        if (properties != null)
        {
            try
            {
            	
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
	}
}