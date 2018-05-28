package com.galenframework.tests;

import static java.util.Arrays.asList;

import java.io.IOException;

import org.testng.annotations.Test;

import com.galenframework.components.BaseClass;;

public class SampleTest extends BaseClass 
{	
	@Test(dataProvider = "desktop")
	public void sampleTestOnDesktop(TestDevice device) throws IOException 
	{
		load("login");
		checkLayout("/specs/demoPage.spec", asList("desktop"));
	}
	
	@Test(dataProvider = "tablet")
	public void sampleTestOnTablet(TestDevice device) throws IOException 
	{
		load("login");
		checkLayout("/specs/demoPage.spec", asList("tablet"));
	}

	@Test(dataProvider = "mobile")
	public void sampleTestOnMobile(TestDevice device) throws IOException 
	{
		load("login");
		checkLayout("/specs/demoPage.spec", asList("mobile"));
	}
}
