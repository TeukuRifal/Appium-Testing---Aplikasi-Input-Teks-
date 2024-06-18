import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class basic extends base{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        // Set the desired capabilities
    	AndroidDriver<AndroidElement> driver = capabilities();

        // Wait for the app to load
        try {
            Thread.sleep(5000); // Wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Find the input element and send keys
        AndroidElement inputElement = driver.findElementById("com.appium.testingapp:id/editTextInput");
        inputElement.sendKeys("Hello, World!");

        // Click on the submit button
        AndroidElement submitButton = driver.findElementById("com.appium.testingapp:id/buttonSubmit");
        submitButton.click();

        // Wait for result to appear
        Thread.sleep(2000);

        // Find the result element and get text
        AndroidElement resultElement = driver.findElementById("com.appium.testingapp:id/textViewResult");
        String resultText = resultElement.getText();

        // Print the result
        System.out.println("Result: " + resultText);

//        // Quit the driver
//        driver.quit();
    }
}