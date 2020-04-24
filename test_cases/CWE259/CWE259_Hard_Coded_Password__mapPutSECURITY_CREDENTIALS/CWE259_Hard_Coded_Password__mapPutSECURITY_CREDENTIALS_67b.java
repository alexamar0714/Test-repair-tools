/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 67 Data flow: data passed in a class from one method to another in different source files in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__mapPutSECURITY_CREDENTIALS;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import javax.naming.Context;

public class CWE259_Hard_Coded_Password__mapPutSECURITY_CREDENTIALS_67b
{

	public void badSink(CWE259_Hard_Coded_Password__mapPutSECURITY_CREDENTIALS_67a.Container dataContainer) throws Throwable
    {
    	String data = dataContainer.containerOne;
    	
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
	
    public void goodG2BSink(CWE259_Hard_Coded_Password__mapPutSECURITY_CREDENTIALS_67a.Container dataContainer) throws Throwable
    {
    	String data = dataContainer.containerOne;
    	
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
	
	public void goodCharSink(CWE259_Hard_Coded_Password__mapPutSECURITY_CREDENTIALS_67a.ContainerTwo dataContainer) throws Throwable
    {
    	char[] data = dataContainer.containerOne;
    	
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
	
	public void goodExpectedSink(CWE259_Hard_Coded_Password__mapPutSECURITY_CREDENTIALS_67a.ContainerThree dataContainer) throws Throwable
	{
		Properties properties = dataContainer.containerOne;
		
		
        
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