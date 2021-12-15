package com.My_Projects_Dec;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.sdp.Page_Object_Manager;

public class Runner_Class extends Base_Class {
	
	static Logger log= Logger.getLogger(Runner_Class.class);
	
	public static WebDriver driver = getBrowser("Chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws Throwable {
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("Browser Launch");

		url("https://adactinhotelapp.com/");
		
		log.info("Session Created");
		
		Wait1();
		
		inputValueElement(pom.getInstanceHp().getUsername(), "Kavinkumar20");
		
		inputValueElement(pom.getInstanceHp().getPassword(), "Kavin@2011");
		
		clickOnElement(pom.getInstanceHp().getLogin());
		
		Wait1();
		
		log.info("Login Successfully");
		
		selectValue("index", pom.getInstanceSh().getLocation(), "5");
		
		selectValue("index", pom.getInstanceSh().getHotels(), "1");
		
		selectValue("index", pom.getInstanceSh().getRoom_type(), "1");
		
		selectValue("value", pom.getInstanceSh().getRoom_nos(), "2");
		
		clear(pom.getInstanceSh().getDatein());
		
		sleep(2000);
		
		inputValueElement(pom.getInstanceSh().getDatein(), "11/12/2021");
		
		clear(pom.getInstanceSh().getDateout());
		
		sleep(2000);
		
		inputValueElement(pom.getInstanceSh().getDateout(), "12/12/2021");
		
		selectValue("value", pom.getInstanceSh().getAdult(), "2");
		
		selectValue("value", pom.getInstanceSh().getChild(), "1");
		
		clickOnElement(pom.getInstanceSh().getSubmit());

		Wait1();
		
		log.info("Hotel Search Submitted");
		
		clickOnElement(pom.getInstanceSel().getBtn());
		
		clickOnElement(pom.getInstanceSel().getCont());
		
		Wait1();
		
		log.info("Hotel Selected Successfully");

		inputValueElement(pom.getInstanceBh().getFirstname(), "Kavin");

		inputValueElement(pom.getInstanceBh().getLastname(), "Kumar");

		inputValueElement(pom.getInstanceBh().getAddress(), "Porur Chennai");

		inputValueElement(pom.getInstanceBh().getCcnum(), "4231879823127898");

		selectValue("index", pom.getInstanceBh().getCctype(), "2");

		selectValue("value",pom.getInstanceBh().getExpmonth(), "7");
		
		selectValue("value",pom.getInstanceBh().getExpyear(), "2022");
		
		inputValueElement(pom.getInstanceBh().getCvv(), "921");
		
		clickOnElement(pom.getInstanceBh().getBooknow());
			
		Wait1();
		
		log.info("Hotel Booking Successfully done");
		
		clickOnElement(pom.getInstanceBc().getItinerary());
		
		Wait1();
		
		TakeScreenshot();
		
		log.info("Screenshot taken Successfully");
		
		sleep(3000);
		
		log.info("Logout done");
		
		sleep(3000);
		
		close();
		
		log.info("Session Closed Successfully");
	}	
	
}
