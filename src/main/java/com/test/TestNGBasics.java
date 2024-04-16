package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGBasics {
	
	@BeforeSuite
	public void launchBrowser() {
		System.out.println("NEw");
		
	}
	
	@BeforeTest
	public void openLink() {
		System.out.println("Link you want to open");
	}
	
	@BeforeClass
	public void submitLink() {
		System.out.println("The new link opened");
	}
	
	@BeforeMethod
	public void newPage() {
		System.out.println("New link is here");
	}
	

}
