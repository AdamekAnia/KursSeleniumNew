package Zadanie10;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Random;

public class Zadanie_dodatkowe2 {

    //To jest Zadanie dodatkowe 2 - Selenium Wyszukiwanie elementów

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
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&create_account=1");
    }

    @Test
    public void testMyStore() {
        // Znajdź element na podstawie xPath
        WebElement socialTitle = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[1]/div[1]/label[1]/span/input"));
        // Wybierz Social title - Mr.
        socialTitle.click();

        // Definicja tablicy imion
        String[] firstname = {"Adrian", "Waldemar", "Artur", "Karol", "Krzysztof", "Andrzej", "Jan", "Kamil"};
        Random randomfirstname = new Random();
        int randomFirstInteger = randomfirstname.nextInt(firstname.length); // losowanie liczby z zadanej tablicy
        System.out.println(randomFirstInteger);
        String randomFirstName = firstname[randomFirstInteger];  //przypisanie indeksu z tablicy do imienia
        System.out.println(randomFirstName);

        // Definicja tablicy nazwisk
        String[] lastname = {"Kret", "Skrzat", "Cichy", "Markowski", "Radwan", "Walasek", "Kotek", "Komar"};
        Random randomlastname = new Random();
        int randomLastInteger = randomlastname.nextInt(lastname.length); // losowanie liczby z zadanej tablicy
        System.out.println(randomLastInteger);
        String randomLastName = lastname[randomLastInteger];  //przypisanie indeksu z tablicy do imienia
        System.out.println(randomLastName);


        // Znajdź element na podstawie name  firstname
        WebElement firstName = driver.findElement(By.name("firstname"));
        //  Wyczyść tekst zapisany w elemencie
        firstName.clear();
        //Wpisz first name - wylosowane imię
        firstName.sendKeys(randomFirstName);
        // Znajdź element na podstawie name  lastname
        WebElement lastName = driver.findElement(By.name("lastname"));
        //  Wyczyść tekst zapisany w elemencie
        lastName.clear();
        //Wpisz last name - wylosowane nazwisko
        lastName.sendKeys(randomLastName);
        // Znajdź element na podstawie name  email

        WebElement email = driver.findElement(By.name("email"));
        //  Wyczyść tekst zapisany w elemencie
        email.clear();
        //Wpisz email - wylosowany
        email.sendKeys(randomFirstName+"."+randomLastName+"@"+"randomemail.pl");

        // Znajdź element na podstawie name  password
        WebElement password = driver.findElement(By.name("password"));
        //  Wyczyść teskst zapisany w elemencie
        password.clear();
        //Wpisz password - MariaKowalskaPassword
        password.sendKeys(randomFirstName+randomLastName+"123");
        // Znajdź element na podstawie xPath
        WebElement save = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/footer/button"));
        save.click();

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

