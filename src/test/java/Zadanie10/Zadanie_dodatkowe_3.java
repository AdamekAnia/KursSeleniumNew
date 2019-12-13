package Zadanie10;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadanie_dodatkowe_3 {

    //To jest Zadanie dodatkowe 3 - Funkcje Selenium WebDriver
    private WebDriver driver;

    @Before
    public void setUp() {

        // Uruchom nowy egzemplarz przeglądarki Chrome
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do My Store
        driver.get("https://prod-kurs.coderslab.pl/index.php?id_category=2&controller=category");
    }

    @Test
    public void filterMyStore1() {
        // Filtry: Price: 8.00-10.00 euro

        // Znajdź element na podstawie xPath copy full xPath)
        WebElement price810 = driver.findElement(By.xpath("/html/body/main/section/div/div[1]/div[2]/div[2]/section[6]/ul/li[1]/label/a"));
        // Wybierz Price 8.0.-10.0 euro
        price810.click();
        // Sprawdzenie pierwszego produktu
        // Znajdź element na podstawie xPath copy full xPath) - wejście do elementu
        WebElement product1 = driver.findElement(By.xpath("/html/body/main/section/div/div[1]/div[2]/div[2]/section[6]/ul/li[1]/label/a"));
        clickOnArticle("Mountain Fox");

        }

    @After
    public void tearDown() throws Exception {
       // Zamknij przeglądarkę
     //   driver.quit();
    }
    private void clickOnArticle(String articleName) {
        List<WebElement>products = driver.findElements(By.xpath("//div[@id='js-product-list']//article"));
        WebElement foxElement;
        for (WebElement element: products) {
            if (element.getText().contains(articleName)) {
                element.click();
            }
        }
    }




}
