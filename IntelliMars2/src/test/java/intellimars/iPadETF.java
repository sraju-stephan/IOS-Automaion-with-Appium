package intellimars;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class iPadETF{
	

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AppiumDriver<MobileElement> driver1;
		
		DesiredCapabilities caps= new DesiredCapabilities();	
		caps.setCapability("app", "/Users/Mars/Desktop/IntelliMARS_6310.ipa");
		caps.setCapability("deviceName", "iPad");//Steve K
		caps.setCapability("automationName", "XCUITest");
		caps.setCapability("platformName", "iOS");
		caps.setCapability("udid", "ffa44b8d08bf298056449f617298d4bd562e0953");//50566ae7a20151b7a5fbbece43d508c376ee2d4f
		caps.setCapability("platformVersion", "14.2");//12.4.4
		caps.setCapability("xcodeOrgId", "X45K6MGNL2");
		caps.setCapability("XcodeSigningId", "iPhone Developer");
		caps.setCapability("showIOSLog", "true");
		caps.setCapability("noReset", "true");
		caps.setCapability("showXcodeLog", "true");
		
		IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		
		//Created Object for Menu Options
		
		//MobileElement Switch = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSwitch");
		
		
		
		//String value= Switch.getAttribute("value");
		//System.out.print("Result: " + value);
		
		
		//if  (value.equals("0")) {
			
			
		//Switch.click();	
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[1]").clear();
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[1]").sendKeys("567829");
		
		
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField").clear();
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField").sendKeys("mars2");

		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[2]").clear();	
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[2]").sendKeys("https://imarsetfqa.phxa.com");

		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Sign In\"]").click();
			
		
		
		/*else {
		//driver.findElementById("Allow").click();
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[1]").sendKeys("567829");
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField").sendKeys("mars1");
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[2]").sendKeys("https://imarsetfqa.phxa.com");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Sign In\"]").click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.findElementByAccessibilityId("Yes").click();
		
		}*/

		//if(driver.findElementByAccessibilityId("Yearly, not selected, Link Bar.").isEnabled());
		if(driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Funnel line\"]").isEnabled());
		{
			
			System.out.print("Logged in Sucessfully");  
		}
		
		
		//driver.findElementByXPath("//XCUIElementTypeAppication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[1]").click();
		
		/*TouchActions action = new TouchActions(driver);
		action.scroll(element, 10, 100);
		action.perform();*/

        //Monthly Sales Summary
		 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Redemptions\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Net\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Purchases\"]").click();		
		driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"Max Out line\"])[3]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Reload line\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"BackArrow line\"]").click();
		driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"Grid line\"])[2]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Card line\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"BackArrow line\"]").click();
		driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"Grid line\"])[2]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"EIS Graph line\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"BackArrow line\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"BackArrow line\"]").click();
		
		
		
		//WholeSalers Dashboard
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Quarterly\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Year\"]").click();
		driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"Assets\"])[1]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Monthly\"]").click();
		driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"Max Out line\"])[3]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Reload line\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"BackArrow line\"]").click();
		
		
		
		
	
		 //Top Product Groups
		driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"Assets\"])[2]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Sales\"]").click(); 
		
		
		//Navigating through bottom menu options.
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Local\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Top Reps\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Offices Near Me\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Top Tickets Near Me\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Dashboard\"]").click();	

		
		/*driver.findElementByAccessibilityId("YTD Sales, not selected, Link Bar.").click();
		driver.findElementByAccessibilityId("Curr Assets, not selected, Link Bar.").click();
		driver.findElementByAccessibilityId("Quarterly, not selected, Link Bar.").click();
		driver.findElementByAccessibilityId("Yearly, not selected, Link Bar.").click();
		driver.findElementByAccessibilityId("Yearly, not selected, Link Bar.").click();
		//driver.findElementByAccessibilityId("Image13. This is a Link. ").click();
		new TouchAction(driver).tap(PointOption.point(57,37)).release().perform();
		MobileElement element = (MobileElement) driver.findElementByAccessibilityId("Image13. This is a Link. ");
		Point location = element.getLocation(); 

		
		if(driver.findElementByAccessibilityId("Yearly, not selected, Link Bar.").isEnabled());
		{
			
			System.out.print("Dashboard is refreshed");  
		}
		
		

		driver.findElementByAccessibilityId(", KingFisher Pvt LTD. This is a link").click();
		driver.findElementByAccessibilityId("Image12. This is a Link. ").click();
		driver.findElementByAccessibilityId("Yearly, not selected, Link Bar.").isEnabled();
		driver.findElementByAccessibilityId("selector, currently selected item is:ALL").click();
		driver.findElementByAccessibilityId("Unresolved").click(); */
		
		
		//Rep Lookup
		MobileElement Menu = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Menu line\"]");
			
		Menu.click();
		driver.findElementByAccessibilityId("Rep").click();
		driver.findElementByAccessibilityId("Lookup").click();
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton").click();
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField").sendKeys("Mike");
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[3]/XCUIElementTypeButton").click();
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[3]/XCUIElementTypeTextField").sendKeys("moes");
		//driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[3]/XCUIElementTypeTextField").sendKeys("Firm Name");
		//driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[4]/XCUIElementTypeTextField").sendKeys("Office Name");
		//driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[5]/XCUIElementTypeTextField").sendKeys("City");
		//driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[6]/XCUIElementTypeTextField").sendKeys("State");
		//driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[7]/XCUIElementTypeTextField").sendKeys("12345");
		//driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[8]/XCUIElementTypeTextField").sendKeys("100");
		//driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[9]/XCUIElementTypeTextField").sendKeys("12345");
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Apply\"]").click();
		
		driver.findElementByXPath("(//XCUIElementTypeStaticText[@name=\"mike Moes\"])[1]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Quarterly\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Yearly\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Monthly\"]").click();
		driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"Max Out line\"])[1]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Reload line\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"BackArrow line\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Assets\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Sales\"]").click();
		driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"Max Out line\"])[2]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Reload line\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"BackArrow line\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Performance Overview\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Teams\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Market Share\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Product Sales\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Profile\"]").click();
		//driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"More\"]").click();
		//driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"More\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"BackArrow line\"]").click();

		
		
				
		//Reps Near Me
		Menu.click();
		driver.findElementByAccessibilityId("Rep").click();
		driver.findElementById("Near Me").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Reload line\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"BackArrow line\"]").click();
		
		
		
		//Rep Menu:Top Rep By Purchases
		Menu.click();
		System.out.println("Executing Rep Menu_ :Top Rep By Purchases  ");
		//driver.findElementByAccessibilityId("Rep").click();
		driver.findElementByAccessibilityId("Top By Purchases").click();
		driver.findElementByAccessibilityId("Image19. This is a Link. ").click();
		driver.findElementByAccessibilityId("Image2. This is a Link. ").click();
		driver.findElementByAccessibilityId(", Ahmet Gucum. This is a link").click();
		driver.findElementByAccessibilityId("Image5. This is a Link. ").click();
		driver.findElementByAccessibilityId(", Ahmet Gucum. This is a link").isEnabled();
		driver.findElementByXPath("").click();
		driver.findElementByXPath("").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Reload line\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"BackArrow line\"]").click();
		
	
		
		
		//Rep Menu: Top By Assets
		Menu.click();
		driver.findElementByAccessibilityId("Rep").click();
		driver.findElementById("Top By Assets").click();
		driver.findElementByAccessibilityId("Image19. This is a Link. ").click();
		driver.findElementByAccessibilityId("Image2. This is a Link. ").click();
		driver.findElementByAccessibilityId(", Alastair Nolan. This is a link").click();
		driver.findElementByAccessibilityId("Image5. This is a Link. ").click();
		driver.findElementByAccessibilityId(", Alastair Nolan. This is a link").isEnabled();
		
		
		//Rep Menu: Maps
		Menu.click();
		driver.findElementByAccessibilityId("Rep").click();
		driver.findElementByAccessibilityId("Maps").click();
		
		//Rep Menu: Rep Query
		Menu.click();
		driver.findElementByAccessibilityId("Rep").click();
		driver.findElementByAccessibilityId("Query").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
		//Team Menu: Lookup
		Menu.click();
		driver.findElementByAccessibilityId("Team").click();
		driver.findElementByAccessibilityId("Lookup").click();
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton").click();
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField").sendKeys("Adam");
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[3]/XCUIElementTypeButton").click();
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[3]/XCUIElementTypeTextField").sendKeys("Sowell");
	
		
		/*driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeTextField").sendKeys("First Name");
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[4]/XCUIElementTypeTextField").sendKeys("Last Name+");
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[3]/XCUIElementTypeTextField").sendKeys("Firm Name");
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[4]/XCUIElementTypeTextField").sendKeys("Office Name");
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[5]/XCUIElementTypeTextField").sendKeys("Team Group");
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[6]/XCUIElementTypeTextField").sendKeys("City");
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[7]/XCUIElementTypeTextField").sendKeys("State");
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[8]/XCUIElementTypeTextField").sendKeys("12345");
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[9]/XCUIElementTypeTextField").sendKeys("100");
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[10]/XCUIElementTypeTextField").sendKeys("12345");
		*/
		
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Apply\"]").click();
		driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"Adam/Doris Sowell/Sowell\"])[2]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Quarterly\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Yearly\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Monthly\"]").click();
		driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"Max Out line\"])[1]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Reload line\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"BackArrow line\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Assets\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Sales\"]").click();
		driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"Max Out line\"])[2]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Reload line\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"BackArrow line\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Performance Overview\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Team Members\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Team Group\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Product Sales\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Profile\"]").click();
		//driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"More\"]").click();
		//driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"More\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"BackArrow line\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"BackArrow line\"]").click();
		
		
		
		//Team Menu: Near Me
		Menu.click();
		driver.findElementByAccessibilityId("Team").click();
		driver.findElementByAccessibilityId("Near Me").click();
		//driver.findElementByAccessibilityId("Image19. This is a Link. ").click();
		//driver.findElementByAccessibilityId("Image2. This is a Link. ").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Reload line\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"BackArrow line\"]").click();
		
		
		
		//Team Menu:Top  By Purchases	
		Menu.click();
		driver.findElementByAccessibilityId("Team").click();
		driver.findElementById("Top By Purchases").click();
		//driver.findElementByAccessibilityId("Image19. This is a Link. ").click();
		//driver.findElementByAccessibilityId("Image2. This is a Link. ").click();
		
		
		//Team Menu:Top  By Assets
		Menu.click();
	driver.findElementByAccessibilityId("Team").click();	
	driver.findElementById("Top By Assets").click();
	driver.findElementById("Image19. This is a Link. ").click();
	driver.findElementById("Image2. This is a Link. ").click();
	
	
	//Office Menu: LookUp
	Menu.click();
	driver.findElementByAccessibilityId("Office").click();
	driver.findElementByAccessibilityId("Lookup").click();
	driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField").sendKeys("Firm Name");
	driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeTextField").sendKeys("Office Name");
	driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[3]/XCUIElementTypeTextField").sendKeys("TX");
	driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[4]/XCUIElementTypeTextField").sendKeys("TEXAS");
	driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[5]/XCUIElementTypeTextField").sendKeys("12345");
	
	driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Apply\"]").click();
	
	//Office Menu: Near Me
	Menu.click();
	driver.findElementByAccessibilityId("Office").click();
	driver.findElementByAccessibilityId("Near Me").click();
	//driver.findElementByAccessibilityId("OK").click();
	driver.findElementByAccessibilityId("Image3. This is a Link. ").click();
	driver.findElementByAccessibilityId("Image3. This is a Link. ").click();
	
	//Office Menu: Top BY Purchases
	Menu.click();
	driver.findElementByAccessibilityId("Office").click();
	driver.findElementById("Top By Purchases").click();
	driver.findElementByAccessibilityId("Image3. This is a Link. ").click();
	driver.findElementByAccessibilityId("Image3. This is a Link. ").click();
	
	//Office Menu: Top By Assets
	Menu.click();
	driver.findElementByAccessibilityId("Office").click();	
	driver.findElementById("Top By Assets").click();
	driver.findElementByAccessibilityId("Image3. This is a Link. ").click();
	driver.findElementByAccessibilityId("Image3. This is a Link. ").click();
	
	//Office Menu: Maps
	Menu.click();
	driver.findElementByAccessibilityId("Office").click();	
	driver.findElementById("Maps").click();
	
	//Office Menu: Rep Rank
	Menu.click();
	driver.findElementByAccessibilityId("Office").click();	
	driver.findElementById("Rep Rank").click();
	driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField").sendKeys(" Firm Name");
	driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeTextField").sendKeys("Office Name");
	driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[3]/XCUIElementTypeTextField").sendKeys("State");
	driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Apply\"]").click();
	
	
	//Office Menu: Query
	Menu.click();
	driver.findElementByAccessibilityId("Office").click();
	driver.findElementByAccessibilityId("Query").click();
	driver.findElementByAccessibilityId("Reload line").click();
	driver.findElementByAccessibilityId("BackArrow line").click(); 
	
	//Firm Menu:Look Up
	Menu.click();
	driver.findElementByAccessibilityId("Firm").click();
	driver.findElementByAccessibilityId("Lookup").click();
	driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton").click();
	driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField").sendKeys("Mml Investors Services");
	driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[3]/XCUIElementTypeButton").click();
	driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[3]/XCUIElementTypeTextField").sendKeys("Mml Investors Services");
	driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Apply\"]").click();
	driver.findElementByXPath("(//XCUIElementTypeStaticText[@name=\"Mml Investors Services, Llc\"])[3]").click();
	driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Quarterly\"]").click();
	driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Yearly\"]").click();
	driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Monthly\"]").click();
	driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"Max Out line\"])[1]").click();
	driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Reload line\"]").click();
	driver.findElementByXPath("//XCUIElementTypeButton[@name=\"BackArrow line\"]").click();
	driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Assets\"]").click();
	driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Sales\"]").click();
	driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"Max Out line\"])[2]").click();
	driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Reload line\"]").click();
	driver.findElementByXPath("//XCUIElementTypeButton[@name=\"BackArrow line\"]").click();
	driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Performance Overview\"]").click();
	driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Offices\"]").click();
	driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Market Share\"]").click();
	driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Product Sales\"]").click();
	driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Profile\"]").click();
	//driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"More\"]").click();
	//driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"More\"]").click();
	driver.findElementByXPath("//XCUIElementTypeButton[@name=\"BackArrow line\"]").click();
	driver.findElementByXPath("//XCUIElementTypeButton[@name=\"BackArrow line\"]").click();
	
	
	//Firm Menu: Top By Purchases.
	Menu.click();
	driver.findElementByAccessibilityId("Firm").click();
	driver.findElementByAccessibilityId("Top By Purchases").click();
	
	
	//Firm Menu: Top By Assets
	Menu.click();
	driver.findElementByAccessibilityId("Firm").click();
	driver.findElementByAccessibilityId("Top By Assets").click();
	
	
	//Firm Menu: Maps
	Menu.click();
	driver.findElementByAccessibilityId("Firm").click();	
	driver.findElementById("Maps").click();
	
	//Firm Menu: Query
	Menu.click();
	driver.findElementByAccessibilityId("Firm").click();
	driver.findElementByAccessibilityId("Query").click();
	driver.findElementByAccessibilityId("Reload line").click();
	driver.findElementByAccessibilityId("BackArrow line").click();
	
	
	//Product Menu: LookUp
	Menu.click();
	driver.findElementByAccessibilityId("Product").click();
	driver.findElementByAccessibilityId("Lookup").click();
	driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Apply\"]").click();
	
	//Product Menu: Top By Purchases
	Menu.click();
	driver.findElementByAccessibilityId("Product").click();
	driver.findElementByAccessibilityId("Top By Purchases").click();
	
	//Product Menu: Top By Assets
	Menu.click();
	driver.findElementByAccessibilityId("Product").click();
	driver.findElementByAccessibilityId("Top By Assets").click();
	
	//Analytics: Cross Sales Analysis
	Menu.click();
		driver.findElementByAccessibilityId("Analytics").click();
		driver.findElementByAccessibilityId("Cross Sales Analysis").click();
		driver.findElementByAccessibilityId(", RIA").click();
		
	//Analytics: Last Sale Date
		Menu.click();
		driver.findElementByAccessibilityId("Analytics").click();
		driver.findElementByAccessibilityId("Last Sale Date").click();
		//Sort on Last Sale Date
		driver.findElementByAccessibilityId(", Last Sale Date, Row Headings").click();
		
	//Analytics: Branch Segmentation
		Menu.click();
		driver.findElementByAccessibilityId("Analytics").click();
		driver.findElementByAccessibilityId("Branch Segmentation").click();
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField").sendKeys("Firm Name");
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeTextField").sendKeys("Firm Home Office");
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[3]/XCUIElementTypeTextField").sendKeys("Firm City");
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[4]/XCUIElementTypeTextField").sendKeys("Firm State");
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Apply\"]").click();
		driver.findElementByAccessibilityId("Image2. This is a Link. ").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Apply\"]").click();
		
		//Group Lists
		Menu.click();
		driver.findElementByAccessibilityId("Group Lists").click();
		driver.findElementByAccessibilityId("Office Group List").click();
		driver.findElementByAccessibilityId("Firm Group List").click();
		driver.findElementByAccessibilityId("Rep Group List").click();
		driver.findElementByAccessibilityId("My List, selected, a check box option").click();
		driver.findElementByAccessibilityId("Others , not selected, a check box option").click();
		
		
		//Add New Query
		driver.findElementByAccessibilityId("Image3. This is a Link. ").click();
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]").click();
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]").sendKeys("List Description");
		driver.findElementByAccessibilityId("Done").click();
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[4]").click();
		driver.findElementByAccessibilityId("List Description").sendKeys("List Comments");
		driver.findElementByAccessibilityId("Done").click();
		driver.findElementByAccessibilityId("Submit").click();
		
		//Report
		Menu.click();
		driver.findElementByAccessibilityId("Reports").click();
		driver.findElementByAccessibilityId("Reports").isDisplayed();
		
		//Star Report
		Menu.click();
		driver.findElementByAccessibilityId("STAR Report").click();
		driver.findElementByAccessibilityId("Quick View").click();
		driver.findElementByAccessibilityId("S.T.A.R. Quick View").isDisplayed();
		
	//General: About
		Menu.click();
		driver.findElementByAccessibilityId("General").click();
		driver.findElementByAccessibilityId("About").click();
		driver.findElementByAccessibilityId("Close").click();
		
	//General: Settings
		Menu.click();
		driver.findElementByAccessibilityId("General").click();
		driver.findElementByAccessibilityId("Settings").click();
		MobileElement Verbose = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[6]/XCUIElementTypeSwitch");
		Verbose.click();
		MobileElement VoiceAss = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeSwitch");
		VoiceAss.click();
		MobileElement TouchId = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntelliMARS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[8]/XCUIElementTypeSwitch");
		TouchId.click();
		driver.findElementByAccessibilityId("Close").click();
		
		
		Menu.click();
		driver.findElementByAccessibilityId("General").click();
		driver.findElementByAccessibilityId("Settings").click();
		Verbose.click();
		VoiceAss.click();
		TouchId.click();
		
	//Change Password:
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Change Password\"]").click();
		driver.findElementByAccessibilityId("Close").click();
		driver.findElementByAccessibilityId("OK").click();
	//	Show Log
		Menu.click();
		driver.findElementByAccessibilityId("General").click();
		driver.findElementByAccessibilityId("Settings").click();
		driver.findElementByAccessibilityId("Show Log").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
	//General Help
		Menu.click();
		driver.findElementByAccessibilityId("General").click();
		driver.findElementByAccessibilityId("Help").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
	//My My Favorites
		Menu.click();
		driver.findElementByAccessibilityId("My Favorites").click();
		driver.findElementByAccessibilityId("Icon View").click();
		driver.findElementByAccessibilityId("Grid View").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Horizontal scroll bar, 1 page\"])[1]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
	
		
	//Feedback
		Menu.click();
		driver.findElementByAccessibilityId("Feedback").click();
		driver.findElementByAccessibilityId("toField").clear();
		driver.findElementByAccessibilityId("toField").sendKeys("avardhineni@sfsmars.com");
		driver.findElementByAccessibilityId("Cancel").click();
		driver.findElementByAccessibilityId("Delete Draft").click();
		
		
		//SignOut
		Menu.click();
		driver.findElementByAccessibilityId("Sign Out").click();
		driver.findElementByAccessibilityId("Sign Out").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Sign In\"]").isEnabled();
		
		// Market Share EIS-Firm
		Menu.click();
		driver.findElementByAccessibilityId("Market Share EIS").click();
		driver.findElementByAccessibilityId("Firm").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByAccessibilityId("Purchases").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
		// Market Share EIS-Office
		Menu.click();
		driver.findElementByAccessibilityId("Market Share EIS").click();
		driver.findElementByAccessibilityId("Office").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByAccessibilityId("Purchases").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Firm \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" AUM \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		
		// Market Share EIS-Rep
		Menu.click();
		driver.findElementByAccessibilityId("Market Share EIS").click();
		driver.findElementByAccessibilityId("Rep").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByAccessibilityId("Purchases").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Firm \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" AUM \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		
		// Market Share EIS-Product
		Menu.click();
		driver.findElementByAccessibilityId("Market Share EIS").click();
		driver.findElementByAccessibilityId("Product").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByAccessibilityId("Purchases").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" AUM \"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Apply\"]").click();
		
		
		
		// Market Share EIS-Program
		Menu.click();
		driver.findElementByAccessibilityId("Market Share EIS").click();
		driver.findElementByAccessibilityId("Program").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByAccessibilityId("Purchases").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" AUM \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		
		// Market Share EIS-Organization
		Menu.click();
		driver.findElementByAccessibilityId("Market Share EIS").click();
		driver.findElementByAccessibilityId("Organization").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByAccessibilityId("Purchases").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" AUM \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		
		// Market Share EIS-Channel
		Menu.click();
		driver.findElementByAccessibilityId("Market Share EIS").click();
		driver.findElementByAccessibilityId("Channel").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByAccessibilityId("Purchases").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" AUM \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		
		// Market Share EIS-Territory
		Menu.click();
		driver.findElementByAccessibilityId("Market Share EIS").click();
		driver.findElementByAccessibilityId("Territory").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByAccessibilityId("Purchases").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" AUM \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
	
		// Market Share EIS-Asset Class
		Menu.click();
		driver.findElementByAccessibilityId("Market Share EIS").click();
		driver.findElementByAccessibilityId("Asset Class").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByAccessibilityId("Purchases").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" AUM \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		
		// Market Share EIS-AssetSub  Class
		Menu.click();
		driver.findElementByAccessibilityId("Market Share EIS").click();
		driver.findElementByAccessibilityId("Asset Sub Class").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByAccessibilityId("Purchases").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" AUM \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		
		// Market Share EIS-Platform Code
		Menu.click();
		driver.findElementByAccessibilityId("Market Share EIS").click();
		driver.findElementByAccessibilityId("Platform Code").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByAccessibilityId("Purchases").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" AUM \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		
		
		// Market Share ETR-FIRM
		Menu.click();
		driver.findElementByAccessibilityId("Market Share ETR").click();
		driver.findElementByAccessibilityId("Firm").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Firm \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
		
		// Market Share ETR-Office
		Menu.click();
		driver.findElementByAccessibilityId("Market Share ETR").click();
		driver.findElementByAccessibilityId("Office").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();	
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Firm \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
	
		// Market Share ETR-Rep
		Menu.click();
		driver.findElementByAccessibilityId("Market Share ETR").click();
		driver.findElementByAccessibilityId("Rep").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();	
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Firm \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
		// Market Share ETR-Product
		Menu.click();
		driver.findElementByAccessibilityId("Market Share ETR").click();
		driver.findElementByAccessibilityId("Product").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();	
		
		// Market Share ETR-Program
		Menu.click();
		driver.findElementByAccessibilityId("Market Share ETR").click();
		driver.findElementByAccessibilityId("Program").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Program \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
		
		// Market Share ETR-Organisation
		Menu.click();
		driver.findElementByAccessibilityId("Market Share ETR").click();
		driver.findElementByAccessibilityId("OrganiZation").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Source \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
		// Market Share ETR-Channel
		Menu.click();
		driver.findElementByAccessibilityId("Market Share ETR").click();
		driver.findElementByAccessibilityId("Channel").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Channel \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
		// Market Share ETR-Territory
		Menu.click();
		driver.findElementByAccessibilityId("Market Share ETR").click();
		driver.findElementByAccessibilityId("Territory").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Territory \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
		// Market Share ETR-Wholesaler
		Menu.click();
		driver.findElementByAccessibilityId("Market Share ETR").click();
		driver.findElementByAccessibilityId("Wholesaler").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Wholesaler \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
		// Market Share ETR-Asset Class
		Menu.click();
		driver.findElementByAccessibilityId("Market Share ETR").click();
		driver.findElementByAccessibilityId("Asset Class").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Asset Class \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
		
		
		
		// Market Share ETR-Asset Sub Class
		Menu.click();
		driver.findElementByAccessibilityId("Market Share ETR").click();
		driver.findElementByAccessibilityId("Asset Sub Class").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Asset Sub Class \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
		// Market Share EIS-Firm
		Menu.click();
		driver.findElementByAccessibilityId("EIS").click();
		driver.findElementByAccessibilityId("Firm").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"YTD Purchases\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Firm \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
		// Market Share EIS-Office
		Menu.click();
		driver.findElementByAccessibilityId("EIS").click();
		driver.findElementByAccessibilityId("Office").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"YTD Purchases\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Firm \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
		
		// Market Share EIS-Rep
		Menu.click();
		driver.findElementByAccessibilityId("EIS").click();
		driver.findElementByAccessibilityId("Rep").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"YTD Purchases\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Firm \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
		
		
		
		// Market Share EIS-Product
		Menu.click();
		driver.findElementByAccessibilityId("EIS").click();
		driver.findElementByAccessibilityId("Product").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"YTD Purchases\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Product \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
		// Market Share EIS-Product Group
		Menu.click();
		driver.findElementByAccessibilityId("EIS").click();
		driver.findElementByAccessibilityId("Product Group").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"YTD Purchases\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Product Group \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
		// Market Share EIS-Product Type
		Menu.click();
		driver.findElementByAccessibilityId("EIS").click();
		driver.findElementByAccessibilityId("Product Type").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"YTD Purchases\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Product Type \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
		// Market Share EIS-Channel
		Menu.click();
		driver.findElementByAccessibilityId("EIS").click();
		driver.findElementByAccessibilityId("Channel").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"YTD Purchases\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Channel \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
		// Market Share EIS-Territory
		Menu.click();
		driver.findElementByAccessibilityId("EIS").click();
		driver.findElementByAccessibilityId("Territory").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"YTD Purchases\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Territory \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
		
		// Market Share EIS-Wholesaler
		Menu.click();
		driver.findElementByAccessibilityId("EIS").click();
		driver.findElementByAccessibilityId("Wholesaler").click();
		driver.findElementByAccessibilityId("Reload line").click();
		driver.findElementByAccessibilityId("Reorder line").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"YTD Purchases\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
		driver.findElementByAccessibilityId("EIS Graph line").click();
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Wholesaler \"]").click();
		driver.findElementByAccessibilityId("Sort Ascending").click();
		driver.findElementByAccessibilityId("BackArrow line").click();
		
		
		// Market Share ETR-Firm
				Menu.click();
				driver.findElementByAccessibilityId("ETR").click();
				driver.findElementByAccessibilityId("Firm").click();
				driver.findElementByAccessibilityId("Reload line").click();
				driver.findElementByAccessibilityId("Reorder line").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
				driver.findElementByAccessibilityId("EIS Graph line").click();
				driver.findElementByAccessibilityId("OK").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Firm \"]").click();
				driver.findElementByAccessibilityId("Sort Ascending").click();
				driver.findElementByAccessibilityId("BackArrow line").click();
				
				// Market Share ETR-Office
				Menu.click();
				driver.findElementByAccessibilityId("ETR").click();
				driver.findElementByAccessibilityId("Office").click();
				driver.findElementByAccessibilityId("Reload line").click();
				driver.findElementByAccessibilityId("Reorder line").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
				driver.findElementByAccessibilityId("EIS Graph line").click();
				driver.findElementByAccessibilityId("OK").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Firm \"]").click();
				driver.findElementByAccessibilityId("Sort Ascending").click();
				driver.findElementByAccessibilityId("BackArrow line").click();
				
				
				// Market Share ETR-Rep
				Menu.click();
				driver.findElementByAccessibilityId("ETR").click();
				driver.findElementByAccessibilityId("Rep").click();
				driver.findElementByAccessibilityId("Reload line").click();
				driver.findElementByAccessibilityId("Reorder line").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
				driver.findElementByAccessibilityId("EIS Graph line").click();
				driver.findElementByAccessibilityId("OK").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Firm \"]").click();
				driver.findElementByAccessibilityId("Sort Ascending").click();
				driver.findElementByAccessibilityId("BackArrow line").click();
				
				
				
				
				// Market Share ETR-Product
				Menu.click();
				driver.findElementByAccessibilityId("ETR").click();
				driver.findElementByAccessibilityId("Product").click();
				driver.findElementByAccessibilityId("Reload line").click();
				driver.findElementByAccessibilityId("Reorder line").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
				driver.findElementByAccessibilityId("EIS Graph line").click();
				driver.findElementByAccessibilityId("OK").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Product \"]").click();
				driver.findElementByAccessibilityId("Sort Ascending").click();
				driver.findElementByAccessibilityId("BackArrow line").click();
				
				// Market Share ETR-Product Group
				Menu.click();
				driver.findElementByAccessibilityId("ETR").click();
				driver.findElementByAccessibilityId("Product Group").click();
				driver.findElementByAccessibilityId("Reload line").click();
				driver.findElementByAccessibilityId("Reorder line").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
				driver.findElementByAccessibilityId("EIS Graph line").click();
				driver.findElementByAccessibilityId("OK").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Product Group \"]").click();
				driver.findElementByAccessibilityId("Sort Ascending").click();
				driver.findElementByAccessibilityId("BackArrow line").click();
				
				// Market Share ETR-Product Type
				Menu.click();
				driver.findElementByAccessibilityId("ETR").click();
				driver.findElementByAccessibilityId("Product Type").click();
				driver.findElementByAccessibilityId("Reload line").click();
				driver.findElementByAccessibilityId("Reorder line").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
				driver.findElementByAccessibilityId("EIS Graph line").click();
				driver.findElementByAccessibilityId("OK").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Product Type \"]").click();
				driver.findElementByAccessibilityId("Sort Ascending").click();
				driver.findElementByAccessibilityId("BackArrow line").click();
				
				// Market Share ETR-Channel
				Menu.click();
				driver.findElementByAccessibilityId("ETR").click();
				driver.findElementByAccessibilityId("Channel").click();
				driver.findElementByAccessibilityId("Reload line").click();
				driver.findElementByAccessibilityId("Reorder line").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
				driver.findElementByAccessibilityId("EIS Graph line").click();
				driver.findElementByAccessibilityId("OK").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Channel \"]").click();
				driver.findElementByAccessibilityId("Sort Ascending").click();
				driver.findElementByAccessibilityId("BackArrow line").click();
				
				// Market Share ETR-Territory
				Menu.click();
				driver.findElementByAccessibilityId("ETR").click();
				driver.findElementByAccessibilityId("Territory").click();
				driver.findElementByAccessibilityId("Reload line").click();
				driver.findElementByAccessibilityId("Reorder line").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
				driver.findElementByAccessibilityId("EIS Graph line").click();
				driver.findElementByAccessibilityId("OK").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Territory \"]").click();
				driver.findElementByAccessibilityId("Sort Ascending").click();
				driver.findElementByAccessibilityId("BackArrow line").click();
				
				
				// Market Share ETR-Wholesaler
				Menu.click();
				driver.findElementByAccessibilityId("ETR").click();
				driver.findElementByAccessibilityId("Wholesaler").click();
				driver.findElementByAccessibilityId("Reload line").click();
				driver.findElementByAccessibilityId("Reorder line").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
				driver.findElementByAccessibilityId("EIS Graph line").click();
				driver.findElementByAccessibilityId("OK").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Wholesaler \"]").click();
				driver.findElementByAccessibilityId("Sort Ascending").click();
				driver.findElementByAccessibilityId("BackArrow line").click();
				
				
				
				// Market Share ETR-Assets Class
				Menu.click();
				driver.findElementByAccessibilityId("ETR").click();
				driver.findElementByAccessibilityId("Assets Class").click();
				driver.findElementByAccessibilityId("Reload line").click();
				driver.findElementByAccessibilityId("Reorder line").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
				driver.findElementByAccessibilityId("EIS Graph line").click();
				driver.findElementByAccessibilityId("OK").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Asset Class \"]").click();
				driver.findElementByAccessibilityId("Sort Ascending").click();
				driver.findElementByAccessibilityId("BackArrow line").click();
				
				
				
				// Market Share ETR-Assets Sub Class
				Menu.click();
				driver.findElementByAccessibilityId("ETR").click();
				driver.findElementByAccessibilityId("Assets Sub Class").click();
				driver.findElementByAccessibilityId("Reload line").click();
				driver.findElementByAccessibilityId("Reorder line").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
				driver.findElementByAccessibilityId("EIS Graph line").click();
				driver.findElementByAccessibilityId("OK").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Asset Sub Class \"]").click();
				driver.findElementByAccessibilityId("Sort Ascending").click();
				driver.findElementByAccessibilityId("BackArrow line").click();
				
				
				// Market Share ETR-Platform Code
				Menu.click();
				driver.findElementByAccessibilityId("ETR").click();
				driver.findElementByAccessibilityId("Platform Code").click();
				driver.findElementByAccessibilityId("Reload line").click();
				driver.findElementByAccessibilityId("Reorder line").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Purchases\"]").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Done\"]").click();
				driver.findElementByAccessibilityId("EIS Graph line").click();
				driver.findElementByAccessibilityId("OK").click();
				driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\" Platform Code \"]").click();
				driver.findElementByAccessibilityId("Sort Ascending").click();
				driver.findElementByAccessibilityId("BackArrow line").click();
				
	}

	
	}
	
