/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__keyStoreSpiEngineSetKeyEntry;

import testcasesupport.*;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import java.security.KeyStore;
import java.lang.reflect.Field;
import java.security.KeyStoreSpi;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.KeyPair;

public abstract class CWE259_Hard_Coded_Password__keyStoreSpiEngineSetKeyEntry_81_base
{
	public abstract void action(String data) throws Throwable;
	public abstract void action(char[] data) throws Throwable;
	public abstract void action(Properties properties) throws Throwable;
}