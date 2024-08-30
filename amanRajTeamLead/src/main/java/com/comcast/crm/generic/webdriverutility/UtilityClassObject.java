package com.comcast.crm.generic.webdriverutility;

import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentTest;

//ThreadLocal is a Java class that provides thread-local variables.
//This is particularly useful in multi-threaded environments where you need to maintain thread-specific data that should not be shared across threads.
//ThreadLocal in Java is a class that provides each thread with its own independent copy of a variable
//This ensures that each thread can access and modify its own version of the variable without interfering with other threads,
public class UtilityClassObject {
 public static	ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
 public static	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

 public static ExtentTest getTest() {
	 return test.get();
 }
 public static void setTest(ExtentTest actTest) {
	 test.set(actTest);
 }
 public static WebDriver getdriver() {
	 return driver.get();
 }
 public static void setDriver(WebDriver actDriver) {
	 driver.set(actDriver);
 }
}

