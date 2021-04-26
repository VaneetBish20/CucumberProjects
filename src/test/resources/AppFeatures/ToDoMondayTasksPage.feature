Feature: Tasks to Complete on Monday

Background:
Given user has already logged in ToDo WebPage

Scenario: Add Three tasks for Monday
Given user gets editable textbox
When user enters taskname1 "Review Test Automation Code"
And user enters taskname2 "Submit review request for Ship it"
And user enters taskname3 "Wait for review"
Then user mark three tasks completed. 
And user click on button clear completed.

Scenario: Addition and Deletion of Tasks
Give user gets editable textbox
When user enters sportstask "Play tennis on Sunday"
And user enters dinnertask "Schedule dinner on saturday"
And user delete dinnertask 
Then user should only see sporttask 