/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__newPBEKeySpec3;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.SecureRandom;

public class CWE259_Hard_Coded_Password__newPBEKeySpec3_54b
{
	public void badSink(String data) throws Throwable
    {
    	(new  CWE259_Hard_Coded_Password__newPBEKeySpec3_54c()).badSink(data);
    }
	
    public void goodG2BSink(String data) throws Throwable
    {
    	(new  CWE259_Hard_Coded_Password__newPBEKeySpec3_54c()).goodG2BSink(data);
    }
	
	public void goodCharSink(char[] data) throws Throwable
    {
    	(new  CWE259_Hard_Coded_Password__newPBEKeySpec3_54c()).goodCharSink(data);
    }
	
	public void goodExpectedSink(Properties properties) throws Throwable
	{
		(new  CWE259_Hard_Coded_Password__newPBEKeySpec3_54c()).goodExpectedSink(properties);
	}
}