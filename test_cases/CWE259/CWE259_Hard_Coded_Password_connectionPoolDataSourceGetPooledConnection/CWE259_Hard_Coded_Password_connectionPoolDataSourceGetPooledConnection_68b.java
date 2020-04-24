/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 68 Data flow: data passed as a member variable in the "a" class, which is used by a method in another class in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password_connectionPoolDataSourceGetPooledConnection;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import java.sql.*;
import com.microsoft.sqlserver.jdbc.SQLServerConnectionPoolDataSource;
import javax.sql.PooledConnection;

public class CWE259_Hard_Coded_Password_connectionPoolDataSourceGetPooledConnection_68b
{

	public void badSink() throws Throwable
    {
    	String data = CWE259_Hard_Coded_Password_connectionPoolDataSourceGetPooledConnection_68a.data;
    	
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
	
    public void goodG2BSink() throws Throwable
    {
    	String data = CWE259_Hard_Coded_Password_connectionPoolDataSourceGetPooledConnection_68a.data;
    
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
	
	public void goodCharSink() throws Throwable
    {
    	char[] data = CWE259_Hard_Coded_Password_connectionPoolDataSourceGetPooledConnection_68a.dataChar;
    
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
	
	public void goodExpectedSink() throws Throwable
	{
		Properties properties = CWE259_Hard_Coded_Password_connectionPoolDataSourceGetPooledConnection_68a.properties;
	
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