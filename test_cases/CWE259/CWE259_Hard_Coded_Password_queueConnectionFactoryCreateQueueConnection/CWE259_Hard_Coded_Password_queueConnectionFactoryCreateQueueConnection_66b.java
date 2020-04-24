/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 66 Data flow: data passed in an array from one method to another in different source files in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password_queueConnectionFactoryCreateQueueConnection;

import testcasesupport.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.apache.activemq.ActiveMQConnectionFactory;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueConnection;

public class CWE259_Hard_Coded_Password_queueConnectionFactoryCreateQueueConnection_66b
{

	public void badSink(String dataArray[]) throws Throwable
    {
    	String data = dataArray[2];
    	
    	QueueConnection connection = null;
		QueueConnectionFactory cf = new ActiveMQConnectionFactory();
        
        if (data != null)
        {
            try
            {
            	connection = cf.createQueueConnection("root", data);
            	connection.start();
            	Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
            	Destination destination = session.createTopic("Topic");
            	MessageProducer producer = session.createProducer(destination);
	            TextMessage message = session.createTextMessage();
				message.setText("test");
				producer.send(message);
				session.commit();
				session.close();
				connection.close();
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
    public void goodG2BSink(String dataArray[]) throws Throwable
    {
    	String data = dataArray[2];
    	
    	QueueConnection connection = null;
		QueueConnectionFactory cf = new ActiveMQConnectionFactory();
        
        if (data != null)
        {
            try
            {
            	connection = cf.createQueueConnection("root", data);
            	connection.start();
            	Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
            	Destination destination = session.createTopic("Topic");
            	MessageProducer producer = session.createProducer(destination);
	            TextMessage message = session.createTextMessage();
				message.setText("test");
				producer.send(message);
				session.commit();
				session.close();
				connection.close();
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
	
	public void goodCharSink(char[][] dataArray) throws Throwable
    {
    	char[] data = dataArray[2];
    	
    	QueueConnection connection = null;
		QueueConnectionFactory cf = new ActiveMQConnectionFactory();
        
        if (data != null)
        {
            try
            {
            	connection = cf.createQueueConnection("root", String.valueOf(data));
            	connection.start();
            	Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
            	Destination destination = session.createTopic("Topic");
            	MessageProducer producer = session.createProducer(destination);
	            TextMessage message = session.createTextMessage();
				message.setText("test");
				producer.send(message);
				session.commit();
				session.close();
				connection.close();
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        	
        	/* Cleanup the password */
        	Arrays.fill(data, 'x');
        	for (char[] content : dataArray)
        	{
        		Arrays.fill(content, 'x');
        	}
        }
    }
	
	public void goodExpectedSink(List<Properties> propertiesList) throws Throwable
	{
		Properties properties = propertiesList.get(2);
		QueueConnection connection = null;
		QueueConnectionFactory cf = new ActiveMQConnectionFactory();
        
        if (properties != null)
        {
            try
            {
            	connection = cf.createQueueConnection("root", properties.getProperty("password"));
            	connection.start();
            	Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
            	Destination destination = session.createTopic("Topic");
            	MessageProducer producer = session.createProducer(destination);
	            TextMessage message = session.createTextMessage();
				message.setText("test");
				producer.send(message);
				session.commit();
				session.close();
				connection.close();
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
	}
}