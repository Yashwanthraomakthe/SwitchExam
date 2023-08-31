package TablesQuestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintInfoOfCountry {

	@Test
	public void launch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");

		List<WebElement> countires = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr/td/strong"));
		for (WebElement country : countires) {
			if (country.getText().equalsIgnoreCase("Albania")) {
				String countryName = country.getText();
				List<WebElement> countryInfos = driver
						.findElements(By.xpath("//table[@id='countries']/tbody/tr/td//strong[text()='" + countryName
								+ "']/parent::td/following-sibling::td"));

				int noOfInfos = countryInfos.size();

				for (int i = 0; i < noOfInfos; i++) {
					switch (i) {
					case 0:
						System.out.println("Capital : " + countryInfos.get(0).getText());
						break;
					case 1:
						System.out.println("Currency : " + countryInfos.get(1).getText());
						break;
					case 2:
						System.out.println("Primary Language : " + countryInfos.get(2).getText());
					}
				}

			}

		}
	}
}
