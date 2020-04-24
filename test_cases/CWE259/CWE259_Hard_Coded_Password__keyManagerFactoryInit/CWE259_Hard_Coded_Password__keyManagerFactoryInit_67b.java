/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 67 Data flow: data passed in a class from one method to another in different source files in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__keyManagerFactoryInit;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import javax.net.ssl.KeyManagerFactory;
import java.security.KeyStore;

public class CWE259_Hard_Coded_Password__keyManagerFactoryInit_67b
{

	public void badSink(CWE259_Hard_Coded_Password__keyManagerFactoryInit_67a.Container dataContainer) throws Throwable
    {
    	String data = dataContainer.containerOne;
    	
    	
        
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
	
    public void goodG2BSink(CWE259_Hard_Coded_Password__keyManagerFactoryInit_67a.Container dataContainer) throws Throwable
    {
    	String data = dataContainer.containerOne;
    	
    	
        
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
	
	public void goodCharSink(CWE259_Hard_Coded_Password__keyManagerFactoryInit_67a.ContainerTwo dataContainer) throws Throwable
    {
    	char[] data = dataContainer.containerOne;
    	
    	
        
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
	
	public void goodExpectedSink(CWE259_Hard_Coded_Password__keyManagerFactoryInit_67a.ContainerThree dataContainer) throws Throwable
	{
		Properties properties = dataContainer.containerOne;
		
		
        
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