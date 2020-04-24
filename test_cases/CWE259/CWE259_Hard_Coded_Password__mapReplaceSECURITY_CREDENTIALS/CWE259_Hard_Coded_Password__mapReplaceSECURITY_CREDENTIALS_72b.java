/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 72 Data flow: data passed in a Vector from one method to another in different source files in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__mapReplaceSECURITY_CREDENTIALS;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.io.*;
import javax.naming.Context;
import java.util.HashMap;
import java.util.Map;

public class CWE259_Hard_Coded_Password__mapReplaceSECURITY_CREDENTIALS_72b
{

	public void badSink(Vector<String> dataVector) throws Throwable
    {
    	String data = dataVector.remove(2);
    	
    	Map<String, String> map = new HashMap<>();
		map.put(Context.SECURITY_CREDENTIALS, "");
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				map.replace(Context.SECURITY_CREDENTIALS, "", data);
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
    public void goodG2BSink(Vector<String> dataVector) throws Throwable
    {
    	String data = dataVector.remove(2);
    	
    	Map<String, String> map = new HashMap<>();
		map.put(Context.SECURITY_CREDENTIALS, "");
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				map.replace(Context.SECURITY_CREDENTIALS, "", data);
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
	public void goodCharSink(Vector<char[]> dataVector) throws Throwable
    {
    	char[] data = dataVector.remove(2);
    
    	Map<String, String> map = new HashMap<>();
		map.put(Context.SECURITY_CREDENTIALS, "");
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				map.replace(Context.SECURITY_CREDENTIALS, "", String.valueOf(data));
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        	
        	/* Cleanup the password */
        	Arrays.fill(data, 'x');
        }
    }
	
	public void goodExpectedSink(Vector<Properties> dataVector) throws Throwable
	{
		Properties properties = dataVector.remove(2);
	
		
        
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