/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 53 Data flow: data passed as an argument from one method through two others to a fourth; all four functions are in different classes in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password_connectionFactoryCreateConnection;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.apache.activemq.ActiveMQConnectionFactory;
import javax.jms.Connection;

public class CWE259_Hard_Coded_Password_connectionFactoryCreateConnection_53c
{
	public void badSink(String data) throws Throwable
    {
    	(new  CWE259_Hard_Coded_Password_connectionFactoryCreateConnection_53d()).badSink(data);
    }
	
    public void goodG2BSink(String data) throws Throwable
    {
    	(new  CWE259_Hard_Coded_Password_connectionFactoryCreateConnection_53d()).goodG2BSink(data);
    }
	
	public void goodCharSink(char[] data) throws Throwable
    {
    	(new  CWE259_Hard_Coded_Password_connectionFactoryCreateConnection_53d()).goodCharSink(data);
    }
	
	public void goodExpectedSink(Properties properties) throws Throwable
	{
		(new  CWE259_Hard_Coded_Password_connectionFactoryCreateConnection_53d()).goodExpectedSink(properties);
	}
}