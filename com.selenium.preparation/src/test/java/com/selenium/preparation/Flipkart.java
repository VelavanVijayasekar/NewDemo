package com.selenium.preparation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Flipkart {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int i=1;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TakesScreenshot scr = ((TakesScreenshot)driver);
		File source = scr.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snapshot/image"+i+".png");
		FileUtils.copyFile(source, destination);
		i++;
		
	}

}
