/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__rowSetSetPassword;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class CWE259_Hard_Coded_Password__rowSetSetPassword_81_good extends CWE259_Hard_Coded_Password__rowSetSetPassword_81_base
{

	public void action(String data) throws Throwable
    {
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
    
    public void action(char[] data) throws Throwable
    {
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
    
    public void action(Properties properties) throws Throwable
    {
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