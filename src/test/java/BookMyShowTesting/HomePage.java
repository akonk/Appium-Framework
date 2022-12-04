package BookMyShowTesting;




import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;






public class HomePage {

	


	
	static AppiumDriver  driver;
	

	public static void main(String[] args) throws Exception {
		
		
			SplashScreen();
		
	}
	
	public static void SplashScreen() throws Exception {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		//caps.setCapability("deviceName", "Pixel 2 API 27");
		//caps.setCapability("udid", "emulator-5554");
		
		caps.setCapability("deviceName", "Vivo");
		caps.setCapability("udid", "OVMNNRIN4XMNR8DI");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "11");
		caps.setCapability("appPackage", "com.bt.bms");
		caps.setCapability("appActivity", "com.movie.bms.splashscreen.SplashScreenActivity");
		
		
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		driver = new AppiumDriver(url,caps);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    //Thread.sleep(2000);
		driver.findElement(By.id("com.bt.bms:id/social_bt_google")).click();
		
		
		
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]")).click();
		driver.findElement(By.id("com.bt.bms:id/btn_negative")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[8]/android.widget.ImageView")).click();
		
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"TOP_MOVIES_MOBILE\"]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.ImageView")).click();
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")).click();
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView")).click();
		
		driver.findElement(By.id("com.bt.bms:id/primary_cta_venue_message_showtimes")).click();
		
		//driver.findElement(By.id("	com.bt.bms:id/select_seats_button_picker")).click();
		
		
	   
		
}
