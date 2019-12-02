package cucumber.test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie14_i_15 {
    //definicje metod
    public String firstname;
    public String lastname;
    public String emailaddress;
    public String username;
    public String address1;
    public String state;
    public String city;
    public String password;
    public String zip;
    public WebDriver driver;

    @Given("open browser with aavtrain.com")
    public void openAavtrain() {
        // Skonfiguruj sterownik przeglądarki
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Google
        driver.get("https://aavtrain.com/");

        }

       @When("user clicks register button")
       public void registerNewUser() {
           // Znajdź element wprowadzania tekstu na podstawie jego xPath - register here
           WebElement register = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr/td/div[2]/div[2]/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td/div/a"));
           register.click();
       }

       @And( "fills in with data (.*)")
        public void fillsTheFormular(String firstname, String lastname, String emailaddress, String username, String address1, String state, String city, String zip, String password){
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
         WebElement firstName = driver.findElement(By.name("first_name"));
         //Wpisz First Name
         firstName.sendKeys(firstname);

         // Znajdź element wprowadzania tekstu na podstawie jego nazwy
            WebElement lastName = driver.findElement(By.name("last_name"));
         // Wpisz Last Name
            lastName.sendKeys(lastname);

         // Znajdź element wprowadzania tekstu na podstawie jego nazwy
            WebElement emailAdress = driver.findElement(By.name("email"));
         // Wpisz email
           emailAdress.sendKeys(emailaddress);

         // Znajdź element wprowadzania tekstu na podstawie jego nazwy
            WebElement userName = driver.findElement(By.name("user_name"));
         // Wpisz username
           userName.sendKeys(username);

         // Znajdź element wprowadzania tekstu na podstawie jego nazwy
            WebElement newAdress = driver.findElement(By.name("address1"));
         // Wpisz adres
           newAdress.sendKeys(address1);

         // Znajdź element wprowadzania tekstu na podstawie jego nazwy
            WebElement newState = driver.findElement(By.name("prov"));
         // Wpisz state
           newState.sendKeys(state);

         // Znajdź element wprowadzania tekstu na podstawie jego nazwy
            WebElement newCity = driver.findElement(By.name("city"));
         // Wpisz city
           newCity.sendKeys(city);

         // Znajdź element wprowadzania tekstu na podstawie jego nazwy
           WebElement newZip = driver.findElement(By.name("zip"));
           // Wpisz password
           newZip.sendKeys(zip);

         // Znajdź element wprowadzania tekstu na podstawie jego nazwy
            WebElement newPassword = driver.findElement(By.name("password"));
         // Wpisz password
            newPassword.sendKeys(password);
            // Prześlij formularz
            WebElement newElement = driver.findElement(By.name("Submit"));
            newElement.click();
        }
        @Then("new account is created")
        public void accountcreated() {
         }

       @And("close the browser")
        public void closeBrowser(){
            driver.quit();
    }
    }

