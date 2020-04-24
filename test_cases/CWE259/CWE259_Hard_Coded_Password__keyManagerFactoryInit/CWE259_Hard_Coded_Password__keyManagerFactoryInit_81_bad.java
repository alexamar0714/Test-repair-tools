/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__keyManagerFactoryInit;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import javax.net.ssl.KeyManagerFactory;
import java.security.KeyStore;

public class CWE259_Hard_Coded_Password__keyManagerFactoryInit_81_bad extends CWE259_Hard_Coded_Password__keyManagerFactoryInit_81_base
{

	public void action(String data) throws Throwable
    {
    	
        
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
    
    public void action(char[] data) throws Throwable
    {
    }
    
    public void action(Properties properties) throws Throwable
    {
    }
}