Feature: ToDo MVC WebPage

Scenario: Visit ToDo MVC WebPage
Given user is on ToDo MVC web page
When user gets editable textbox
Then editable title should be "What needs to be done?"

Scenario: Add tasks in ToDo list
Given user is on ToDo MVC web page
When user enters taskname "Prepare for SingTel Interview"
And user click on Enter keyword
Then user taskname gets added in the list
And page list should display

