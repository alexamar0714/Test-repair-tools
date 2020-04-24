/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 75 Data flow: data passed in a serialized object from one method to another in different source files in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__passwordAuthentication;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.io.*;
import java.net.PasswordAuthentication;

public class CWE259_Hard_Coded_Password__passwordAuthentication_75b
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
    	
	    	
	        
	        if (data != null)
	        {
	            try
	            {
	            	/* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
				PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
	            	IO.writeLine(credentials.toString());
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
    	
	    	
	        
	        if (data != null)
	        {
	            try
	            {
	            	/* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
				PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
	            	IO.writeLine(credentials.toString());
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
    
	    	
	        
	        if (data != null)
	        {
	            try
	            {
	            	/* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
				PasswordAuthentication credentials = new PasswordAuthentication("user", data);
	            	IO.writeLine(credentials.toString());
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
	
			
	        
	        if (properties != null)
	        {
	            try
	            {
	            	/* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
				PasswordAuthentication credentials = new PasswordAuthentication("user", properties.getProperty("password").toCharArray());
	            	IO.writeLine(credentials.toString());
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