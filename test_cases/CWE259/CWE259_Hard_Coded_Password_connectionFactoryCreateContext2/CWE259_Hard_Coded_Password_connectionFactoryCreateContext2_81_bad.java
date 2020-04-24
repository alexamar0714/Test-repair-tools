/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
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


public class CWE259_Hard_Coded_Password_connectionFactoryCreateContext2_81_bad extends CWE259_Hard_Coded_Password_connectionFactoryCreateContext2_81_base
{

	public void action(String data) throws Throwable
    {
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
    
    public void action(char[] data) throws Throwable
    {
    }
    
    public void action(Properties properties) throws Throwable
    {
    }
}