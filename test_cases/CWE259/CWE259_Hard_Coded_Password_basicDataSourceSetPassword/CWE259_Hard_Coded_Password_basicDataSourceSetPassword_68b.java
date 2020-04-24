/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 68 Data flow: data passed as a member variable in the "a" class, which is used by a method in another class in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password_basicDataSourceSetPassword;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import java.sql.*;
import org.apache.commons.dbcp2.BasicDataSource;


public class CWE259_Hard_Coded_Password_basicDataSourceSetPassword_68b
{

	public void badSink() throws Throwable
    {
    	String data = CWE259_Hard_Coded_Password_basicDataSourceSetPassword_68a.data;
    	
    	BasicDataSource ds = new BasicDataSource();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				ds.setPassword(data);

            	ds.setUsername("root");
				connection = ds.getConnection();
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
				try
				{
					if (ds != null)
					{
						ds.close();
					}
				}
			    catch (SQLException exceptSql)
			    {
			    	IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql);
			    }
			}
        }
    }
	
    public void goodG2BSink() throws Throwable
    {
    	String data = CWE259_Hard_Coded_Password_basicDataSourceSetPassword_68a.data;
    
    	BasicDataSource ds = new BasicDataSource();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				ds.setPassword(data);

            	ds.setUsername("root");
				connection = ds.getConnection();
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
				try
				{
					if (ds != null)
					{
						ds.close();
					}
				}
			    catch (SQLException exceptSql)
			    {
			    	IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql);
			    }
			}
        }
    }
	
	public void goodCharSink() throws Throwable
    {
    	char[] data = CWE259_Hard_Coded_Password_basicDataSourceSetPassword_68a.dataChar;
    
    	BasicDataSource ds = new BasicDataSource();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				ds.setPassword(String.valueOf(data));

            	ds.setUsername("root");
				connection = ds.getConnection();
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
				try
				{
					if (ds != null)
					{
						ds.close();
					}
				}
			    catch (SQLException exceptSql)
			    {
			    	IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql);
			    }
			}
        	
        	/* Cleanup the password */
        	Arrays.fill(data, 'x');
        }
    }
	
	public void goodExpectedSink() throws Throwable
	{
		Properties properties = CWE259_Hard_Coded_Password_basicDataSourceSetPassword_68a.properties;
	
		BasicDataSource ds = new BasicDataSource();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

        
        if (properties != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				ds.setPassword(properties.getProperty("password"));

            	ds.setUsername("root");
				connection = ds.getConnection();
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
				try
				{
					if (ds != null)
					{
						ds.close();
					}
				}
			    catch (SQLException exceptSql)
			    {
			    	IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql);
			    }
			}
        }
	}
}