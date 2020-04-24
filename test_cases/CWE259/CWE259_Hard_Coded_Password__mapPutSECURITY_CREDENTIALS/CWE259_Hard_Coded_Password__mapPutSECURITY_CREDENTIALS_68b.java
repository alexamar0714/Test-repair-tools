/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 68 Data flow: data passed as a member variable in the "a" class, which is used by a method in another class in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__mapPutSECURITY_CREDENTIALS;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import javax.naming.Context;

public class CWE259_Hard_Coded_Password__mapPutSECURITY_CREDENTIALS_68b
{

	public void badSink() throws Throwable
    {
    	String data = CWE259_Hard_Coded_Password__mapPutSECURITY_CREDENTIALS_68a.data;
    	
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
	
    public void goodG2BSink() throws Throwable
    {
    	String data = CWE259_Hard_Coded_Password__mapPutSECURITY_CREDENTIALS_68a.data;
    
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
	
	public void goodCharSink() throws Throwable
    {
    	char[] data = CWE259_Hard_Coded_Password__mapPutSECURITY_CREDENTIALS_68a.dataChar;
    
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
	
	public void goodExpectedSink() throws Throwable
	{
		Properties properties = CWE259_Hard_Coded_Password__mapPutSECURITY_CREDENTIALS_68a.properties;
	
		
        
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