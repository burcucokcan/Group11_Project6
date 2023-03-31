package StepDefinitions;

import Pages.RightPanel;
import Pages.leftPanel;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _02_LoginSteps {
    leftPanel lp=new leftPanel();
    RightPanel rp = new RightPanel();
    @Given("User sends key on Left Panel")
    public void userSendsKeyOnLeftPanel(DataTable items) {
        List <List<String>> stringList = items.asLists(String.class);
        for (int i = 0; i < stringList.size(); i++) {
            WebElement element = lp.getWebElement(stringList.get(i).get(0));
            lp.sendKeysFunction(element, stringList.get(i).get(1));
        }
    }

    @Then("Customer should not be registered")
    public void customerShouldNotBeRegistered() {
        rp.verifyContainsTextFunction(rp.getMessage(),"could not be" );
    }

    @Then("Customer should login successfully")
    public void customerShouldLoginSuccessfuly() {
       lp.verifyElementIsDisplayed(lp.getLogOut());
    }

    @Then("Verify BillPayment successful")
    public void verifyBillPaymentSuccessful() {
        rp.verifyElementIsDisplayed(rp.getPaymentMessage());
    }
}
