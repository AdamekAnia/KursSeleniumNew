package cucumber.test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Zadanie1_koncowe {

    public String email;
    public String firstname;
    public String lastname;
    public String password;
    public String repeatpassword;
    public String city;
    public String zip;
    public String street;
    public String houseNumber;
    public String expectedname;
    public String verify;
    public WebDriver driver;


    @Given("open browser with tester.codersguru.pl")
    public void openCodersGuru() {
//         Skonfiguruj sterownik przeglądarki
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");
//        Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        //impicitwait
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Przejdź do codersguru.pl
        driver.get("https://tester.codersguru.pl");
    }

    @When("user clicks register")
    public void account() {
        // Znajdź element wprowadzania tekstu na podstawie jego xPath - Załóż konto
        WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
        button.click();
    }
    @And("choose private account")
    public void privateaccount() {
        // Znajdź element wprowadzania tekstu na podstawie jego id - person
        WebElement privatebutton = driver.findElement(By.id("person"));
        privatebutton.click();
    }
    @And("fills the formular with data (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)")
    public void fillsTheFormular (String email, String firstname, String lastname, String password, String repeatPassword, String city, String zip, String street, String houseNumber){
        WebElement emailbutton = driver.findElement(By.xpath("//input[@type='email']"));
        emailbutton.clear();
        emailbutton.sendKeys(email);

        WebElement firstnamebutton = driver.findElement(By.xpath(("//input[@name='fos_user_registration_form[name]']")));
        firstnamebutton.clear();
        firstnamebutton.sendKeys(firstname);

        WebElement lastnamebutton = driver.findElement(By.xpath(("//input[@name='fos_user_registration_form[lastname]']")));
        lastnamebutton.clear();
        lastnamebutton.sendKeys(lastname);

        WebElement passwordbutton = driver.findElement(By.xpath("//input[@id='fos_user_registration_form_plainPassword_first']"));
        passwordbutton.clear();
        passwordbutton.sendKeys(password);

        WebElement repeatpasswordbutton = driver.findElement(By.xpath("//input[@id='fos_user_registration_form_plainPassword_second']"));
        repeatpasswordbutton.clear();
        repeatpasswordbutton.sendKeys(repeatPassword);

        WebElement citybutton = driver.findElement(By.xpath("//input[@id='form_city']"));
        citybutton.clear();
        citybutton.sendKeys(city);

        WebElement zipbutton = driver.findElement(By.xpath("//input[@id='form_postal_code']"));
        zipbutton.clear();
        zipbutton.sendKeys(zip);

        WebElement streetbutton = driver.findElement(By.xpath("//input[@id='form_street']"));
        streetbutton.clear();
        streetbutton.sendKeys(street);

        WebElement houseNumberbutton = driver.findElement(By.xpath("//input[@id='form_number']"));
        houseNumberbutton.clear();
        houseNumberbutton.sendKeys(houseNumber);

        WebElement acceptStatutebutton = driver.findElement(By.xpath("//input[@type='checkbox']"));
        acceptStatutebutton.click();

        WebElement submitbutton = driver.findElement(By.xpath("//button[@id='register-submit-btn']"));
        submitbutton.click();
    }

    @Then("username (.*) should appear on the page")
    public void userloggedin (String expectedname) {
        System.out.println(expectedname + " - użytkownik zalogowany");
        }
    public void verifyTest (String firstname)   {
        WebElement verifyelement = driver.findElement(By.id("user-name"));
        String verify = verifyelement.getText();
        System.out.println(verify);
        Assert.assertEquals(firstname, verify);
            }
    @And("close Chromebrowser")
    public void closeChromebrowser(){
        driver.quit();
    }

}
