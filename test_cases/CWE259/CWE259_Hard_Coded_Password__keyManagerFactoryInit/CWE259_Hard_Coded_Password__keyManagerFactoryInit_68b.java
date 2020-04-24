/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 68 Data flow: data passed as a member variable in the "a" class, which is used by a method in another class in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__keyManagerFactoryInit;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import javax.net.ssl.KeyManagerFactory;
import java.security.KeyStore;

public class CWE259_Hard_Coded_Password__keyManagerFactoryInit_68b
{

	public void badSink() throws Throwable
    {
    	String data = CWE259_Hard_Coded_Password__keyManagerFactoryInit_68a.data;
    	
    	
        
        if (data != null)
        {
            try
            {
            	KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
				KeyStore ks = KeyStore.getInstance("JKS");
				kmf.init(ks, data.toCharArray());
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
    public void goodG2BSink() throws Throwable
    {
    	String data = CWE259_Hard_Coded_Password__keyManagerFactoryInit_68a.data;
    
    	
        
        if (data != null)
        {
            try
            {
            	KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
				KeyStore ks = KeyStore.getInstance("JKS");
				kmf.init(ks, data.toCharArray());
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
	public void goodCharSink() throws Throwable
    {
    	char[] data = CWE259_Hard_Coded_Password__keyManagerFactoryInit_68a.dataChar;
    
    	
        
        if (data != null)
        {
            try
            {
            	KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
				KeyStore ks = KeyStore.getInstance("JKS");
				kmf.init(ks, data);
            	
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
		Properties properties = CWE259_Hard_Coded_Password__keyManagerFactoryInit_68a.properties;
	
		
        
        if (properties != null)
        {
            try
            {
            	KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
				KeyStore ks = KeyStore.getInstance("JKS");
				kmf.init(ks, properties.getProperty("password").toCharArray());
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
	}
}