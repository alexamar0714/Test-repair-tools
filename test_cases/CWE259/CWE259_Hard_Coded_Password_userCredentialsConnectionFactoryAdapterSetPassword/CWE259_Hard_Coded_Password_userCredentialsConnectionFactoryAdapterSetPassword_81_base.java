/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password_userCredentialsConnectionFactoryAdapterSetPassword;

import testcasesupport.*;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import java.sql.*;
import org.springframework.jms.connection.UserCredentialsConnectionFactoryAdapter;
import javax.jms.Connection;

public abstract class CWE259_Hard_Coded_Password_userCredentialsConnectionFactoryAdapterSetPassword_81_base
{
	public abstract void action(String data) throws Throwable;
	public abstract void action(char[] data) throws Throwable;
	public abstract void action(Properties properties) throws Throwable;
}