/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 74 Data flow: data passed in a HashMap from one method to another in different source files in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__keyStoreSpiEngineStore;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.HashMap;
import java.util.logging.Level;
import java.io.*;
import java.security.KeyStore;
import java.lang.reflect.Field;
import java.security.KeyStoreSpi;

public class CWE259_Hard_Coded_Password__keyStoreSpiEngineStore_74b
{

	public void badSink(HashMap<Integer,String> dataHashMap) throws Throwable
    {
    	String data = dataHashMap.get(2);
    	
    	OutputStream os = null;
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance("JKS");
        		Field spiField = KeyStore.class.getDeclaredField("keyStoreSpi");
        		spiField.setAccessible(true);
				File f = new File("temp_file");
				os = new FileOutputStream(f);
        		KeyStoreSpi spi = (KeyStoreSpi) spiField.get(keystore);
        		spi.engineStore(os, data.toCharArray());
            	
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
	
    public void goodG2BSink(HashMap<Integer,String> dataHashMap) throws Throwable
    {
    	String data = dataHashMap.get(2);
    	
    	OutputStream os = null;
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance("JKS");
        		Field spiField = KeyStore.class.getDeclaredField("keyStoreSpi");
        		spiField.setAccessible(true);
				File f = new File("temp_file");
				os = new FileOutputStream(f);
        		KeyStoreSpi spi = (KeyStoreSpi) spiField.get(keystore);
        		spi.engineStore(os, data.toCharArray());
            	
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
	
	public void goodCharSink(HashMap<Integer,char[]> dataHashMap) throws Throwable
    {
    	char[] data = dataHashMap.get(2);
    
    	OutputStream os = null;
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance("JKS");
        		Field spiField = KeyStore.class.getDeclaredField("keyStoreSpi");
        		spiField.setAccessible(true);
        		KeyStoreSpi spi = (KeyStoreSpi) spiField.get(keystore);
				File f = new File("temp_file");
				os = new FileOutputStream(f);
        		spi.engineStore(os, data);
            	
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
	
	public void goodExpectedSink(HashMap<Integer,Properties> dataHashMap) throws Throwable
	{
		Properties properties = dataHashMap.get(2);
	
		OutputStream os = null;
        
        if (properties != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance("JKS");
        		Field spiField = KeyStore.class.getDeclaredField("keyStoreSpi");
        		spiField.setAccessible(true);
        		KeyStoreSpi spi = (KeyStoreSpi) spiField.get(keystore);
				File f = new File("temp_file");
				os = new FileOutputStream(f);
        		spi.engineStore(os, properties.getProperty("password").toCharArray());
            	
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