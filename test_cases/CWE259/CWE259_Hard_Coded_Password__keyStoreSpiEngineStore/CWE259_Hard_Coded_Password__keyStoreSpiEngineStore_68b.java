/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 68 Data flow: data passed as a member variable in the "a" class, which is used by a method in another class in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__keyStoreSpiEngineStore;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import java.security.KeyStore;
import java.lang.reflect.Field;
import java.security.KeyStoreSpi;

public class CWE259_Hard_Coded_Password__keyStoreSpiEngineStore_68b
{

	public void badSink() throws Throwable
    {
    	String data = CWE259_Hard_Coded_Password__keyStoreSpiEngineStore_68a.data;
    	
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
	
    public void goodG2BSink() throws Throwable
    {
    	String data = CWE259_Hard_Coded_Password__keyStoreSpiEngineStore_68a.data;
    
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
	
	public void goodCharSink() throws Throwable
    {
    	char[] data = CWE259_Hard_Coded_Password__keyStoreSpiEngineStore_68a.dataChar;
    
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
	
	public void goodExpectedSink() throws Throwable
	{
		Properties properties = CWE259_Hard_Coded_Password__keyStoreSpiEngineStore_68a.properties;
	
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