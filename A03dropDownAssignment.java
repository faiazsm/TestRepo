package com.AssignmentWD;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A03dropDownAssignment {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
		Thread.sleep(2000);
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("D:\\StarAgile\\Assignment\\Assignment-03\\A3SS1.jpeg"));
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/form/div[2]/div/a/u")).click();
		WebElement ListDD = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		
		Select ddl = new Select(ListDD);
		Thread.sleep(3000);
		
		File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file1, new File("D:\\StarAgile\\Assignment\\Assignment-03\\A3SS2.jpeg"));
		
		List<WebElement>Lodd=ddl.getOptions();
		ddl.selectByValue("222");
		
		Thread.sleep(3000);
		File file2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file2, new File("D:\\StarAgile\\Assignment\\Assignment-03\\A3SS3.jpeg"));
		
		driver.close();
	}

}
