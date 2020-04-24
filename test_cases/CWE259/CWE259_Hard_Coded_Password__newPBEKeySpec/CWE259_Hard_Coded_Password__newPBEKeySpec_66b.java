/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 66 Data flow: data passed in an array from one method to another in different source files in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__newPBEKeySpec;

import testcasesupport.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class CWE259_Hard_Coded_Password__newPBEKeySpec_66b
{

	public void badSink(String dataArray[]) throws Throwable
    {
    	String data = dataArray[2];
    	
    	
        
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
	
    public void goodG2BSink(String dataArray[]) throws Throwable
    {
    	String data = dataArray[2];
    	
    	
        
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
	
	public void goodCharSink(char[][] dataArray) throws Throwable
    {
    	char[] data = dataArray[2];
    	
    	
        
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
        	for (char[] content : dataArray)
        	{
        		Arrays.fill(content, 'x');
        	}
        }
    }
	
	public void goodExpectedSink(List<Properties> propertiesList) throws Throwable
	{
		Properties properties = propertiesList.get(2);
		
        
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