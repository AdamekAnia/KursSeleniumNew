package Zadanie10;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class KatalonAWSTest {

    // To jest zadanie 10 - Selelenium - WYszukiwanie elementów

    private WebDriver driver;

    @Before
    public void setUp(){
        // Uruchom nowy egzemplarz przeglądarki Chrome

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do katalon-test.s3
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }


    @Test
    public void fillFromTest () {
        // Znajdź element na podstawie id - first-name
        WebElement firstname = driver.findElement(By.id("first-name"));
        // Wpisz first name - Karol
        firstname.sendKeys("Karol");
        // Znajdź element na podstawie id - last-name
        WebElement lastname = driver.findElement(By.id("last-name"));
        // Wpisz last name - Kowalski
        lastname.sendKeys("Kowalski");
        // Znajdź element na podstawie name - Male
        WebElement gender = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]/input"));
        // Wybierz Gender - Male
        gender.click();
        // Znajdź element na podstawie id - dob
        WebElement dob = driver.findElement(By.id("dob"));
        // Wpisz date of birth - 05/22/2010
        dob.sendKeys("05/22/2010");
        // Znajdź element na podstawie id - address
        WebElement address = driver.findElement(By.id("address"));
        // Wpisz adres - Prosta 51
        address.sendKeys("Prosta 51");
        // Znajdź element na podstawie id - email
        WebElement email = driver.findElement(By.id("email"));
        // Wpisz email - karol.kowalski@mailinator.com
        email.sendKeys("karol.kowalski@mailinator.com");
        // Znajdź element na podstawie id - password
        WebElement password = driver.findElement(By.id("password"));
        // Wpisz password - Pass123
        password.sendKeys("Pass123");
        // Znajdź element na podstawie id - company
        WebElement company = driver.findElement(By.id("company"));
        // Wpisz company - Coders Lab
        company.sendKeys("Coders Lab");

        // Znajdź element na podstawie id - role
     //   select role = new Select(driver.findElement(By.id("role")));
        // Wybierz - Business Ananlyst
      //  role.selectByVisibleText("Business Analyst");

        // Znajdź element na podstawie id - comment
        WebElement comment = driver.findElement(By.id("comment"));
        // Wpisz comment - To jest mój pierwszy automat testowy
        comment.sendKeys("To jest mój pierwszy automat testowy");

        // Znajdź element na podstawie id - submit
       WebElement submit = driver.findElement(By.id("submit"));
        // klinij w submit
        submit.click();

        WebElement successMessage = driver.findElement(By.id("submit-msg"));
        Assert.assertTrue(successMessage.getText().contains("Successfully submitted"));
    }

    @After
    public void tearDown () {
        // Zamknij przeglądarkę
      //  driver.quit();
    }

}
