/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 12 Control flow: if(IO.staticReturnsTrueOrFalse())
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__keyStoreGetInstance;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import java.security.KeyStore;


public class CWE259_Hard_Coded_Password__keyStoreGetInstance_12 extends AbstractTestCase
{
	/* uses badsource and badsink - see how tools report flaws that don't always occur */
    public void bad() throws Throwable
    {
        String data;
        if (IO.staticReturnsTrueOrFalse())
        {
            /* FLAW: Set data to a hardcoded string */
            data = "7e5tc4s3";
        }
        else
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null;
        }
        
        
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance(new File("temp_file"), data.toCharArray());

            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
     
    /* goodG2B() - use goodsource and badsink by changing the "if" so that
     * both branches use the GoodSource */
    private void goodG2B1() throws Throwable
    {
        String data;
        if (IO.staticReturnsTrueOrFalse())
        {
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
        }
        else
        {
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
       	}
       	
       	
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance(new File("temp_file"), data.toCharArray());

            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
	}
    
    /* goodChar() - uses the expected Properties file and a char[] data variable*/
	private void goodChar() throws Throwable
	{
		char[] data = null;

		Properties properties = new Properties();
        FileInputStream streamFileInput = null;
        
        if (IO.staticReturnsTrueOrFalse())
        {
            try
	        {
	            streamFileInput = new FileInputStream("src/juliet_test/resources/config.properties");
	            properties.load(streamFileInput);
	            
	            /* FIX */
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
        }
        else
        {
            try
	        {
	            streamFileInput = new FileInputStream("src/juliet_test/resources/config.properties");
	            properties.load(streamFileInput);
	            
	            /* FIX */
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
        }
        
        
        
        if (data != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance(new File("temp_file"), data);

            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

            
            /* Cleanup the password */
        	Arrays.fill(data, 'x');
        }
	}
	
	/* goodExpected() - uses the expected Properties file and uses the password directly from it*/
	private void goodExpected() throws Throwable
	{
		Properties properties = new Properties();
        FileInputStream streamFileInput = null;
        
        if (IO.staticReturnsTrueOrFalse()){
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
	    }
	    else
        {
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
        }
        
        
        
        if (properties != null)
        {
            try
            {
            	KeyStore keystore = KeyStore.getInstance(new File("temp_file"), properties.getProperty("password").toCharArray());

            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
	}
    
    public void good() throws Throwable
    {
        goodG2B1();
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