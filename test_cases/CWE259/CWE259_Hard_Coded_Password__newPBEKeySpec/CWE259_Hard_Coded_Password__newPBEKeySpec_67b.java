/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 67 Data flow: data passed in a class from one method to another in different source files in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__newPBEKeySpec;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class CWE259_Hard_Coded_Password__newPBEKeySpec_67b
{

	public void badSink(CWE259_Hard_Coded_Password__newPBEKeySpec_67a.Container dataContainer) throws Throwable
    {
    	String data = dataContainer.containerOne;
    	
    	
        
        if (data != null)
        {
            try
            {
            	SecretKeyFactory keyFact = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        		PBEKeySpec pbeSpec = new PBEKeySpec(data.toCharArray());
            	SecretKey key = keyFact.generateSecret(pbeSpec);
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
    public void goodG2BSink(CWE259_Hard_Coded_Password__newPBEKeySpec_67a.Container dataContainer) throws Throwable
    {
    	String data = dataContainer.containerOne;
    	
    	
        
        if (data != null)
        {
            try
            {
            	SecretKeyFactory keyFact = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        		PBEKeySpec pbeSpec = new PBEKeySpec(data.toCharArray());
            	SecretKey key = keyFact.generateSecret(pbeSpec);
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
	public void goodCharSink(CWE259_Hard_Coded_Password__newPBEKeySpec_67a.ContainerTwo dataContainer) throws Throwable
    {
    	char[] data = dataContainer.containerOne;
    	
    	
        
        if (data != null)
        {
            try
            {
            	SecretKeyFactory keyFact = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        		PBEKeySpec pbeSpec = new PBEKeySpec(data);
            	SecretKey key = keyFact.generateSecret(pbeSpec);
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        	
        	/* Cleanup the password */
        	Arrays.fill(data, 'x');
        }
    }
	
	public void goodExpectedSink(CWE259_Hard_Coded_Password__newPBEKeySpec_67a.ContainerThree dataContainer) throws Throwable
	{
		Properties properties = dataContainer.containerOne;
		
		
        
        if (properties != null)
        {
            try
            {
            	SecretKeyFactory keyFact = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        		PBEKeySpec pbeSpec = new PBEKeySpec(properties.getProperty("password").toCharArray());
            	SecretKey key = keyFact.generateSecret(pbeSpec);
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
	}
}