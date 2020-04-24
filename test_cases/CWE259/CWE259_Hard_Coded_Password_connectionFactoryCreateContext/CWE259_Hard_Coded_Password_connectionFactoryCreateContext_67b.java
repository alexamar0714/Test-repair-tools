/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 67 Data flow: data passed in a class from one method to another in different source files in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password_connectionFactoryCreateContext;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.jms.Message;
import org.apache.activemq.ActiveMQConnectionFactory;


public class CWE259_Hard_Coded_Password_connectionFactoryCreateContext_67b
{

	public void badSink(CWE259_Hard_Coded_Password_connectionFactoryCreateContext_67a.Container dataContainer) throws Throwable
    {
    	String data = dataContainer.containerOne;
    	
    	ConnectionFactory cf = new ActiveMQConnectionFactory();
        
        if (data != null)
        {
            try
            {
            	JMSContext context = cf.createContext("root", data);
            	Destination destination = context.createTopic("Topic");
        		Message message = context.createTextMessage("Test");
        		JMSProducer producer = context.createProducer();
        		producer.send(destination, message);
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
    public void goodG2BSink(CWE259_Hard_Coded_Password_connectionFactoryCreateContext_67a.Container dataContainer) throws Throwable
    {
    	String data = dataContainer.containerOne;
    	
    	ConnectionFactory cf = new ActiveMQConnectionFactory();
        
        if (data != null)
        {
            try
            {
            	JMSContext context = cf.createContext("root", data);
            	Destination destination = context.createTopic("Topic");
        		Message message = context.createTextMessage("Test");
        		JMSProducer producer = context.createProducer();
        		producer.send(destination, message);
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
	public void goodCharSink(CWE259_Hard_Coded_Password_connectionFactoryCreateContext_67a.ContainerTwo dataContainer) throws Throwable
    {
    	char[] data = dataContainer.containerOne;
    	
    	ConnectionFactory cf = new ActiveMQConnectionFactory();
        
        if (data != null)
        {
            try
            {
            	JMSContext context = cf.createContext("root", String.valueOf(data));
            	Destination destination = context.createTopic("Topic");
        		Message message = context.createTextMessage("Test");
        		JMSProducer producer = context.createProducer();
        		producer.send(destination, message);
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        	
        	/* Cleanup the password */
        	Arrays.fill(data, 'x');
        }
    }
	
	public void goodExpectedSink(CWE259_Hard_Coded_Password_connectionFactoryCreateContext_67a.ContainerThree dataContainer) throws Throwable
	{
		Properties properties = dataContainer.containerOne;
		
		ConnectionFactory cf = new ActiveMQConnectionFactory();
        
        if (properties != null)
        {
            try
            {
            	JMSContext context = cf.createContext("root", properties.getProperty("password"));
            	Destination destination = context.createTopic("Topic");
        		Message message = context.createTextMessage("Test");
        		JMSProducer producer = context.createProducer();
        		producer.send(destination, message);
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
	}
}