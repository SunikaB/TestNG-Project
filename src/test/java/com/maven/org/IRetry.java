package com.maven.org;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class IRetry implements IRetryAnalyzer{
	int counter=0;
	int retry=3;
	@Override
	public boolean retry(ITestResult result) {
		if (counter<retry) {
			counter ++;
			return true;
					}
		else {		
		return false;
	}}}
