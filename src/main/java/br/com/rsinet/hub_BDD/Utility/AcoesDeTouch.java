package br.com.rsinet.hub_BDD.Utility;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class AcoesDeTouch {

	private static TouchAction actions;
	private AndroidDriver<WebElement> driver;

	public AcoesDeTouch(AndroidDriver<WebElement> driver) throws MalformedURLException {
		this.actions = new TouchAction(driver);

	}

	public static void arrastarTela() {
		int x = 490;
		int y = 453;

		actions.press(PointOption.point(475, 1561)).moveTo(PointOption.point(x, y)).release().perform();
	}

	public static void apertarProximo() {

		actions.press(PointOption.point(487, 1564)).moveTo(PointOption.point(502, 420)).release().perform();
	}

	public static void Scroll() {
		actions.press(PointOption.point(405, 1031)).moveTo(PointOption.point(426, 335)).release().perform();
	}

	public static void scrollAndClick(AndroidDriver driver, String visibleText) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))")
				.click();
	}
}
