Feature: login

  Background:
    Given  user is on homepage

  @test
  Scenario Outline: User enter invalid credentials to login,
  so he will see error message "invalid Credentials"

    When user enter "<username>"  And user enter "<password>"
    And click on login Button
    Then user should not able to login
    And user can see error "<message>"
   # Valid Username : Admin | Valid Password : admin123 )
    Examples:

      | username | password | message                  |
      # invalid username and invalid password
      | Abcd1    | Xyz11    | Invalid credentials      |
      # invalid username and valid  password
      | Abcd1    | admin123 | Invalid credentials      |
      # invalid username and Blank password
      | Abcd1    |          | Password cannot be empty |
      # blank username and valid password
      |          | admin123 | Username cannot be empty |
      # valid username and invalid password
      | Admin    | Xyz11    | Invalid credentials      |
      # empty username and empty password
      |          |          | Username cannot be empty |
      # invalid username blank password
      | Abcd1    |          | Password cannot be empty |
      # blank usename and invalid password
      |          | admin123 | Username cannot be empty |

