package stepdefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.TestContext;

public class PlaceOrderStep {
    TestContext context;
    public PlaceOrderStep(TestContext context){
        this.context = context;
    }
    @Given("login admin account email {string} and password {string}")
    public void loginAdminAccountEmailAndPassword(String username, String password) {
        context.pageObjectManager.getLoginPage().enterUsernameAndPassword(username, password);
    }

    @Then("go to place order page")
    public void goToPlaceOrderPage() {
        context.pageObjectManager.getLoginPage().goToPlaceOrderPage();
    }

    @And("select Sales Date")
    public void selectSalesDate() {
        context.pageObjectManager.getLoginPage().selectSalesDate();
    }

    @When("select seller name {string}")
    public void selectSellerName(String seller) {
        context.pageObjectManager.getLoginPage().selectSellerName(seller);
    }

    @And("select slot {string}")
    public void selectSlot(String slot) {
        context.pageObjectManager.getLoginPage().selectSlot(slot);
    }

    @Then("select customer name {string}")
    public void selectCustomerName(String customer) {
        context.pageObjectManager.getLoginPage().selectCustomerName(customer);
    }

    @And("enter Quantity count {string}")
    public void enterQuantityCount(String Quantity) {
        context.pageObjectManager.getLoginPage().selectQuantity(Quantity);
    }

    @When("select Daily Payment mode {string}")
    public void selectDailyPaymentMode(String Paymentmode) {
        context.pageObjectManager.getLoginPage().selectPaymentMode(Paymentmode);
    }

    @Then("click Place order button")
    public void clickPlaceOrderButton() {
        context.pageObjectManager.getLoginPage().selectPlaceOrderButton();
    }
    @And("again select customer name {string}, Quantity {string} and Payment mode {string}")
    public void againSelectCustomerNameQuantityAndPaymentMode(String customer, String Quantity, String Paymentmode) {
//        context.pageObjectManager.getLoginPage().selectCustomerName(customer);
//        context.pageObjectManager.getLoginPage().selectQuantity(Quantity);
//        context.pageObjectManager.getLoginPage().select2ndPaymentMode(Paymentmode);
//        context.pageObjectManager.getLoginPage().selectPlaceOrderButton();

        // Record start time
        long startTime = System.currentTimeMillis();

        // Run loop until 3 Hours (3 * 60 * 60 * 1000 ms)
        while (System.currentTimeMillis() - startTime < 3 * 60 * 60 * 1000) {
            context.pageObjectManager.getLoginPage().selectCustomerName(customer);
            context.pageObjectManager.getLoginPage().selectQuantity(Quantity);
            context.pageObjectManager.getLoginPage().select2ndPaymentMode(Paymentmode);
            context.pageObjectManager.getLoginPage().selectPlaceOrderButton();

            // Optional: add a short wait so it doesn’t hammer continuously
            try {
                Thread.sleep(2000); // 2 seconds pause
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
