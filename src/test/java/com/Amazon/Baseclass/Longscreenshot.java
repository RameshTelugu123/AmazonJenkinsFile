package com.Amazon.Baseclass;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v140.page.model.Screenshot;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Longscreenshot {
	 

	public static void takeFullScreenshot(WebDriver driver) throws IOException {
				
		ru.yandex.qatools.ashot.Screenshot screenshot = new AShot()
		        .shootingStrategy(ShootingStrategies.viewportPasting(1000))
		        .takeScreenshot(driver);

		ImageIO.write(screenshot.getImage(), "PNG", new File("fullpage.png"));

	}

}
