/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 68 Data flow: data passed as a member variable in the "a" class, which is used by a method in another class in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password_userCredentialsConnectionFactoryAdapterSetPassword;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import java.sql.*;
import org.springframework.jms.connection.UserCredentialsConnectionFactoryAdapter;
import javax.jms.Connection;

public class CWE259_Hard_Coded_Password_userCredentialsConnectionFactoryAdapterSetPassword_68b
{

	public void badSink() throws Throwable
    {
    	String data = CWE259_Hard_Coded_Password_userCredentialsConnectionFactoryAdapterSetPassword_68a.data;
    	
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
	
    public void goodG2BSink() throws Throwable
    {
    	String data = CWE259_Hard_Coded_Password_userCredentialsConnectionFactoryAdapterSetPassword_68a.data;
    
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
	
	public void goodCharSink() throws Throwable
    {
    	char[] data = CWE259_Hard_Coded_Password_userCredentialsConnectionFactoryAdapterSetPassword_68a.dataChar;
    
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
	
	public void goodExpectedSink() throws Throwable
	{
		Properties properties = CWE259_Hard_Coded_Password_userCredentialsConnectionFactoryAdapterSetPassword_68a.properties;
	
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