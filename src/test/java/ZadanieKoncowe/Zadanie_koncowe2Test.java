package ZadanieKoncowe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.io.File;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class Zadanie_koncowe2Test {

    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executeScript;
    private Object FileUtils;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
//        impicitwait
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        // Przejdź do PHP Travels
        driver.get("https://www.phptravels.net");

        wait = new WebDriverWait(driver, 30);

    }

    @Test
    public void flightReservation() throws InterruptedException {

        //założenie konta użytkownika
        WebElement accountElement = driver.findElement(By.xpath("//*[@id=\"header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div"));
        accountElement.click();
//        Thread.sleep(3000);
        WebElement signupElement = driver.findElement(By.xpath("//*[@id=\"header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[2]"));
        signupElement.click();

        //wypełnienie formularza rejestracji

        //firstname
        WebElement firstNameElement = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstNameElement.clear();
        // Definicja tablicy imion
        String[] firstname = {"Marian", "Tomasz", "Eugeniusz", "Wincenty", "Remigiusz", "Artur", "Radosław"};
        Random randomname = new Random();
        int randomIntegerName = randomname.nextInt(firstname.length); // losowanie liczby z zadanej tablicy
        System.out.println(randomIntegerName);
        String randomName = firstname[randomIntegerName];  //przypisanie indeksu z tablicy do produktu
        System.out.println(randomName);
        // Wpisz wylosowane informacje do wyszukania
        firstNameElement.sendKeys(randomName);

        //lastname
        WebElement lastNameElement = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastNameElement.clear();
        // Definicja tablicy nazwisk
        String[] lastname = {"Gwiazdorski", "Nowicki", "Tarkowski", "Leszcz", "Dobrowolski", "Kowalski", "Januszowski"};
        Random randomlastname = new Random();
        int randomIntegerLastName = randomlastname.nextInt(lastname.length); // losowanie liczby z zadanej tablicy
        System.out.println(randomIntegerLastName);
        String randomLastName = lastname[randomIntegerLastName];  //przypisanie indeksu z tablicy do produktu
        System.out.println(randomLastName);
        // Wpisz wylosowane informacje do wyszukania
        lastNameElement.sendKeys(randomLastName);

        //mobile number
        WebElement mobileElement = driver.findElement(By.xpath("//input[@name='phone']"));
        mobileElement.clear();
        // Definicja tablicy numerów
        String[] mobilenumber = {"034968574", "125430958", "298463524", "295645241", "947362519", "196746209", "230009573"};
        Random randommobilenumber = new Random();
        int randomIntegerMobileNumber = randommobilenumber.nextInt(mobilenumber.length); // losowanie liczby z zadanej tablicy
        System.out.println(randomIntegerMobileNumber);
        String randomMobileNumber = mobilenumber[randomIntegerMobileNumber];  //przypisanie indeksu z tablicy do produktu
        System.out.println(randomMobileNumber);
        // Wpisz wylosowane informacje do wyszukania
        mobileElement.sendKeys(randomMobileNumber);

        //email
        WebElement emailElement = driver.findElement(By.xpath("//input[@name='email']"));
        emailElement.clear();
        emailElement.sendKeys(randomName + randomLastName + "@email.com");

        //password
        WebElement passElement = driver.findElement(By.xpath("//input[@name='password']"));
        passElement.clear();
        passElement.sendKeys(randomLastName + randomName);

        //confirm password
        WebElement confirmpassElement = driver.findElement(By.xpath("//input[@name='confirmpassword']"));
        confirmpassElement.clear();
        confirmpassElement.sendKeys(randomLastName + randomName);

        //submit
        WebElement submitregister = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[9]/button"));
        submitregister.click();

        Thread.sleep(3000);
        //szukanie lotu po zarejestrowaniu użytkownika
        WebElement flightElement = driver.findElement(By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul/li[3]/a"));
        flightElement.click();

        //wybór opcji round trip
        WebElement roundtripElement = driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[1]/div[1]/div[2]/label"));
        roundtripElement.click();

        //wybór miejsca odlotu
        WebElement originElement = driver.findElement(By.id("s2id_location_from"));
        originElement.click();
        WebElement originOpenedElement = driver.findElement(By.xpath("//*[@id='select2-drop']//input"));
        originOpenedElement.clear();
        originOpenedElement.sendKeys("WAW");

        Thread.sleep(3000);
        originOpenedElement.sendKeys(Keys.ENTER);

        //wybór miejsca przylotu
        WebElement destElement = driver.findElement(By.id("s2id_location_to"));
        destElement.click();
        WebElement destClickedElement = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]//input"));
        destClickedElement.clear();
        destClickedElement.sendKeys("JFK");

        Thread.sleep(3000);
        destClickedElement.sendKeys(Keys.ENTER);

        //wybór daty odlotu
        ((JavascriptExecutor) driver).executeScript("document.getElementById('FlightsDateStart').setAttribute('value','2020-01-24')");

        //wybór daty przylotu
        ((JavascriptExecutor) driver).executeScript("document.getElementById('FlightsDateEnd').setAttribute('value','2020-01-31')");

        //kliknięcie search
        WebElement searchElement = driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[2]/div[4]/button"));
        searchElement.click();


        //bookowanie pierwszego lotu
        WebElement bookElement = driver.findElement(By.xpath("//*[@id=\"LIST\"]/li[1]/div/div[1]/div[2]/form[1]/div[2]/div/button"));
        bookElement.click();


        //billing adress
        WebElement billingname = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        billingname.clear();
        billingname.sendKeys(randomName);

        WebElement billinglastname = driver.findElement(By.xpath("//*[@id=\"surname\"]"));
        billinglastname.clear();
        billinglastname.sendKeys(randomLastName);

        WebElement billingemail = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        billingemail.clear();
        billingemail.sendKeys(randomName + randomLastName + "@email.com");

        WebElement billingphone = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
        billingphone.clear();
        billingphone.sendKeys(randomMobileNumber);

        WebElement birthdateElement = driver.findElement(By.xpath("//*[@id=\"birthday\"]"));
        birthdateElement.clear();
        // Definicja tablicy dat urodzenia
        String[] birthdate = {"1982-07-02", "1989-09-01", "1990-05-13", "1992-09-25", "1957-11-02", "1966-03-28", "1994-05-16"};
        Random randombirthdate = new Random();
        int randomIntegerBirthDate = randombirthdate.nextInt(birthdate.length); // losowanie liczby z zadanej tablicy
        System.out.println(randomIntegerBirthDate);
        String randomBirthdate = birthdate[randomIntegerBirthDate];  //przypisanie indeksu z tablicy do produktu
        System.out.println(randomBirthdate);
        // Wpisz wylosowane informacje do wyszukania
        birthdateElement.sendKeys(randomBirthdate);


        WebElement billingpassport = driver.findElement(By.xpath("//*[@id=\"cardno\"]"));
        billingpassport.clear();
        // Definicja tablicy numerów paszportów
        String[] passportnumber = {"BH4048895", "BP1642067", "DI0957725", "ED6538034", "GX5709402", "JO9498528", "JN8699325"};
        Random randompassportnumber = new Random();
        int randomIntegerPassportNumber = randompassportnumber.nextInt(passportnumber.length); // losowanie liczby z zadanej tablicy
        System.out.println(randomIntegerPassportNumber);
        String randomPassportNumber = passportnumber[randomIntegerPassportNumber];  //przypisanie indeksu z tablicy do produktu
        System.out.println(randomPassportNumber);
        // Wpisz wylosowane informacje do wyszukania
        billingpassport.sendKeys(randomPassportNumber);

        WebElement expdateElement = driver.findElement(By.xpath("//*[@id=\"expiration\"]"));
        expdateElement.clear();
        // Definicja tablicy dat
        String[] expirationdate = {"2025-08-26", "2024-05-06", "2023-06-18", "2023-01-31", "2023-03-08", "2022-07-08", "2021-10-30"};
        Random randomexpirationdate = new Random();
        int randomIntegerExpirationDate = randomexpirationdate.nextInt(expirationdate.length); // losowanie liczby z zadanej tablicy
        System.out.println(randomIntegerExpirationDate);
        String randomExpirationDate = expirationdate[randomIntegerExpirationDate];  //przypisanie indeksu z tablicy do produktu
        System.out.println(randomExpirationDate);
        // Wpisz wylosowane informacje do wyszukania
        expdateElement.sendKeys(randomExpirationDate);

        //wybór narodowości
        WebElement nationalityElement = driver.findElement(By.xpath("//*[@id=\"s2id_nationality\"]"));
        nationalityElement.click();
//        Thread.sleep(3000);
        WebElement polishnationality = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[171]/div"));
        polishnationality.click();


        //payments

        Select cardTypeElement = new Select(driver.findElement(By.id("cardtype")));
        cardTypeElement.selectByVisibleText("Visa");

        WebElement cardnumberElement = driver.findElement(By.xpath("//*[@id=\"card-number\"]"));
        cardnumberElement.clear();
        // Definicja tablicy numerów kart
        String[] cardnumber = {"4526110601861127", "4669656664042010", "4197167912967926", "4182304708926421", "4729891483742098", "4271434717466879", "456351898161426"};
        Random randomcardnumber = new Random();
        int randomIntegerCardNumber = randomcardnumber.nextInt(cardnumber.length); // losowanie liczby z zadanej tablicy
        System.out.println(randomIntegerCardNumber);
        String randomCardNumber = cardnumber[randomIntegerCardNumber];  //przypisanie indeksu z tablicy do produktu
        System.out.println(randomCardNumber);
        // Wpisz wylosowane informacje do wyszukania
        cardnumberElement.sendKeys(randomCardNumber);

        Select expiryDate = new Select(driver.findElement(By.id("expiry-month")));
        expiryDate.selectByVisibleText("Mar (03)");

        Select expiryYear = new Select(driver.findElement(By.id("expiry-year")));
        expiryYear.selectByVisibleText("2024");

        WebElement cvvElement = driver.findElement(By.xpath("//*[@id=\"cvv\"]"));
        cvvElement.clear();
        cvvElement.sendKeys("436");

        WebElement cookie = driver.findElement(By.xpath("//*[@id=\"cookyGotItBtnBox\"]/div/button"));
        cookie.click();

//        WebElement acceptRules = driver.findElement(By.xpath("//*[@id='acceptTerm']"));
//        acceptRules.click();
//
//        booking confirmation
        WebElement bookingconfirmationElement = driver.findElement(By.id("confirmBooking"));
        bookingconfirmationElement.click();

           }


//    @After

    // screenshot i quit the browser
//        public void tearDown(){
//        driver.getCurrentUrl();
//        TakesScreenshot ts=(TakesScreenshot)driver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
//        File DestFile = new File("/home/anna/IdeaProjects/KursSelenium/out");
//        FileUtils.copyFile(source,DestFile);

//        driver.quit();

//    }
}


