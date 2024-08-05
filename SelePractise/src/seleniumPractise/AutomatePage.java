package seleniumPractise;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class AutomatePage {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		// Jai Shree Ram
		
		WebDriver driver = new ChromeDriver();
	
        driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Abhishek");
        driver.findElement(By.xpath("//p[2]//input[@type='text']")).sendKeys("Abhi1234");
        driver.findElement(By.xpath("//label[normalize-space()='Single']")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Dance']")).click();
    //    driver.findElement(By.xpath("//select//option[@value='India']"));
        
        Select countryName= new Select(driver.findElement(By.xpath("//fieldset/select[1]")));
        
        countryName.selectByVisibleText("India");
        
        
        Select day= new Select(driver.findElement(By.xpath("(//select)[2]")));
        
        day.selectByIndex(1);
        
        Select month= new Select(driver.findElement(By.xpath("(//select)[3]")));
        
        month.selectByIndex(1);
        
        Select year= new Select(driver.findElement(By.xpath("(//select)[4]")));
        
        year.selectByIndex(1);
        
        driver.findElement(By.xpath("(//input[@name='phone'])[1]")).sendKeys("6398256197");
        driver.findElement(By.xpath("(//input[@name='username'])[1]")).sendKeys("Abhishek tanwar");
        
        driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("abhishektanwar@123.com");
        
        // to upload file on web page via selenium, wen simply use the sendKeys menthod by provind the path pf out file
        // but sendKeys only will work if there is "type= file" in the HTML document
        
//        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\hp\\Desktop\\Resume-Abhi.pdf");
        
        // Actions class to move on the element
        
     WebElement chooseButton=   driver.findElement(By.xpath("//input[@type='file']"));
        Actions act = new Actions(driver);
        // below line will open the "My files" by clicking on the choose file button
        act.moveToElement(chooseButton).click().perform();
        
        // Another approach can be using ROBOT class >>>now with the help of Robot class we can copy file path on 
        // clipboard then will paste and will click on the open button
        
        Robot rb = new Robot();
        rb.delay(2000);
        
        //copy file to clip board>>>will use StringSelection class
        StringSelection ss = new StringSelection("C:\\Users\\hp\\Desktop\\Resume-Abhi.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        
        // perform contrl + v action to paste file
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        // release opration to release the keys
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        // now need to use enter key
        rb.keyPress(KeyEvent.VK_ENTER);
        
        rb.keyRelease(KeyEvent.VK_ENTER);
        
        
        driver.findElement(By.xpath("//fieldset/textarea")).sendKeys("Jai Shree Ram");
        driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys("abhi1234");
        driver.findElement(By.xpath("//input[@name='c_password']")).sendKeys("abhi1234");
        
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String destination= System.getProperty("user.dir")+"\\ScreenShot.\\"+"HomePage.png";
        FileHandler.copy(src, new File(destination));
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='submit']")).click();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	
		

	}

}
