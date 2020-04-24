/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 71 Data flow: data passed as an Object reference argument from one method to another in different classes in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password_connectionFactoryCreateContext2;

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


public class CWE259_Hard_Coded_Password_connectionFactoryCreateContext2_71b
{

	public void badSink(Object dataObject) throws Throwable
    {
    	String data = (String) dataObject;
    	
    	ConnectionFactory cf = new ActiveMQConnectionFactory();
        
        if (data != null)
        {
            try
            {
            	JMSContext context = cf.createContext("root", data, JMSContext.AUTO_ACKNOWLEDGE);
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
	
    public void goodG2BSink(Object dataObject) throws Throwable
    {
    	String data = (String) dataObject;
    	
    	ConnectionFactory cf = new ActiveMQConnectionFactory();
        
        if (data != null)
        {
            try
            {
            	JMSContext context = cf.createContext("root", data, JMSContext.AUTO_ACKNOWLEDGE);
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
	
	public void goodCharSink(Object dataObject) throws Throwable
    {
    	char[] data = (char[]) dataObject;
    
    	ConnectionFactory cf = new ActiveMQConnectionFactory();
        
        if (data != null)
        {
            try
            {
            	JMSContext context = cf.createContext("root", String.valueOf(data), JMSContext.AUTO_ACKNOWLEDGE);
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
	
	public void goodExpectedSink(Object dataObject) throws Throwable
	{
		Properties properties = (Properties) dataObject;
	
		ConnectionFactory cf = new ActiveMQConnectionFactory();
        
        if (properties != null)
        {
            try
            {
            	JMSContext context = cf.createContext("root", properties.getProperty("password"), JMSContext.AUTO_ACKNOWLEDGE);
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