/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 72 Data flow: data passed in a Vector from one method to another in different source files in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__rowSetSetPassword;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.io.*;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class CWE259_Hard_Coded_Password__rowSetSetPassword_72b
{

	public void badSink(Vector<String> dataVector) throws Throwable
    {
    	String data = dataVector.remove(2);
    	
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
	
    public void goodG2BSink(Vector<String> dataVector) throws Throwable
    {
    	String data = dataVector.remove(2);
    	
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
	
	public void goodCharSink(Vector<char[]> dataVector) throws Throwable
    {
    	char[] data = dataVector.remove(2);
    
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
	
	public void goodExpectedSink(Vector<Properties> dataVector) throws Throwable
	{
		Properties properties = dataVector.remove(2);
	
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
}