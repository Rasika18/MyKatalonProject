Feature: Test login functionality

	@Smoke
  Scenario Outline: Check login is successfull with valid scenario
    Given	user is on login page
    When	user enters <username> and <password>
    And	clicks on login button
    Then	user is navigated to the home page
    
    @Valid
    Examples:
    | username | password |
    | student | Password123 |

		@Invalid
		Examples:
    | username | password |
    | student | Admin24 |
 
