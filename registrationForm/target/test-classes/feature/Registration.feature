Feature: Registration
	
	Scenario: To verify the Refresh button clears all the filled in data
		Given I enter URL
		Then I click on Refresh
		Then I click on Submit
		And I verify FirstName is blank
		Then I quit
		
#	Scenario: To verify the media links on the page footer
#		Given I enter URL
#		Then I click on facebook link
#		Then I click on Linkedin link
#		Then I click on Twitter link
#		Then I click on Youtube link

		