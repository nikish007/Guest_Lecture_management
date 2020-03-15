package testing.selenium.webdriver;

import java.util.concurrent.TimeUnit;
import java.lang.Thread;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class Test1 {
	WebDriver driver;
	JavascriptExecutor jse;
	public  ExtentReports report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html",true);
	public ExtentTest test;
	
	@Test
	public void InvokeBrowser(){
		
		test = report.startTest("invoke browser");
		try {
			
			System.setProperty("webdriver.chrome.driver","D:\\Ddrive\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("http://localhost:8081/");
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		report.endTest(test);
		report.flush();
	}
	
	public void login(){
		
		test = report.startTest("Login");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[1]/input")).sendKeys("cseAdmin01");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[2]/input")).sendKeys("Admin01");
		driver.findElement(By.name("login_bt")).click();
		test.log(LogStatus.PASS, "Navigated to the specified URL");
		report.endTest(test);
		report.flush();
	}
	
	public void error_login(){
		test = report.startTest("wrong_password");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[1]/input")).sendKeys("cseAdmin01");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[2]/input")).sendKeys("Adm");
		driver.findElement(By.name("login_bt")).click();
		WebElement error_code = driver.findElement(By.id("myDIV"));
		String er = error_code.getText();
		
		if(er!="Error"){
			System.out.println("error detected: passed");
			test.log(LogStatus.PASS, "login error deteced passed");
			report.endTest(test);
			report.flush();
		}
		else{
			test.log(LogStatus.FAIL, "error_login failed");
			report.endTest(test);
			report.flush();
		}
		
	}
	
	public void error_login_username(){
		test = report.startTest("wrong_username");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[1]/input")).sendKeys("cseAdmi");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[2]/input")).sendKeys("Adm");
		driver.findElement(By.name("login_bt")).click();
		WebElement error_code = driver.findElement(By.id("myDIV"));
		String er = error_code.getText();
		
		if(er!="Error"){
			System.out.println("error detected: passed");
			test.log(LogStatus.PASS, "wrong username detected");
			report.endTest(test);
			report.flush();
		}
		
		else{
			test.log(LogStatus.FAIL, "error_login_username failed");
			report.endTest(test);
			report.flush();
		}
		
	}
	
	
	public void forgot_password(){
		try {test = report.startTest("forgot password");
			driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[3]/div[2]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).sendKeys("cseAdmin01");
			driver.findElement(By.name("form_username")).sendKeys("jaya");
			driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/form/button")).click();
			test.log(LogStatus.PASS, "user details submitted");
			Thread.sleep(2000);
			driver.findElement(By.name("form_username")).sendKeys("Admin01");
			driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/form/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/center[2]/h2[1]/a")).click();
			test.log(LogStatus.PASS, "forgot password reseted");
			report.endTest(test);
			report.flush();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			test.log(LogStatus.FAIL, "forgot password failed");
			report.endTest(test);
			report.flush();
		}
	}
	
	public void err_reset_password(){
		try {test = report.startTest("forgot password");
			driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[3]/div[2]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).sendKeys("cseAdmin01");
			driver.findElement(By.name("form_username")).sendKeys("jay");
			
			driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/form/button")).click();
			test.log(LogStatus.PASS, "user details entered");
			Thread.sleep(2000);
			WebElement error_code = driver.findElement(By.id("myDIV"));
			String er = error_code.getText();
			
			
			if(er!="Error"){
				System.out.println("error detected:passed");
				test.log(LogStatus.PASS, "error detected in reset password");
				report.endTest(test);
				report.flush();
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			test.log(LogStatus.FAIL, "login error not detected");
			report.endTest(test);
			report.flush();
		}
	}
	
	public void readmore(){
		try {test = report.startTest("read more ");
			driver.findElement(By.name("username")).sendKeys("cseAdmin01");
			driver.findElement(By.name("password")).sendKeys("Admin01");
			driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[3]/div[1]/p/input")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div/section/div[2]/section/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div[2]/p[3]/a")).click();
			test.log(LogStatus.PASS, "read more passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			test.log(LogStatus.FAIL, "readmore unable to click");
			report.endTest(test);
			report.flush();
		}
	}
	
	public void submit_guest_details(){
			try {test = report.startTest("read more ");
				driver.findElement(By.name("username")).sendKeys("cseAdmin01");
				driver.findElement(By.name("password")).sendKeys("Admin01");
				Thread.sleep(1000);
				driver.findElement(By.name("login_bt")).click();
				Thread.sleep(1000);
				jse = (JavascriptExecutor)driver;
				jse.executeScript("scroll(0,2300)");
				Thread.sleep(1500);
				driver.findElement(By.id("textname")).sendKeys("nikish kumar");
				driver.findElement(By.id("male")).click();
				driver.findElement(By.id("cse")).click();
				driver.findElement(By.id("b")).click();
				Thread.sleep(750);
				WebElement dateBox = driver.findElement(By.xpath("//form/table/tbody/tr[6]/td[2]/input"));
				dateBox.sendKeys("0921999");
				Thread.sleep(750);
				WebElement dateBox1 = driver.findElement(By.xpath("//form/table/tbody/tr[7]/td[2]/input"));
				dateBox1.sendKeys("0921999");
				Thread.sleep(750);
				WebElement timeBox = driver.findElement(By.xpath("//form/table/tbody/tr[8]/td[2]/input"));
				timeBox.sendKeys("0245");
				Thread.sleep(750);
				WebElement timeBox1 = driver.findElement(By.xpath("//form/table/tbody/tr[9]/td[2]/input"));
				timeBox1.sendKeys("0645");
				Thread.sleep(750);
				driver.findElement(By.id("lec")).click();
				driver.findElement(By.id("login_bt")).click();
				test.log(LogStatus.PASS, "submit guest details passed");
				report.endTest(test);
				report.flush();

				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				test.log(LogStatus.FAIL, "submit_guest_details failed");
				report.endTest(test);
				report.flush();
			}
			
	}
	
	
	public void rest_for(){
		try {
			test = report.startTest("submit guest deatils reset ");
			driver.findElement(By.name("username")).sendKeys("cseAdmin01");
			driver.findElement(By.name("password")).sendKeys("Admin01");
			Thread.sleep(1000);
			driver.findElement(By.name("login_bt")).click();
			Thread.sleep(1000);
			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0,2300)");
			Thread.sleep(1500);
			driver.findElement(By.id("textname")).sendKeys("nikish kumar");
			driver.findElement(By.id("male")).click();
			driver.findElement(By.id("cse")).click();
			driver.findElement(By.id("b")).click();
			Thread.sleep(750);
			WebElement dateBox = driver.findElement(By.xpath("//form/table/tbody/tr[6]/td[2]/input"));
			dateBox.sendKeys("0921999");
			Thread.sleep(750);
			WebElement dateBox1 = driver.findElement(By.xpath("//form/table/tbody/tr[7]/td[2]/input"));
			dateBox1.sendKeys("0921999");
			Thread.sleep(750);
			WebElement timeBox = driver.findElement(By.xpath("//form/table/tbody/tr[8]/td[2]/input"));
			timeBox.sendKeys("0245");
			Thread.sleep(750);
			WebElement timeBox1 = driver.findElement(By.xpath("//form/table/tbody/tr[9]/td[2]/input"));
			timeBox1.sendKeys("0645");
			Thread.sleep(750);
			driver.findElement(By.id("lec")).click();
			
			driver.findElement(By.id("login_bt")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("rst_bt")).click();
			test.log(LogStatus.PASS, "submit guest details reset passed");
			report.endTest(test);
			report.flush();
			

			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			test.log(LogStatus.FAIL, "submit_guest_details reset failed");
			report.endTest(test);
			report.flush();
		}
		
	}
	
	
	public void student_details(){
		try {
			test = report.startTest("display student details  ");
			driver.findElement(By.name("username")).sendKeys("cseAdmin01");
			driver.findElement(By.name("password")).sendKeys("Admin01");
			driver.findElement(By.name("login_bt")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//ul/li[3]/a")).click();
			Thread.sleep(1000);
			new Select(driver.findElement(By.name("section1"))).selectByVisibleText("CSE");
			new Select(driver.findElement(By.name("section2"))).selectByVisibleText("A");
			Thread.sleep(1500);
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/form/div[3]/div/div/p/button")).click();
			test.log(LogStatus.PASS, "student details  passed");
			report.endTest(test);
			report.flush();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			test.log(LogStatus.FAIL, "student details failed");
			report.endTest(test);
			report.flush();
		}
	}
	
	public void students_back(){
		try {test = report.startTest("display student details back ");
			driver.findElement(By.name("username")).sendKeys("cseAdmin01");
			driver.findElement(By.name("password")).sendKeys("Admin01");
			driver.findElement(By.name("login_bt")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//ul/li[3]/a")).click();
			Thread.sleep(1000);
			new Select(driver.findElement(By.name("section1"))).selectByVisibleText("CSE");
			new Select(driver.findElement(By.name("section2"))).selectByVisibleText("A");
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/form/div[3]/div/div/p/button")).click();
			driver.findElement(By.xpath("/html/body/a")).click();
			test.log(LogStatus.PASS, "student details  passed back");
			report.endTest(test);
			report.flush();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			test.log(LogStatus.FAIL, "student details back failed");
			report.endTest(test);
			report.flush();
		}
	}
	
	public void logout_main(){
		try {test = report.startTest("logout main ");
			driver.findElement(By.name("username")).sendKeys("cseAdmin01");
			driver.findElement(By.name("password")).sendKeys("Admin01");
			driver.findElement(By.name("login_bt")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div[1]/nav/div/div/ul/li[7]/a")).click();
			test.log(LogStatus.PASS, "logout main passed ");
			report.endTest(test);
			report.flush();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			test.log(LogStatus.FAIL, "logout main failed");
			report.endTest(test);
			report.flush();
		}
	}
	
	public void logout_studentdetails(){
		try {
			test = report.startTest("logout_student details main ");
			driver.findElement(By.name("username")).sendKeys("cseAdmin01");
			driver.findElement(By.name("password")).sendKeys("Admin01");
			driver.findElement(By.name("login_bt")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//ul/li[3]/a")).click();
			Thread.sleep(1000);
			new Select(driver.findElement(By.name("section1"))).selectByVisibleText("CSE");
			new Select(driver.findElement(By.name("section2"))).selectByVisibleText("A");
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div[1]/nav/div/div/ul/li[7]/a")).click();
			test.log(LogStatus.PASS, "logout_students_details main passed ");
			report.endTest(test);
			report.flush();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			test.log(LogStatus.FAIL, "logout_student_details main failed");
			report.endTest(test);
			report.flush();
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 obj =  new Test1();
		
			
			obj.InvokeBrowser();
			obj.login();
			
			obj.InvokeBrowser();
			obj.error_login();
			
			obj.InvokeBrowser();
			obj.forgot_password();
			
			obj.InvokeBrowser();
			obj.err_reset_password();
			
			obj.InvokeBrowser();
			obj.readmore();
		
			obj.InvokeBrowser();
			obj.submit_guest_details();
		
			obj.InvokeBrowser();
			obj.rest_for();
			
			obj.InvokeBrowser();
			obj.student_details();
			
			obj.InvokeBrowser();
			obj.students_back();
		
			obj.InvokeBrowser();
			obj.logout_main();
			
			obj.InvokeBrowser();
			obj.logout_studentdetails();
		
			obj.InvokeBrowser();
			obj.error_login_username();
			
			
		
	}

}
