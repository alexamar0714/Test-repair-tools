/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 42 Data flow: data returned from one method to another in the same class
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__newKeyStorePasswordProtection2;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import java.security.KeyStore;

public class CWE259_Hard_Coded_Password__newKeyStorePasswordProtection2_42 extends AbstractTestCase
{

	/* use badsource and badsink */
	public void bad() throws Throwable
    {
    	String data = badSource();
    	
    	
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				KeyStore.ProtectionParameter keyPassword = new KeyStore.PasswordProtection(data.toCharArray(), "PBEWithHmacSHA256AndAES_256", null);
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
    private String badSource() throws Throwable
    {
        String data;

        /* FLAW: Set data to a hardcoded string */
        data = "7e5tc4s3";

        return data;
    }
        
    /* goodG2B() - use goodsource and badsink */
    private void goodG2B() throws Throwable
    {
    	String data = goodG2BSource();
    	
    	
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				KeyStore.ProtectionParameter keyPassword = new KeyStore.PasswordProtection(data.toCharArray(), "PBEWithHmacSHA256AndAES_256", null);
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }

    private String goodG2BSource() throws Throwable
    {
        String data;

        data = ""; /* init data */

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
       	
       	return data;	
	}
	
	/* goodChar() - uses the expected Properties file and a char[] data variable*/
	private void goodChar() throws Throwable
    {
    	char[] data = goodCharSource();
    	
    	
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				KeyStore.ProtectionParameter keyPassword = new KeyStore.PasswordProtection(data, "PBEWithHmacSHA256AndAES_256", null);
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        	
        	/* Cleanup the password */
        	Arrays.fill(data, 'x');
        }
    }
	 	
	
	private char[] goodCharSource() throws Throwable
	{
        char[] data = null;
		
		Properties properties = new Properties();
        FileInputStream streamFileInput = null;
        try
        {
            streamFileInput = new FileInputStream("src/juliet_test/resources/config.properties");
            properties.load(streamFileInput);

            data = properties.getProperty("password").toCharArray();
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        }
        finally
        {
            /* clean up stream reading objects */
            try
            {
                if (streamFileInput != null)
                {
                    streamFileInput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
            }
        }
	    return data;
	}
	
	/* goodExpected() - uses the expected Properties file and uses the password directly from it*/
	private void goodExpected() throws Throwable
	{
		Properties properties = goodExpectedSource();
		
		
        
        if (properties != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				KeyStore.ProtectionParameter keyPassword = new KeyStore.PasswordProtection(properties.getProperty("password").toCharArray(), "PBEWithHmacSHA256AndAES_256", null);
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
	}
	
	private Properties goodExpectedSource() throws Throwable
	{
        Properties properties = new Properties();
        FileInputStream streamFileInput = null;
        try
        {
            streamFileInput = new FileInputStream("src/juliet_test/resources/config.properties");
            properties.load(streamFileInput);
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        }
        finally
        {
            /* clean up stream reading objects */
            try
            {
                if (streamFileInput != null)
                {
                    streamFileInput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
            }
        }
        return properties;
	}
	
	public void good() throws Throwable
    {
        goodG2B();
        goodChar();
        goodExpected();
    } 
	
	/* Below is the main(). It is only used when building this testcase on
     * its own for testing or for building a binary to use in testing binary
     * analysis tools. It is not used when compiling all the testcases as one
     * application, which is how source code analysis tools are tested.
     */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}