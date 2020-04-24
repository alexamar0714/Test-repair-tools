/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 74 Data flow: data passed in a HashMap from one method to another in different source files in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__newPBEKeySpec3;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.HashMap;
import java.util.logging.Level;
import java.io.*;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.SecureRandom;

public class CWE259_Hard_Coded_Password__newPBEKeySpec3_74a extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        String data;

        /* FLAW: Set data to a hardcoded string */
        data = "7e5tc4s3";

		HashMap<Integer,String> dataHashMap = new HashMap<Integer,String>();
        dataHashMap.put(0, data);
        dataHashMap.put(1, data);
        dataHashMap.put(2, data);
        (new  CWE259_Hard_Coded_Password__newPBEKeySpec3_74b()).badSink(dataHashMap);
    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B() throws Throwable
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
       	
       	HashMap<Integer,String> dataHashMap = new HashMap<Integer,String>();
        dataHashMap.put(0, data);
        dataHashMap.put(1, data);
        dataHashMap.put(2, data);
       	(new  CWE259_Hard_Coded_Password__newPBEKeySpec3_74b()).goodG2BSink(dataHashMap);	
	}
	 	
	/* goodChar() - uses the expected Properties file and a char[] data variable*/
	private void goodChar() throws Throwable
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
        
        HashMap<Integer,char[]> dataHashMap = new HashMap<Integer,char[]>();
        dataHashMap.put(0, data);
        dataHashMap.put(1, data);
        dataHashMap.put(2, data);
	    (new  CWE259_Hard_Coded_Password__newPBEKeySpec3_74b()).goodCharSink(dataHashMap);
	}
	
	/* goodExpected() - uses the expected Properties file and uses the password directly from it*/
	private void goodExpected() throws Throwable
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
        
        HashMap<Integer,Properties> dataHashMap = new HashMap<Integer,Properties>();
        dataHashMap.put(0, properties);
        dataHashMap.put(1, properties);
        dataHashMap.put(2, properties);
        (new  CWE259_Hard_Coded_Password__newPBEKeySpec3_74b()).goodExpectedSink(dataHashMap);
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