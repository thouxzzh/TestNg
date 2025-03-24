package com.testng;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
public class ListenerDemo implements ITestListener{
	public void onTestFailure(ITestResult res) {
		System.out.println("Test Get Failed"+res.getName());
	}
	public void onTestSkipped(ITestResult res) {
		System.out.println("Test Get Skipped"+res.getName());
	}
	public void onTestStart(ITestResult res) {
		System.out.println("Test Get Started"+res.getName());
	}
	public void onTestSuccess(ITestResult res) {
		System.out.println("Test Case Pass"+res.getName());
	}
}