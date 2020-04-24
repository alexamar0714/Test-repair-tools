/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 22 Control flow: Flow controlled by value of a public static variable. Sink functions are in a separate file from sources.
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__basicAuthenticatorCheckCredentials;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import com.sun.net.httpserver.BasicAuthenticator;

public class CWE259_Hard_Coded_Password__basicAuthenticatorCheckCredentials_22b
{

	public String badSource() throws Throwable
    {
    	String data;
    
        if (CWE259_Hard_Coded_Password__basicAuthenticatorCheckCredentials_22a.badPublicStatic)
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
        return data;
    }

    /* goodG2B1() - use goodsource and badsink by setting the static variable to false instead of true */
    public String goodG2B1Source() throws Throwable
    {
        String data;
		
		if (CWE259_Hard_Coded_Password__basicAuthenticatorCheckCredentials_22a.goodG2B1PublicStatic)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null;
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
       	return data;
       	
	}
	
	/* goodG2B2() - use goodsource and badsink by reversing the blocks in the if in the sink function */
    public String goodG2B2Source() throws Throwable
    {
    	String data;
		
		if (CWE259_Hard_Coded_Password__basicAuthenticatorCheckCredentials_22a.goodG2B2PublicStatic)
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
        	/* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null;
       	}
       	return data;
    }
	
	/* goodCharSource() - uses the expected Properties file and a char[] data variable*/
	public char[] goodCharSource() throws Throwable
	{
		char[] data = null;
		
		if (CWE259_Hard_Coded_Password__basicAuthenticatorCheckCredentials_22a.goodG2B2PublicStatic)
        {
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
        } else
        {
        	/* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null;
        }
        return data;
	}
	
	/* goodExpectedSource() - uses the expected Properties file and uses the password directly from it*/
	public Properties goodExpectedSource() throws Throwable
	{
		Properties properties = new Properties();
        FileInputStream streamFileInput = null;
        if (CWE259_Hard_Coded_Password__basicAuthenticatorCheckCredentials_22a.goodG2B2PublicStatic)
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
	    else
	    {
	    	/* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            properties = null;
	    }      
        return properties;
	}
}