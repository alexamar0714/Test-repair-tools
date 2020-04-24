/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 41 Data flow: data passed as an argument from one method to another in the same class
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password_dataSourceGetConnection;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import java.sql.*;
import com.mysql.cj.jdbc.MysqlDataSource;
import javax.sql.DataSource;

public class CWE259_Hard_Coded_Password_dataSourceGetConnection_41 extends AbstractTestCase
{

	private void badSink(String data) throws Throwable
    {
    	Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;		DataSource ds = (DataSource) new MysqlDataSource();
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				connection = ds.getConnection("root", data);

            	preparedStatement = connection.prepareStatement("select * from test_table");
				resultSet = preparedStatement.executeQuery();
            }
            catch (SQLException exceptSql)
			{
				IO.logger.log(Level.WARNING, "Error with database connection", exceptSql);
			}
			finally
			{
				try
				{
					if (resultSet != null)
					{
						resultSet.close();
					}
				}
			    catch (SQLException exceptSql)
			    {
			    	IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql);
			    }
			 
			    try
			    {
			        if (preparedStatement != null)
			        {
					 	preparedStatement.close();
			        }
			    }
			    catch (SQLException exceptSql)
			    {
			        IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql);
			    }
			 
			    try
			    {
			    	if (connection != null)
			   	    {
			   			connection.close();
			        }
			    }
			    catch (SQLException exceptSql)
			    {
			   		IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
			    }
			}
        }
    }
	
    public void bad() throws Throwable
    {
        String data;

        /* FLAW: Set data to a hardcoded string */
        data = "7e5tc4s3";

        badSink(data);
    }
    
    private void goodG2BSink(String data) throws Throwable
    {
    	Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;		DataSource ds = (DataSource) new MysqlDataSource();
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				connection = ds.getConnection("root", data);

            	preparedStatement = connection.prepareStatement("select * from test_table");
				resultSet = preparedStatement.executeQuery();
            }
            catch (SQLException exceptSql)
			{
				IO.logger.log(Level.WARNING, "Error with database connection", exceptSql);
			}
			finally
			{
				try
				{
					if (resultSet != null)
					{
						resultSet.close();
					}
				}
			    catch (SQLException exceptSql)
			    {
			    	IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql);
			    }
			 
			    try
			    {
			        if (preparedStatement != null)
			        {
					 	preparedStatement.close();
			        }
			    }
			    catch (SQLException exceptSql)
			    {
			        IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql);
			    }
			 
			    try
			    {
			    	if (connection != null)
			   	    {
			   			connection.close();
			        }
			    }
			    catch (SQLException exceptSql)
			    {
			   		IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
			    }
			}
        }
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
       	
       	goodG2BSink(data);	
	}
	
	private void goodCharSink(char[] data) throws Throwable
    {
    	Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;		DataSource ds = (DataSource) new MysqlDataSource();
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				connection = ds.getConnection("root", String.valueOf(data));

            	preparedStatement = connection.prepareStatement("select * from test_table");
				resultSet = preparedStatement.executeQuery();
            }
            catch (SQLException exceptSql)
			{
				IO.logger.log(Level.WARNING, "Error with database connection", exceptSql);
			}
			finally
			{
				try
				{
					if (resultSet != null)
					{
						resultSet.close();
					}
				}
			    catch (SQLException exceptSql)
			    {
			    	IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql);
			    }
			 
			    try
			    {
			        if (preparedStatement != null)
			        {
					 	preparedStatement.close();
			        }
			    }
			    catch (SQLException exceptSql)
			    {
			        IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql);
			    }
			 
			    try
			    {
			    	if (connection != null)
			   	    {
			   			connection.close();
			        }
			    }
			    catch (SQLException exceptSql)
			    {
			   		IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
			    }
			}
        	
        	/* Cleanup the password */
        	Arrays.fill(data, 'x');
        }
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
	    goodCharSink(data);
	}
	
	
	private void goodExpectedSink(Properties properties) throws Throwable
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;		DataSource ds = (DataSource) new MysqlDataSource();
        
        if (properties != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				connection = ds.getConnection("root", properties.getProperty("password"));

            	preparedStatement = connection.prepareStatement("select * from test_table");
				resultSet = preparedStatement.executeQuery();
            }
            catch (SQLException exceptSql)
			{
				IO.logger.log(Level.WARNING, "Error with database connection", exceptSql);
			}
			finally
			{
				try
				{
					if (resultSet != null)
					{
						resultSet.close();
					}
				}
			    catch (SQLException exceptSql)
			    {
			    	IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql);
			    }
			 
			    try
			    {
			        if (preparedStatement != null)
			        {
					 	preparedStatement.close();
			        }
			    }
			    catch (SQLException exceptSql)
			    {
			        IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql);
			    }
			 
			    try
			    {
			    	if (connection != null)
			   	    {
			   			connection.close();
			        }
			    }
			    catch (SQLException exceptSql)
			    {
			   		IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
			    }
			}
        }
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
        goodExpectedSink(properties);
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