package pom_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page {
	WebDriver driver;


	public Login_page(WebDriver driver) {
		this.driver = driver;
	}

	

	public void do_login(String uid, String pass) {
		driver.findElement(By.id("userName")).sendKeys(uid);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.name("Login")).click();
	}
}
