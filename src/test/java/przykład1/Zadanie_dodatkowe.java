package przykład1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Random;



public class Zadanie_dodatkowe {

    //To jest zadanie dodatkowe 1 - Selenium WebDriver

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
        driver.get("https://prod-kurs.coderslab.pl");
    }
    @Test
    public void testMyStore() {
    // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.name("s"));
    //  Wyczyść teskst zapisany w elemencie
        element.clear();

    // Definicja tablicy produktów do wyszukania
      String[] products = {"Mug", "T-Shirt", "Sweater", "Framed Poster", "Cushion", "Graphics", "Notebook"};
      Random random = new Random();
      int randomInteger = random.nextInt(products.length); // losowanie liczby z zadanej tablicy
        System.out.println(randomInteger);
        String randomProduct = products[randomInteger];  //przypisanie indeksu z tablicy do produktu
        System.out.println(randomProduct);

        // Wpisz wylosowane informacje do wyszukania
        element.sendKeys(randomProduct);
        // Prześlij formularz
        element.submit();
    }
    @After
    public void tearDown() throws Exception {
        //Asercja
      //  String title = driver.getTitle();
      //  Assert.assertTrue(title.contains(randomProduct));

        // Zamknij przeglądarkę
        driver.quit();
    }
}