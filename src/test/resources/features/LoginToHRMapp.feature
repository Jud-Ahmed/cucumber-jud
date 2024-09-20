Feature: Login Functionality

	Scenario: Valid login to HRM
		Given I navigated to HRM website
		When I enter a valid username
		And I enter a valid password
		And I click on the submit button
		Then I validate that I am logged in
		And I quit the browser
		
	Scenario: Invalid login
		Given I navigated to HRM website
		When I enter a valid username
		And I enter an invalid password
		And I click on the submit button
		Then I validate that Invalid Credentials is displayed
		And I quit the browser