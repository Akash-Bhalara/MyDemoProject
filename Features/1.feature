Feature: 
	@DP-2 
	Scenario: Addition1
		Given I open google
		When I enter "2+2" in search textbox
		Then I should get result as "4"
