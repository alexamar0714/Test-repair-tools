/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 67 Data flow: data passed in a class from one method to another in different source files in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__keyStoreSpiEngineSetKeyEntry;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import java.security.KeyStore;
import java.lang.reflect.Field;
import java.security.KeyStoreSpi;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.KeyPair;

public class CWE259_Hard_Coded_Password__keyStoreSpiEngineSetKeyEntry_67b
{

	public void badSink(CWE259_Hard_Coded_Password__keyStoreSpiEngineSetKeyEntry_67a.Container dataContainer) throws Throwable
    {
    	String data = dataContainer.containerOne;
    	
    	KeyPair kp = new KeyPair(null, null);
        X509Certificate[] cert = new  X509Certificate[1];
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance("JKS");
        		Field spiField = KeyStore.class.getDeclaredField("keyStoreSpi");
        		spiField.setAccessible(true);
        		KeyStoreSpi spi = (KeyStoreSpi) spiField.get(keystore);
        		spi.engineSetKeyEntry("alias", kp.getPrivate(), data.toCharArray(), new Certificate[] {cert[0]});
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
    public void goodG2BSink(CWE259_Hard_Coded_Password__keyStoreSpiEngineSetKeyEntry_67a.Container dataContainer) throws Throwable
    {
    	String data = dataContainer.containerOne;
    	
    	KeyPair kp = new KeyPair(null, null);
        X509Certificate[] cert = new  X509Certificate[1];
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance("JKS");
        		Field spiField = KeyStore.class.getDeclaredField("keyStoreSpi");
        		spiField.setAccessible(true);
        		KeyStoreSpi spi = (KeyStoreSpi) spiField.get(keystore);
        		spi.engineSetKeyEntry("alias", kp.getPrivate(), data.toCharArray(), new Certificate[] {cert[0]});
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
	public void goodCharSink(CWE259_Hard_Coded_Password__keyStoreSpiEngineSetKeyEntry_67a.ContainerTwo dataContainer) throws Throwable
    {
    	char[] data = dataContainer.containerOne;
    	
    	KeyPair kp = new KeyPair(null, null);
        X509Certificate[] cert = new  X509Certificate[1];
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance("JKS");
        		Field spiField = KeyStore.class.getDeclaredField("keyStoreSpi");
        		spiField.setAccessible(true);
        		KeyStoreSpi spi = (KeyStoreSpi) spiField.get(keystore);
        		spi.engineSetKeyEntry("alias", kp.getPrivate(), data, new Certificate[] {cert[0]});
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        	
        	/* Cleanup the password */
        	Arrays.fill(data, 'x');
        }
    }
	
	public void goodExpectedSink(CWE259_Hard_Coded_Password__keyStoreSpiEngineSetKeyEntry_67a.ContainerThree dataContainer) throws Throwable
	{
		Properties properties = dataContainer.containerOne;
		
		KeyPair kp = new KeyPair(null, null);
        X509Certificate[] cert = new  X509Certificate[1];
        
        if (properties != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance("JKS");
        		Field spiField = KeyStore.class.getDeclaredField("keyStoreSpi");
        		spiField.setAccessible(true);
        		KeyStoreSpi spi = (KeyStoreSpi) spiField.get(keystore);
        		spi.engineSetKeyEntry("alias", kp.getPrivate(), properties.getProperty("password").toCharArray(), new Certificate[] {cert[0]});
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
	}
}