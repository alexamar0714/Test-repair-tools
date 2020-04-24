/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 52 Data flow: data passed as an argument from one method to another to another in three different classes in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password_basicDataSourceSetPassword;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import java.sql.*;
import org.apache.commons.dbcp2.BasicDataSource;


public class CWE259_Hard_Coded_Password_basicDataSourceSetPassword_52b
{
	public void badSink(String data) throws Throwable
    {
    	(new  CWE259_Hard_Coded_Password_basicDataSourceSetPassword_52c()).badSink(data);
    }
	
    public void goodG2BSink(String data) throws Throwable
    {
    	(new  CWE259_Hard_Coded_Password_basicDataSourceSetPassword_52c()).goodG2BSink(data);
    }
	
	public void goodCharSink(char[] data) throws Throwable
    {
    	(new  CWE259_Hard_Coded_Password_basicDataSourceSetPassword_52c()).goodCharSink(data);
    }
	
	public void goodExpectedSink(Properties properties) throws Throwable
	{
		(new  CWE259_Hard_Coded_Password_basicDataSourceSetPassword_52c()).goodExpectedSink(properties);
	}
}