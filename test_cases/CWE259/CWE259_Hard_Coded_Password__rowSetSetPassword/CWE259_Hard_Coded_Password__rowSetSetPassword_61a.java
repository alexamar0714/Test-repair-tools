/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 61 Data flow: data returned from one method to another in different classes in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__rowSetSetPassword;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class CWE259_Hard_Coded_Password__rowSetSetPassword_61a extends AbstractTestCase
{

	/* use badsource and badsink */
	public void bad() throws Throwable
    {
    	String data = (new CWE259_Hard_Coded_Password__rowSetSetPassword_61b()).badSource();
    	
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
        
    /* goodG2B() - use goodsource and badsink */
    private void goodG2B() throws Throwable
    {
    	String data = (new CWE259_Hard_Coded_Password__rowSetSetPassword_61b()).goodG2BSource();
    	
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
    	char[] data = (new CWE259_Hard_Coded_Password__rowSetSetPassword_61b()).goodCharSource();
    	
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
		Properties properties = (new CWE259_Hard_Coded_Password__rowSetSetPassword_61b()).goodExpectedSource();
		
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