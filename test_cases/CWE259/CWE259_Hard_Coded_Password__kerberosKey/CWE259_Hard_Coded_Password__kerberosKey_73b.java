/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 73 Data flow: data passed in a LinkedList from one method to another in different source files in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__kerberosKey;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.LinkedList;
import java.util.logging.Level;
import java.io.*;
import javax.security.auth.kerberos.KerberosKey;
import javax.security.auth.kerberos.KerberosPrincipal;

public class CWE259_Hard_Coded_Password__kerberosKey_73b
{

	public void badSink(LinkedList<String> dataLinkedList) throws Throwable
    {
    	String data = dataLinkedList.remove(2);
    	
    	
        
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
	
    public void goodG2BSink(LinkedList<String> dataLinkedList) throws Throwable
    {
    	String data = dataLinkedList.remove(2);
    	
    	
        
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
	
	public void goodCharSink(LinkedList<char[]> dataLinkedList) throws Throwable
    {
    	char[] data = dataLinkedList.remove(2);
    
    	
        
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
	
	public void goodExpectedSink(LinkedList<Properties> dataLinkedList) throws Throwable
	{
		Properties properties = dataLinkedList.remove(2);
	
		
        
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