/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 21 Control flow: Flow controlled by value of a private variable. All functions contained in one file.
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

public class CWE259_Hard_Coded_Password_connectionFactoryCreateConnection_21 extends AbstractTestCase
{
	/* The variable below is used to drive control flow in the source function */
    private boolean badPrivate = false;

	/* uses badsource and badsink */
    public void bad() throws Throwable
    {
        String data;

        badPrivate = true;
        data = bad_source();
        
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
    
    private String bad_source() throws Throwable
    {
        String data;

        if (badPrivate)
        {
            /* FLAW: Set data to a hardcoded string */
            data = "7e5tc4s3";
        }
        else
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null;
        }

        return data;
    }
    
    /* The variables below are used to drive control flow in the source functions. */
    private boolean goodG2B1_private = false;
    private boolean goodG2B2_private = false;

    /* goodG2B1() - use goodsource and badsink by setting the variable to false instead of true */
    private void goodG2B1() throws Throwable
    {
        String data;

        goodG2B1_private = false;
        data = goodG2B1_source();

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
	
	private String goodG2B1_source() throws Throwable
    {
        String data = null;

        if (goodG2B1_private)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null;
        }
        else
        {

            data = ""; /* init data */

            /* FIX */
	        try
	        {
	        	InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
        		BufferedReader readerBuffered = new BufferedReader(readerInputStream);
        	
        		/* POTENTIAL FLAW: Read data from the console using readLine */
        		data = readerBuffered.readLine();
	       	}
	       	catch (IOException exceptIO)
       		{
       			IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
       		}
        }

        return data;
    }
    
    /* goodG2B2() - use goodsource and badsink by reversing the blocks in the if in the sink function */
    private void goodG2B2() throws Throwable
    {
        String data;

        goodG2B2_private = true;
        data = goodG2B2_source();

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

    private String goodG2B2_source() throws Throwable
    {
        String data = null;

        if (goodG2B2_private)
        {
           /* FIX */
	        try
	        {
	        	InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
        		BufferedReader readerBuffered = new BufferedReader(readerInputStream);
        	
        		/* POTENTIAL FLAW: Read data from the console using readLine */
        		data = readerBuffered.readLine();
	       	}
	       	catch (IOException exceptIO)
       		{
       			IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
       		}
        }
        else
        {
 			/* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null;
            data = ""; /* init data */            
        }

        return data;
    }
	
	/* goodChar() - uses the expected Properties file and a char[] data variable*/
	private void goodChar() throws Throwable
	{
		goodG2B2_private = true;
		char[] data = goodCharSource();
        
        Connection connection = null;
        ConnectionFactory cf = new ActiveMQConnectionFactory();
        
        if (data != null)
        {
            try
            {
            	connection = cf.createConnection("root", String.valueOf(data));
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
	
	private char[] goodCharSource() throws Throwable
	{
		char[] data = null;
		
		Properties properties = new Properties();
        FileInputStream streamFileInput = null;
        if (goodG2B2_private)
        {
	        try
	        {
	            streamFileInput = new FileInputStream("src/juliet_test/resources/config.properties");
	            properties.load(streamFileInput);
	
	            data = properties.getProperty("password").toCharArray();
	        }
	        catch (IOException exceptIO)
	        {
	            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
	        }
	        finally
	        {
	            /* clean up stream reading objects */
	            try
	            {
	                if (streamFileInput != null)
	                {
	                    streamFileInput.close();
	                }
	            }
	            catch (IOException exceptIO)
	            {
	                IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
	            }
	        }
	    }
	    else 
	    {
	    	/* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null;    
	    }
	    return data;
	}
	
	/* goodExpected() - uses the expected Properties file and uses the password directly from it*/
	private void goodExpected() throws Throwable
	{
		goodG2B2_private = true;
		Properties properties = goodExpectedSource();
        
        Connection connection = null;
        ConnectionFactory cf = new ActiveMQConnectionFactory();
        
        if (properties != null)
        {
            try
            {
            	connection = cf.createConnection("root", properties.getProperty("password"));
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
	
	private Properties goodExpectedSource() throws Throwable
	{
		Properties properties = new Properties();
        FileInputStream streamFileInput = null;
        if (goodG2B2_private)
        {
	        try
	        {
	            streamFileInput = new FileInputStream("src/juliet_test/resources/config.properties");
	            properties.load(streamFileInput);
	        }
	        catch (IOException exceptIO)
	        {
	            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
	        }
	        finally
	        {
	            /* clean up stream reading objects */
	            try
	            {
	                if (streamFileInput != null)
	                {
	                    streamFileInput.close();
	                }
	            }
	            catch (IOException exceptIO)
	            {
	                IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
	            }
	        }
	    }
	    else 
	    {
	    	/* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            properties = null;      
	    }
	    return properties;
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