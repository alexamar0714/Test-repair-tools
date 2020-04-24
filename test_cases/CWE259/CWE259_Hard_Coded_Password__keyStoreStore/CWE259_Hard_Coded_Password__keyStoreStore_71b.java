/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 71 Data flow: data passed as an Object reference argument from one method to another in different classes in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__keyStoreStore;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import java.security.KeyStore;


public class CWE259_Hard_Coded_Password__keyStoreStore_71b
{

	public void badSink(Object dataObject) throws Throwable
    {
    	String data = (String) dataObject;
    	
    	OutputStream os = null;
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance("JKS");
				File f = new File("temp_file");
    			os = new FileOutputStream(f);
    			keystore.store(os, data.toCharArray());
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}
			finally
			{
				os.close();
			}
        }
    }
	
    public void goodG2BSink(Object dataObject) throws Throwable
    {
    	String data = (String) dataObject;
    	
    	OutputStream os = null;
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance("JKS");
				File f = new File("temp_file");
    			os = new FileOutputStream(f);
    			keystore.store(os, data.toCharArray());
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}
			finally
			{
				os.close();
			}
        }
    }
	
	public void goodCharSink(Object dataObject) throws Throwable
    {
    	char[] data = (char[]) dataObject;
    
    	OutputStream os = null;
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance("JKS");
				File f = new File("temp_file");
    			os = new FileOutputStream(f);
    			keystore.store(os, data);
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}
			finally
			{
				os.close();
			}
        	
        	/* Cleanup the password */
        	Arrays.fill(data, 'x');
        }
    }
	
	public void goodExpectedSink(Object dataObject) throws Throwable
	{
		Properties properties = (Properties) dataObject;
	
		OutputStream os = null;
        
        if (properties != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance("JKS");
				File f = new File("temp_file");
    			os = new FileOutputStream(f);
    			keystore.store(os, properties.getProperty("password").toCharArray());
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}
			finally
			{
				os.close();
			}
        }
	}
}