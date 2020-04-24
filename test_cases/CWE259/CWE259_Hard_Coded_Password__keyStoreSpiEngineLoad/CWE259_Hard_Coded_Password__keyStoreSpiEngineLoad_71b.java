/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 71 Data flow: data passed as an Object reference argument from one method to another in different classes in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__keyStoreSpiEngineLoad;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import java.security.KeyStore;
import java.lang.reflect.Field;
import java.security.KeyStoreSpi;


public class CWE259_Hard_Coded_Password__keyStoreSpiEngineLoad_71b
{

	public void badSink(Object dataObject) throws Throwable
    {
    	String data = (String) dataObject;
    	
    	FileInputStream is = null;
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance("JKS");
        		Field spiField = KeyStore.class.getDeclaredField("keyStoreSpi");
        		spiField.setAccessible(true);
        		KeyStoreSpi spi = (KeyStoreSpi) spiField.get(keystore);
				is = new FileInputStream(new File("temp_file"));
        		spi.engineLoad(is, data.toCharArray());
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}
			finally
			{
				is.close();
			}
        }
    }
	
    public void goodG2BSink(Object dataObject) throws Throwable
    {
    	String data = (String) dataObject;
    	
    	FileInputStream is = null;
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance("JKS");
        		Field spiField = KeyStore.class.getDeclaredField("keyStoreSpi");
        		spiField.setAccessible(true);
        		KeyStoreSpi spi = (KeyStoreSpi) spiField.get(keystore);
				is = new FileInputStream(new File("temp_file"));
        		spi.engineLoad(is, data.toCharArray());
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}
			finally
			{
				is.close();
			}
        }
    }
	
	public void goodCharSink(Object dataObject) throws Throwable
    {
    	char[] data = (char[]) dataObject;
    
    	FileInputStream is = null;
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance("JKS");
        		Field spiField = KeyStore.class.getDeclaredField("keyStoreSpi");
        		spiField.setAccessible(true);
        		KeyStoreSpi spi = (KeyStoreSpi) spiField.get(keystore);
				is = new FileInputStream(new File("temp_file"));
        		spi.engineLoad(is, data);
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}
			finally
			{
				is.close();
			}
        	
        	/* Cleanup the password */
        	Arrays.fill(data, 'x');
        }
    }
	
	public void goodExpectedSink(Object dataObject) throws Throwable
	{
		Properties properties = (Properties) dataObject;
	
		FileInputStream is = null;
        
        if (properties != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance("JKS");
        		Field spiField = KeyStore.class.getDeclaredField("keyStoreSpi");
        		spiField.setAccessible(true);
        		KeyStoreSpi spi = (KeyStoreSpi) spiField.get(keystore);
				is = new FileInputStream(new File("temp_file"));
        		spi.engineLoad(is, properties.getProperty("password").toCharArray());
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}
			finally
			{
				is.close();
			}
        }
	}
}