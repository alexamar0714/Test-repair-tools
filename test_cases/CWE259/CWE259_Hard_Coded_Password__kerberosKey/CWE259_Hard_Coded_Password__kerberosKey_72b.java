/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 72 Data flow: data passed in a Vector from one method to another in different source files in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__kerberosKey;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.io.*;
import javax.security.auth.kerberos.KerberosKey;
import javax.security.auth.kerberos.KerberosPrincipal;

public class CWE259_Hard_Coded_Password__kerberosKey_72b
{

	public void badSink(Vector<String> dataVector) throws Throwable
    {
    	String data = dataVector.remove(2);
    	
    	
        
        if (data != null)
        {
            try
            {
            	KerberosPrincipal principal = new KerberosPrincipal("test");
				/* POTENTIAL FLAW: data used as password in database connection */
				KerberosKey key = new KerberosKey(principal, data.toCharArray(), null);
            	IO.writeLine(key.toString());
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
    	
    	
        
        if (data != null)
        {
            try
            {
            	KerberosPrincipal principal = new KerberosPrincipal("test");
				/* POTENTIAL FLAW: data used as password in database connection */
				KerberosKey key = new KerberosKey(principal, data.toCharArray(), null);
            	IO.writeLine(key.toString());
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
    
    	
        
        if (data != null)
        {
            try
            {
            	KerberosPrincipal principal = new KerberosPrincipal("test");				/* POTENTIAL FLAW: data used as password in database connection */
				KerberosKey key = new KerberosKey(principal, data, null);
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
	
	public void goodExpectedSink(Vector<Properties> dataVector) throws Throwable
	{
		Properties properties = dataVector.remove(2);
	
		
        
        if (properties != null)
        {
            try
            {
            	KerberosPrincipal principal = new KerberosPrincipal("test");
				/* POTENTIAL FLAW: data used as password in database connection */
				KerberosKey key = new KerberosKey(principal, properties.getProperty("password").toCharArray(), null);
            	IO.writeLine(key.toString());
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
	}
}