/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
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

public class CWE259_Hard_Coded_Password_connectionFactoryCreateConnection_81_bad extends CWE259_Hard_Coded_Password_connectionFactoryCreateConnection_81_base
{

	public void action(String data) throws Throwable
    {
    	Connection connection = null;
        ConnectionFactory cf = new ActiveMQConnectionFactory();
        
        if (data != null)
        {
            try
            {
            	connection = cf.createConnection("root", data);
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
    
    public void action(char[] data) throws Throwable
    {
    }
    
    public void action(Properties properties) throws Throwable
    {
    }
}