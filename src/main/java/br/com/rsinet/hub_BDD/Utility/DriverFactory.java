package br.com.rsinet.hub_BDD.Utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {
	private AndroidDriver<WebElement> driver;
	private DesiredCapabilities cap;

	private AndroidDriver<WebElement> AberturaAndroid() throws MalformedURLException {
		cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "motorola one action");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appPackage", "com.Advantage.aShopping");
		cap.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		return driver;
	}

	public AndroidDriver<WebElement> getDriver() throws MalformedURLException {
		if (driver == null) {
			AberturaAndroid();
		}
		return driver;
	}

	public void fecharDriver() throws MalformedURLException {
		if (driver != null) {
			driver.quit();
		}
	}
}
