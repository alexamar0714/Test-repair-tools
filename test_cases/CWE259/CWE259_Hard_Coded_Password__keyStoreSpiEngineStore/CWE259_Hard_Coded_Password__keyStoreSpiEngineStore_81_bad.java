/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
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

public class CWE259_Hard_Coded_Password__keyStoreSpiEngineStore_81_bad extends CWE259_Hard_Coded_Password__keyStoreSpiEngineStore_81_base
{

	public void action(String data) throws Throwable
    {
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
    
    public void action(char[] data) throws Throwable
    {
    }
    
    public void action(Properties properties) throws Throwable
    {
    }
}