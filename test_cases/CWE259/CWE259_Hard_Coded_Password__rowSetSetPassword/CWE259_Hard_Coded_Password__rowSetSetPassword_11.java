/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 11 Control flow: if(IO.staticReturnsTrue()) and if(IO.staticReturnsFalse())
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__rowSetSetPassword;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class CWE259_Hard_Coded_Password__rowSetSetPassword_11 extends AbstractTestCase
{
	/* uses badsource and badsink */
    public void bad() throws Throwable
    {
        String data;
        if (IO.staticReturnsTrue())
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
        
        JdbcRowSet rowSet = null;
        
        if (data != null)
        {
            try
            {
            	rowSet = RowSetProvider.newFactory().createJdbcRowSet();
				/* POTENTIAL FLAW: data used as password in database connection */
				rowSet.setPassword(data);
            	rowSet.setUrl("url");
        		rowSet.setUsername("root");
        		rowSet.setCommand("SELECT * FROM customers WHERE sex = ?");
        		rowSet.setString(1, "male");
        		rowSet.execute();

            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}
			finally
			{
				if (rowSet != null)
				{
					rowSet.close();
				}
			}
        }
    }
     
    /* goodG2B1() - use goodsource and badsink by changing IO.staticReturnsTrue() to IO.staticReturnsFalse() */
    private void goodG2B1() throws Throwable
    {
        String data;
        if (IO.staticReturnsFalse())
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
       	
       	JdbcRowSet rowSet = null;
        
        if (data != null)
        {
            try
            {
            	rowSet = RowSetProvider.newFactory().createJdbcRowSet();
				/* POTENTIAL FLAW: data used as password in database connection */
				rowSet.setPassword(data);
            	rowSet.setUrl("url");
        		rowSet.setUsername("root");
        		rowSet.setCommand("SELECT * FROM customers WHERE sex = ?");
        		rowSet.setString(1, "male");
        		rowSet.execute();

            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}
			finally
			{
				if (rowSet != null)
				{
					rowSet.close();
				}
			}
        }
	}
	
	/* goodG2B2() - use goodsource and badsink by reversing statements in if */
    private void goodG2B2() throws Throwable
    {
        String data;
        if (IO.staticReturnsTrue())
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
        
        JdbcRowSet rowSet = null;
        
        if (data != null)
        {
            try
            {
            	rowSet = RowSetProvider.newFactory().createJdbcRowSet();
				/* POTENTIAL FLAW: data used as password in database connection */
				rowSet.setPassword(data);
            	rowSet.setUrl("url");
        		rowSet.setUsername("root");
        		rowSet.setCommand("SELECT * FROM customers WHERE sex = ?");
        		rowSet.setString(1, "male");
        		rowSet.execute();

            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}
			finally
			{
				if (rowSet != null)
				{
					rowSet.close();
				}
			}
        }
    }
    
    /* goodChar() - uses the expected Properties file and a char[] data variable*/
	private void goodChar() throws Throwable
	{
		char[] data = null;

		Properties properties = new Properties();
        FileInputStream streamFileInput = null;
        
        if (IO.staticReturnsTrue())
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
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null;
        }
        
        JdbcRowSet rowSet = null;
        
        if (data != null)
        {
            try
            {
            	rowSet = RowSetProvider.newFactory().createJdbcRowSet();
				/* POTENTIAL FLAW: data used as password in database connection */
				rowSet.setPassword(String.valueOf(data));
            	rowSet.setUrl("url");
        		rowSet.setUsername("root");
        		rowSet.setCommand("SELECT * FROM customers WHERE sex = ?");
        		rowSet.setString(1, "male");
        		rowSet.execute();

            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}
			finally
			{
				if (rowSet != null)
				{
					rowSet.close();
				}
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
        
        if (IO.staticReturnsTrue()){
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
        
        JdbcRowSet rowSet = null;
        
        if (properties != null)
        {
            try
            {
            	rowSet = RowSetProvider.newFactory().createJdbcRowSet();
				/* POTENTIAL FLAW: data used as password in database connection */
				rowSet.setPassword(properties.getProperty("password"));
            	rowSet.setUrl("url");
        		rowSet.setUsername("root");
        		rowSet.setCommand("SELECT * FROM customers WHERE sex = ?");
        		rowSet.setString(1, "male");
        		rowSet.execute();

            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}
			finally
			{
				if (rowSet != null)
				{
					rowSet.close();
				}
			}
        }
	}
    
    public void good() throws Throwable
    {
        goodG2B1();
        goodG2B2();
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