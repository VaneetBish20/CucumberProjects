package stepdefinitions;

import com.pages.ToDoMondayTasksPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ToDoMondayTasksSteps {
	
	private ToDoMondayTasksPage mondayTasks = new ToDoMondayTasksPage(DriverFactory.getDriver());
	
	@Given("user has already logged in ToDo WebPage")
	public void user_has_already_logged_in_to_do_web_page() {
		DriverFactory.getDriver().get("https://todomvc.com/examples/vue/");
	}

	@When("user enters taskname1 {string}")
	public void user_enters_taskname1(String taskname1) {
		 mondayTasks.entertask1(taskname1);
	}

	@When("user enters taskname2 {string}")
	public void user_enters_taskname2(String taskname2) {
		mondayTasks.entertask2(taskname2);
	}

	@When("user enters taskname3 {string}")
	public void user_enters_taskname3(String taskname3) {
		 mondayTasks.entertask3(taskname3);
	}

	@Then("user mark three tasks completed.")
	public void user_mark_three_tasks_completed() {
		 mondayTasks.selectCheckbox();
	}

	@Then("user click on button clear completed.")
	public void user_click_on_button_clear_completed() {
		mondayTasks.clearComplete();
	}

	@When("user enters sportstask {string}")
	public void user_enters_sportstask(String sportstask) {
        mondayTasks.enterSportstask(sportstask);
	}

	@When("user enters dinnertask {string}")
	public void user_enters_dinnertask(String dinnertask) {
		mondayTasks.enterDinnertask(dinnertask);
	}

	@When("user delete dinnertask")
	public void user_delete_dinnertask( ) {
       mondayTasks.deleteDinnertask();
	}

	@Then("user should only see sporttask")
	public void user_should_only_see_sporttask() {
      mondayTasks.verifySporttask();
	}

}
