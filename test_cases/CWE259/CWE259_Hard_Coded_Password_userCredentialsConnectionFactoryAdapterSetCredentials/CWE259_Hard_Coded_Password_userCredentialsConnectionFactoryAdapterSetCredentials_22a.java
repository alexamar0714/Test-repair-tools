/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 22 Control flow: Flow controlled by value of a public static variable. Sink functions are in a separate file from sources.
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password_userCredentialsConnectionFactoryAdapterSetCredentials;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import java.sql.*;
import org.springframework.jms.connection.UserCredentialsConnectionFactoryAdapter;
import javax.jms.Connection;

public class CWE259_Hard_Coded_Password_userCredentialsConnectionFactoryAdapterSetCredentials_22a extends AbstractTestCase
{

	/* The public static variable below is used to drive control flow in the source function.
     * The public static variable mimics a global variable in the C/C++ language family. */
    public static boolean badPublicStatic = false;

	/* uses badsource and badsink */
    public void bad() throws Throwable
    {
        String data;

        badPublicStatic = true;
        data = (new CWE259_Hard_Coded_Password_userCredentialsConnectionFactoryAdapterSetCredentials_22b()).badSource();
        
        UserCredentialsConnectionFactoryAdapter adapter = new UserCredentialsConnectionFactoryAdapter();
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				adapter.setCredentialsForCurrentThread("root", data);

            	Connection connection = adapter.createConnection();
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
    
    /* The public static variables below are used to drive control flow in the source functions.
     * The public static variable mimics a global variable in the C/C++ language family. */
    public static boolean goodG2B1PublicStatic = false;
    public static boolean goodG2B2PublicStatic = false;

    /* goodG2B1() - use goodsource and badsink by setting the static variable to false instead of true */
    private void goodG2B1() throws Throwable
    {
        String data;

        goodG2B1PublicStatic = false;
        data = (new CWE259_Hard_Coded_Password_userCredentialsConnectionFactoryAdapterSetCredentials_22b()).goodG2B1Source();
       	
       	UserCredentialsConnectionFactoryAdapter adapter = new UserCredentialsConnectionFactoryAdapter();
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				adapter.setCredentialsForCurrentThread("root", data);

            	Connection connection = adapter.createConnection();
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
	}
	
	/* goodG2B2() - use goodsource and badsink by reversing the blocks in the if in the sink function */
	private void goodG2B2() throws Throwable
    {
        String data;

        goodG2B2PublicStatic = true;
        data = (new CWE259_Hard_Coded_Password_userCredentialsConnectionFactoryAdapterSetCredentials_22b()).goodG2B2Source();
       	
       	UserCredentialsConnectionFactoryAdapter adapter = new UserCredentialsConnectionFactoryAdapter();
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				adapter.setCredentialsForCurrentThread("root", data);

            	Connection connection = adapter.createConnection();
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
	}
	
	
	/* goodChar() - uses the expected Properties file and a char[] data variable*/
	private void goodChar() throws Throwable
	{
		goodG2B2PublicStatic = true;
		char[] data = (new CWE259_Hard_Coded_Password_userCredentialsConnectionFactoryAdapterSetCredentials_22b()).goodCharSource();
        
        UserCredentialsConnectionFactoryAdapter adapter = new UserCredentialsConnectionFactoryAdapter();
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				adapter.setCredentialsForCurrentThread("root", String.valueOf(data));

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
	
	/* goodExpected() - uses the expected Properties file and uses the password directly from it*/
	private void goodExpected() throws Throwable
	{
		goodG2B2PublicStatic = true;
		Properties properties = (new CWE259_Hard_Coded_Password_userCredentialsConnectionFactoryAdapterSetCredentials_22b()).goodExpectedSource();
        
        UserCredentialsConnectionFactoryAdapter adapter = new UserCredentialsConnectionFactoryAdapter();
        
        if (properties != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				adapter.setCredentialsForCurrentThread("root", properties.getProperty("password"));

            	Connection connection = adapter.createConnection();
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
	}
	
	public void good() throws Throwable
    {
        goodG2B1();
        goodG2B2();
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