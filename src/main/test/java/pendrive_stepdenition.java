import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;
public class pendrive_stepdenition {
    private int cartQuantity = 0; // This variable will store the quantity in the cart

    @Given("User searches for HP Pen Drive")
    public void userSearchesForHPPenDrive() {
        // Your code to navigate to the product page and search for HP Pen Drive
        // This step may involve opening a browser and performing a search.
    }

    @When("Add the first result on the page with quantity {int}")
    public void addPenDriveToCart(int quantity) {
        // Your code to add the product to the cart with the specified quantity
        // This step may involve clicking buttons, filling out forms, etc.
        cartQuantity = quantity; // Update the cart quantity
    }

    @Then("Cart should display {int} pen drive")
    public void verifyCartQuantity(int expectedQuantity) {
        // Your code to verify the quantity in the cart matches the expected quantity
        assertEquals(expectedQuantity, cartQuantity);
    }
}
