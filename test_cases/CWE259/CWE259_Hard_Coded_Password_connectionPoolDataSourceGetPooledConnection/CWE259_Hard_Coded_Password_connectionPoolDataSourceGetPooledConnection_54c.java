/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
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

public class CWE259_Hard_Coded_Password_connectionPoolDataSourceGetPooledConnection_54c
{
	public void badSink(String data) throws Throwable
    {
    	(new  CWE259_Hard_Coded_Password_connectionPoolDataSourceGetPooledConnection_54d()).badSink(data);
    }
	
    public void goodG2BSink(String data) throws Throwable
    {
    	(new  CWE259_Hard_Coded_Password_connectionPoolDataSourceGetPooledConnection_54d()).goodG2BSink(data);
    }
	
	public void goodCharSink(char[] data) throws Throwable
    {
    	(new  CWE259_Hard_Coded_Password_connectionPoolDataSourceGetPooledConnection_54d()).goodCharSink(data);
    }
	
	public void goodExpectedSink(Properties properties) throws Throwable
	{
		(new  CWE259_Hard_Coded_Password_connectionPoolDataSourceGetPooledConnection_54d()).goodExpectedSink(properties);
	}
}