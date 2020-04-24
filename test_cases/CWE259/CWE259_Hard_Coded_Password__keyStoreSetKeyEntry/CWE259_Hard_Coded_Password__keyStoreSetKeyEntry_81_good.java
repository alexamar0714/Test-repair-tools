/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__keyStoreSetKeyEntry;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;

public class CWE259_Hard_Coded_Password__keyStoreSetKeyEntry_81_good extends CWE259_Hard_Coded_Password__keyStoreSetKeyEntry_81_base
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
    
    public void action(char[] data) throws Throwable
    {
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
        }
    }
    
    public void action(Properties properties) throws Throwable
    {
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