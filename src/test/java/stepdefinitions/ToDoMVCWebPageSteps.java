package stepdefinitions;

import com.pages.ToDoMVCPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ToDoMVCWebPageSteps {
	
	//private static String defaultText;
	private ToDoMVCPage todoPage = new ToDoMVCPage(DriverFactory.getDriver());
	
	@Given("user is on ToDo MVC web page")
	public void user_is_on_to_do_mvc_web_page() {
	
		DriverFactory.getDriver().get("https://todomvc.com/examples/vue/");
	}

	@When("user gets editable textbox")
	public void user_gets_editable_textbox() {
		Assert.assertTrue(todoPage.checkToDoEnabled());
	}

	@Then("editable title should be {string}")
	public void editable_title_should_be(String expectedDefaultText) {
	    String defaultToDoText = todoPage.getDefaultToDoText();
	    System.out.println("Check inner Text" + defaultToDoText);
	    Assert.assertTrue(defaultToDoText.contains(expectedDefaultText));
	}

	@When("user enters taskname {string}")
	public void user_enters_taskname(String taskname) {
		todoPage.enterTask(taskname);
	}

	@When("user click on Enter keyword")
	public void user_click_on_enter_keyword() {
	    todoPage.clickEnter();
	}

	@Then("user taskname gets added in the list")
	public void user_taskname_gets_added_in_the_list() {
		Assert.assertTrue(todoPage.verifyTaskExists());
	}

	@Then("page list should display")
	public void page_list_should_display() {
		 Assert.assertTrue(todoPage.isToDoCountDisplayed());
	}

}
