package com.obsqura.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;

public class LoginTest extends BaseTest{
	@Test
	public void MyLoginTest() {
		lp.Login();
	     
	}
}
