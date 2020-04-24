/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 66 Data flow: data passed in an array from one method to another in different source files in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__keyStoreSetKeyEntry;

import testcasesupport.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;

public class CWE259_Hard_Coded_Password__keyStoreSetKeyEntry_66b
{

	public void badSink(String dataArray[]) throws Throwable
    {
    	String data = dataArray[2];
    	
    	KeyPair kp = new KeyPair(null, null);
        X509Certificate[] cert = new  X509Certificate[1];
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance("JKS");
        		keystore.load(null, null);
		        keystore.setCertificateEntry("cert", cert[0]);
       		keystore.setKeyEntry("key", kp.getPrivate(), data.toCharArray(), new Certificate[] {cert[0]});
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
    public void goodG2BSink(String dataArray[]) throws Throwable
    {
    	String data = dataArray[2];
    	
    	KeyPair kp = new KeyPair(null, null);
        X509Certificate[] cert = new  X509Certificate[1];
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance("JKS");
        		keystore.load(null, null);
		        keystore.setCertificateEntry("cert", cert[0]);
       		keystore.setKeyEntry("key", kp.getPrivate(), data.toCharArray(), new Certificate[] {cert[0]});
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
	public void goodCharSink(char[][] dataArray) throws Throwable
    {
    	char[] data = dataArray[2];
    	
    	KeyPair kp = new KeyPair(null, null);
        X509Certificate[] cert = new  X509Certificate[1];
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance("JKS");
       		keystore.load(null, null);
		        keystore.setCertificateEntry("cert", cert[0]);
        		keystore.setKeyEntry("key", kp.getPrivate(), data, new Certificate[] {cert[0]});
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        	
        	/* Cleanup the password */
        	Arrays.fill(data, 'x');
        	for (char[] content : dataArray)
        	{
        		Arrays.fill(content, 'x');
        	}
        }
    }
	
	public void goodExpectedSink(List<Properties> propertiesList) throws Throwable
	{
		Properties properties = propertiesList.get(2);
		KeyPair kp = new KeyPair(null, null);
        X509Certificate[] cert = new  X509Certificate[1];
        
        if (properties != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance("JKS");
		        keystore.load(null, null);
        		keystore.setCertificateEntry("cert", cert[0]);
        		keystore.setKeyEntry("key", kp.getPrivate(), properties.getProperty("password").toCharArray(), new Certificate[] {cert[0]});
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
	}
}