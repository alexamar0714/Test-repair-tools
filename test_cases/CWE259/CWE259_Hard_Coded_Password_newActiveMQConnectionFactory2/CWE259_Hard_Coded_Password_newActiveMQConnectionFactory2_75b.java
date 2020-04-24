/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 75 Data flow: data passed in a serialized object from one method to another in different source files in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password_newActiveMQConnectionFactory2;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.io.*;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.apache.activemq.ActiveMQConnectionFactory;
import javax.jms.Connection;
import java.net.URI;

public class CWE259_Hard_Coded_Password_newActiveMQConnectionFactory2_75b
{

	public void badSink(byte[] dataSerialized) throws Throwable
    {
    	/* unserialize data */
        ByteArrayInputStream streamByteArrayInput = null;
        ObjectInputStream streamObjectInput = null;

        try
        {
            streamByteArrayInput = new ByteArrayInputStream(dataSerialized);
            streamObjectInput = new ObjectInputStream(streamByteArrayInput);
            String data = (String) streamObjectInput.readObject();
    	
	    	Connection connection = null;
	        
	        if (data != null)
	        {
	            try
	            {
	            	ConnectionFactory cf = new ActiveMQConnectionFactory("root", data, new URI("url"));
	            	connection = cf.createConnection();
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
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "IOException in deserialization", exceptIO);
        }
        catch (ClassNotFoundException exceptClassNotFound)
        {
            IO.logger.log(Level.WARNING, "ClassNotFoundException in deserialization", exceptClassNotFound);
        }
        finally
        {
            /* clean up stream reading objects */
            try
            {
                if (streamObjectInput != null)
                {
                    streamObjectInput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing ObjectInputStream", exceptIO);
            }

            try
            {
                if (streamByteArrayInput != null)
                {
                    streamByteArrayInput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing ByteArrayInputStream", exceptIO);
            }
        }
    }
	
    public void goodG2BSink(byte[] dataSerialized) throws Throwable
    {
    	/* unserialize data */
        ByteArrayInputStream streamByteArrayInput = null;
        ObjectInputStream streamObjectInput = null;

        try
        {
            streamByteArrayInput = new ByteArrayInputStream(dataSerialized);
            streamObjectInput = new ObjectInputStream(streamByteArrayInput);
            String data = (String) streamObjectInput.readObject();
    	
	    	Connection connection = null;
	        
	        if (data != null)
	        {
	            try
	            {
	            	ConnectionFactory cf = new ActiveMQConnectionFactory("root", data, new URI("url"));
	            	connection = cf.createConnection();
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
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "IOException in deserialization", exceptIO);
        }
        catch (ClassNotFoundException exceptClassNotFound)
        {
            IO.logger.log(Level.WARNING, "ClassNotFoundException in deserialization", exceptClassNotFound);
        }
        finally
        {
            /* clean up stream reading objects */
            try
            {
                if (streamObjectInput != null)
                {
                    streamObjectInput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing ObjectInputStream", exceptIO);
            }

            try
            {
                if (streamByteArrayInput != null)
                {
                    streamByteArrayInput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing ByteArrayInputStream", exceptIO);
            }
        }
    }
	
	public void goodCharSink(byte[] dataSerialized) throws Throwable
    {
    	/* unserialize data */
        ByteArrayInputStream streamByteArrayInput = null;
        ObjectInputStream streamObjectInput = null;

        try
        {
            streamByteArrayInput = new ByteArrayInputStream(dataSerialized);
            streamObjectInput = new ObjectInputStream(streamByteArrayInput);
            char[] data = (char[]) streamObjectInput.readObject();
    
	    	Connection connection = null;
	        
	        if (data != null)
	        {
	            try
	            {
	            	ConnectionFactory cf = new ActiveMQConnectionFactory("root", String.valueOf(data), new URI("url"));
	            	connection = cf.createConnection();
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
	        }
	    }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "IOException in deserialization", exceptIO);
        }
        catch (ClassNotFoundException exceptClassNotFound)
        {
            IO.logger.log(Level.WARNING, "ClassNotFoundException in deserialization", exceptClassNotFound);
        }
        finally
        {
            /* clean up stream reading objects */
            try
            {
                if (streamObjectInput != null)
                {
                    streamObjectInput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing ObjectInputStream", exceptIO);
            }

            try
            {
                if (streamByteArrayInput != null)
                {
                    streamByteArrayInput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing ByteArrayInputStream", exceptIO);
            }
        }
    }
	
	public void goodExpectedSink(byte[] dataSerialized) throws Throwable
	{
		/* unserialize data */
        ByteArrayInputStream streamByteArrayInput = null;
        ObjectInputStream streamObjectInput = null;

        try
        {
            streamByteArrayInput = new ByteArrayInputStream(dataSerialized);
            streamObjectInput = new ObjectInputStream(streamByteArrayInput);
            Properties properties = (Properties) streamObjectInput.readObject();
	
			Connection connection = null;
	        
	        if (properties != null)
	        {
	            try
	            {
	            	ConnectionFactory cf = new ActiveMQConnectionFactory("root", properties.getProperty("password"), new URI("url"));
	            	connection = cf.createConnection();
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
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "IOException in deserialization", exceptIO);
        }
        catch (ClassNotFoundException exceptClassNotFound)
        {
            IO.logger.log(Level.WARNING, "ClassNotFoundException in deserialization", exceptClassNotFound);
        }
        finally
        {
            /* clean up stream reading objects */
            try
            {
                if (streamObjectInput != null)
                {
                    streamObjectInput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing ObjectInputStream", exceptIO);
            }

            try
            {
                if (streamByteArrayInput != null)
                {
                    streamByteArrayInput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing ByteArrayInputStream", exceptIO);
            }
        }
	}
}