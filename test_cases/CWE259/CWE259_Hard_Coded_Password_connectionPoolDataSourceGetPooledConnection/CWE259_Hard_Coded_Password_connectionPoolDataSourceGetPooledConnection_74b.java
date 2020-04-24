/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 74 Data flow: data passed in a HashMap from one method to another in different source files in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password_connectionPoolDataSourceGetPooledConnection;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.HashMap;
import java.util.logging.Level;
import java.io.*;
import java.sql.*;
import com.microsoft.sqlserver.jdbc.SQLServerConnectionPoolDataSource;
import javax.sql.PooledConnection;

public class CWE259_Hard_Coded_Password_connectionPoolDataSourceGetPooledConnection_74b
{

	public void badSink(HashMap<Integer,String> dataHashMap) throws Throwable
    {
    	String data = dataHashMap.get(2);
    	
    	PooledConnection pooledConnection = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		SQLServerConnectionPoolDataSource ds = new SQLServerConnectionPoolDataSource();
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				pooledConnection = ds.getPooledConnection("root", data);

            	connection = pooledConnection.getConnection();
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
	
    public void goodG2BSink(HashMap<Integer,String> dataHashMap) throws Throwable
    {
    	String data = dataHashMap.get(2);
    	
    	PooledConnection pooledConnection = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		SQLServerConnectionPoolDataSource ds = new SQLServerConnectionPoolDataSource();
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				pooledConnection = ds.getPooledConnection("root", data);

            	connection = pooledConnection.getConnection();
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
	
	public void goodCharSink(HashMap<Integer,char[]> dataHashMap) throws Throwable
    {
    	char[] data = dataHashMap.get(2);
    
    	PooledConnection pooledConnection = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		SQLServerConnectionPoolDataSource ds = new SQLServerConnectionPoolDataSource();
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				pooledConnection = ds.getPooledConnection("root", String.valueOf(data));

            	connection = pooledConnection.getConnection();
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
	
	public void goodExpectedSink(HashMap<Integer,Properties> dataHashMap) throws Throwable
	{
		Properties properties = dataHashMap.get(2);
	
		PooledConnection pooledConnection = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		SQLServerConnectionPoolDataSource ds = new SQLServerConnectionPoolDataSource();
        
        if (properties != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				pooledConnection = ds.getPooledConnection("root", properties.getProperty("password"));

            	connection = pooledConnection.getConnection();
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
}