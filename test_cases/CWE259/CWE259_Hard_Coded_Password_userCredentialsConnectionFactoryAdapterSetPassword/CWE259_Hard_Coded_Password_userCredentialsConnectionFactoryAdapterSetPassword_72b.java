/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 72 Data flow: data passed in a Vector from one method to another in different source files in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password_userCredentialsConnectionFactoryAdapterSetPassword;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.io.*;
import java.sql.*;
import org.springframework.jms.connection.UserCredentialsConnectionFactoryAdapter;
import javax.jms.Connection;

public class CWE259_Hard_Coded_Password_userCredentialsConnectionFactoryAdapterSetPassword_72b
{

	public void badSink(Vector<String> dataVector) throws Throwable
    {
    	String data = dataVector.remove(2);
    	
    	UserCredentialsConnectionFactoryAdapter adapter = new UserCredentialsConnectionFactoryAdapter();
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				adapter.setPassword(data);

            	adapter.setUsername("root");
				Connection connection = adapter.createConnection();
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
    public void goodG2BSink(Vector<String> dataVector) throws Throwable
    {
    	String data = dataVector.remove(2);
    	
    	UserCredentialsConnectionFactoryAdapter adapter = new UserCredentialsConnectionFactoryAdapter();
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				adapter.setPassword(data);

            	adapter.setUsername("root");
				Connection connection = adapter.createConnection();
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
	public void goodCharSink(Vector<char[]> dataVector) throws Throwable
    {
    	char[] data = dataVector.remove(2);
    
    	UserCredentialsConnectionFactoryAdapter adapter = new UserCredentialsConnectionFactoryAdapter();
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				adapter.setPassword(String.valueOf(data));

            	adapter.setUsername("root");
				Connection connection = adapter.createConnection();
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        	
        	/* Cleanup the password */
        	Arrays.fill(data, 'x');
        }
    }
	
	public void goodExpectedSink(Vector<Properties> dataVector) throws Throwable
	{
		Properties properties = dataVector.remove(2);
	
		UserCredentialsConnectionFactoryAdapter adapter = new UserCredentialsConnectionFactoryAdapter();
        
        if (properties != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				adapter.setPassword(properties.getProperty("password"));

            	adapter.setUsername("root");
				Connection connection = adapter.createConnection();
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
	}
}