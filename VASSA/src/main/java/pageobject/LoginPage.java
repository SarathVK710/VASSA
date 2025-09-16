package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsernameAndPassword(String username, String password){
        driver.findElement(By.xpath("//input[@data-testid='username']")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@data-lov-name='button']")).click();
    }
    public void goToPlaceOrderPage(){
        driver.findElement(By.xpath("//div/ul/li[@class='ant-menu-item']/descendant::a[text()='Place Order']")).click();
    }
    public void selectSalesDate(){
        driver.findElement(By.xpath("//input[@data-component-name='DatePicker']")).click();
        driver.findElement(By.xpath("//table[@class='ant-picker-content']/tbody/tr/td[@title='2025-09-10']")).click();
    }
    public void selectSellerName(String seller){
        WebElement sellerName = driver.findElement(By.xpath("//input[@aria-owns='rc_select_3_list']"));
        sellerName.sendKeys(seller);
        sellerName.sendKeys(Keys.ENTER);
    }
    public void selectSlot(String slot){
        WebElement slots = driver.findElement(By.xpath("//input[@aria-owns='rc_select_4_list']"));
        slots.sendKeys(slot);
        slots.sendKeys(Keys.ENTER);
    }
    public void selectCustomerName(String customer){
        WebElement customerName = driver.findElement(By.xpath("//input[@aria-owns='rc_select_5_list']"));
        customerName.sendKeys(customer);
        customerName.sendKeys(Keys.ENTER);
    }
    public void selectQuantity(String Quantity){
        WebElement QuanitySize = driver.findElement(By.name("quantity"));
        QuanitySize.sendKeys(Quantity);
    }
    public void selectPaymentMode(String Paymentmode){
        WebElement PaymentModes = driver.findElement(By.xpath("//input[@aria-owns='rc_select_9_list']"));
        PaymentModes.sendKeys(Paymentmode);
        PaymentModes.sendKeys(Keys.ENTER);
    }
    public void select2ndPaymentMode(String Paymentmode){
        WebElement PaymentModes = driver.findElement(By.xpath("//div[@data-component-content='%7B%7D']/descendant::input[@class='ant-select-selection-search-input'][7]"));
        PaymentModes.sendKeys(Paymentmode);
        PaymentModes.sendKeys(Keys.ENTER);
    }
    public void selectPlaceOrderButton(){
        driver.findElement(By.xpath("//button[@data-lov-name='button'][2]")).click();
    }

}
