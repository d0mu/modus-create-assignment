package Steps;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Budget {
    private BaseUtil base;

    public Budget(BaseUtil base) {
        this.base = base;
    }

    @Given("I navigate to the budgeting website, budget tab")
    public void iNavigateToBudgetingWebsiteBudgetTab() {
        base.driver.get("http://localhost:8000/budget");
    }

    @And("I add a new entry with the category Income")
    public void iAddANewEntryWithTheCategoryIncome() {
        Select dropdown = new Select(base.driver.findElement(By.cssSelector("[name='categoryId'")));
        dropdown.selectByVisibleText("Income");
    }

    @And("Description (.*)")
    public void descriptionPaycheck(String description) {
        base.driver.findElement(By.cssSelector("[placeholder='Description'")).sendKeys(description);
    }

    @And("Value (.*)")
    public void value(String value) {
        base.driver.findElement(By.cssSelector("[placeholder='Value'")).sendKeys(value);
    }

    @When("I click the add button")
    public void iClickTheAddButton() {
        base.driver.findElement(By.cssSelector("button.submit._1eQR8._3Srv6")).click();
    }

    @Then("the entry is successfully added")
    public void theEntryIsSuccessfullyAdded() {
        String entries = base.driver.findElement(By.cssSelector("table._1IRiC tbody")).getText();
        Assert.assertTrue(entries.contains("Income\nPaycheck\n$30,000.00"));
    }

    @And("I select an existing entry")
    public void iSelectAnExistingEntry() {
        Select dropdown = new Select(base.driver.findElement(By.cssSelector("[name='categoryId'")));
        dropdown.selectByVisibleText("Entertainment");
        base.driver.findElement(By.cssSelector("[placeholder='Description'")).sendKeys("Wedding anniversary");
        base.driver.findElement(By.cssSelector("[placeholder='Value'")).sendKeys("15000");
        base.driver.findElement(By.cssSelector("button.submit._1eQR8._3Srv6")).click();
        base.driver.findElement(By.cssSelector("table._1IRiC tbody tr:nth-child(7)")).click();
    }

    @When("I click the cancel button")
    public void iClickTheCancelButton() {
        base.driver.findElement(By.cssSelector("button.cancel._1eQR8._29Up9")).click();
    }

    @Then("the entry is unchanged")
    public void theEntryIsUnchanged() {
        String entries = base.driver.findElement(By.cssSelector("table._1IRiC tbody")).getText();
        Assert.assertTrue(entries.contains("Entertainment\nWedding anniversary\n-$15,000.00"));
    }

    @When("I edit the value and click the update button")
    public void iEditTheValueAndClickTheUpdateButton() {
        base.driver.findElement(By.cssSelector("[placeholder='Value'")).sendKeys("0");
        base.driver.findElement(By.cssSelector("button.submit._1eQR8._3Srv6")).click();
    }

    @Then("the entry is successfully changed")
    public void theEntryIsSuccessfullyChanged() {
        String entries = base.driver.findElement(By.cssSelector("table._1IRiC tbody")).getText();
        Assert.assertTrue(entries.contains("Entertainment\nWedding anniversary\n-$150,000.00"));
    }
}
