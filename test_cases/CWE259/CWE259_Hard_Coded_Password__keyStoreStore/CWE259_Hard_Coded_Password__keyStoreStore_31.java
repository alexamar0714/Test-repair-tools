/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 31 Data flow: make a copy of data within the same method
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__keyStoreStore;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import java.security.KeyStore;


public class CWE259_Hard_Coded_Password__keyStoreStore_31 extends AbstractTestCase
{

	/* uses badsource and badsink */
    public void bad() throws Throwable
    {
        String dataCopy;
        {
            String data;

            /* FLAW: Set data to a hardcoded string */
            data = "7e5tc4s3";

            dataCopy = data;
        }
        {
        	String data = dataCopy;
        	
        	OutputStream os = null;
        
	        if (data != null)
	        {
	            try
	            {
	            	KeyStore keystore = KeyStore.getInstance("JKS");
				File f = new File("temp_file");
    			os = new FileOutputStream(f);
    			keystore.store(os, data.toCharArray());
	            	
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
        
       
    }

    /* goodG2B() - uses goodsource and badsink */
    private void goodG2B() throws Throwable
    {
    	String dataCopy;
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
	       	
	       	dataCopy = data;
       	}
       	{
       		String data = dataCopy;
       		
       		OutputStream os = null;
        
	        if (data != null)
	        {
	            try
	            {
	            	KeyStore keystore = KeyStore.getInstance("JKS");
				File f = new File("temp_file");
    			os = new FileOutputStream(f);
    			keystore.store(os, data.toCharArray());
	            	
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
	}
	
	/* goodChar() - uses the expected Properties file and a char[] data variable*/
	private void goodChar() throws Throwable
	{
		char[] dataCopy;
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
	        dataCopy = data;
        }
        {
       		char[] data = dataCopy;
        
	        OutputStream os = null;
	        
	        if (data != null)
	        {
	            try
	            {
	            	KeyStore keystore = KeyStore.getInstance("JKS");
				File f = new File("temp_file");
    			os = new FileOutputStream(f);
    			keystore.store(os, data);
	            	
	            }
	            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}
			finally
			{
				os.close();
			}
	        	
	        	/* Cleanup the password */
	        	Arrays.fill(data, 'x');
	        }
	    }
	}
	
	/* goodExpected() - uses the expected Properties file and uses the password directly from it*/
	private void goodExpected() throws Throwable
	{
		Properties propertiesCopy = new Properties();
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
	        propertiesCopy = properties;
        }
        {
        	Properties properties = propertiesCopy;
        	
	        OutputStream os = null;
	        
	        if (properties != null)
	        {
	            try
	            {
	            	KeyStore keystore = KeyStore.getInstance("JKS");
				File f = new File("temp_file");
    			os = new FileOutputStream(f);
    			keystore.store(os, properties.getProperty("password").toCharArray());
	            	
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