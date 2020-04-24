/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password_mysqlDataSourceSetPassword;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import java.sql.*;
import com.mysql.cj.jdbc.MysqlDataSource;


public class CWE259_Hard_Coded_Password_mysqlDataSourceSetPassword_81_bad extends CWE259_Hard_Coded_Password_mysqlDataSourceSetPassword_81_base
{

	public void action(String data) throws Throwable
    {
    	Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		MysqlDataSource  ds = new MysqlDataSource();
		ds.setUser("root");
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				ds.setPassword(data);

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
			}
        }
    }
    
    public void action(char[] data) throws Throwable
    {
    }
    
    public void action(Properties properties) throws Throwable
    {
    }
}