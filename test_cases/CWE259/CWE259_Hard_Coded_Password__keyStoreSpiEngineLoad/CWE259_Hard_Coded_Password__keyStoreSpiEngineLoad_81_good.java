/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
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


public class CWE259_Hard_Coded_Password__keyStoreSpiEngineLoad_81_good extends CWE259_Hard_Coded_Password__keyStoreSpiEngineLoad_81_base
{

	public void action(String data) throws Throwable
    {
        /* FIX */
        try
        {
        	InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
        		BufferedReader readerBuffered = new BufferedReader(readerInputStream);
        	
        		/* POTENTIAL FLAW: Read data from the console using readLine */
        		data = readerBuffered.readLine();
       	}
       	catch (IOException exceptIO)
       		{
       			IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
       		}
       	
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
    
    public void action(char[] data) throws Throwable
    {
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
    
    public void action(Properties properties) throws Throwable
    {
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