/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 68 Data flow: data passed as a member variable in the "a" class, which is used by a method in another class in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__newPBEKeySpec2;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.SecureRandom;

public class CWE259_Hard_Coded_Password__newPBEKeySpec2_68b
{

	public void badSink() throws Throwable
    {
    	String data = CWE259_Hard_Coded_Password__newPBEKeySpec2_68a.data;
    	
    	final SecureRandom random = new SecureRandom();
			final byte[] prefix = new byte[16];
        
        if (data != null)
        {
            try
            {
            	random.nextBytes(prefix);
				SecretKeyFactory keyFact = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        		PBEKeySpec pbeSpec = new PBEKeySpec(data.toCharArray(), prefix, 65536);
            	SecretKey key = keyFact.generateSecret(pbeSpec);
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
    public void goodG2BSink() throws Throwable
    {
    	String data = CWE259_Hard_Coded_Password__newPBEKeySpec2_68a.data;
    
    	final SecureRandom random = new SecureRandom();
			final byte[] prefix = new byte[16];
        
        if (data != null)
        {
            try
            {
            	random.nextBytes(prefix);
				SecretKeyFactory keyFact = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        		PBEKeySpec pbeSpec = new PBEKeySpec(data.toCharArray(), prefix, 65536);
            	SecretKey key = keyFact.generateSecret(pbeSpec);
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
	public void goodCharSink() throws Throwable
    {
    	char[] data = CWE259_Hard_Coded_Password__newPBEKeySpec2_68a.dataChar;
    
    	final SecureRandom random = new SecureRandom();
			final byte[] prefix = new byte[16];
        
        if (data != null)
        {
            try
            {
            	random.nextBytes(prefix);
				SecretKeyFactory keyFact = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        		PBEKeySpec pbeSpec = new PBEKeySpec(data, prefix, 65536);
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
	
	public void goodExpectedSink() throws Throwable
	{
		Properties properties = CWE259_Hard_Coded_Password__newPBEKeySpec2_68a.properties;
	
		final SecureRandom random = new SecureRandom();
			final byte[] prefix = new byte[16];
        
        if (properties != null)
        {
            try
            {
            	random.nextBytes(prefix);
				SecretKeyFactory keyFact = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        		PBEKeySpec pbeSpec = new PBEKeySpec(properties.getProperty("password").toCharArray(), prefix, 65536);
            	SecretKey key = keyFact.generateSecret(pbeSpec);
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
	}
}