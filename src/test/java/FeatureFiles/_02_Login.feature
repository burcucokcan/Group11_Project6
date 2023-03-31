Feature: Login Functionality

  Background:
    Given Navigate to ParaBank

  Scenario Outline: Login Successfully
    Given User sends key on Left Panel
      | username | <username> |
      | password | <password> |
    When  User clicks on Element on Left Panel
      | loginbutton |
    Then  Customer should login successfully
    And   User clicks on Element on Left Panel
      | logout |


    Examples:
      | username  | password |
      | grup11_ts0 | 12345    |


  Scenario Outline: Login Failure
    Given User sends key on Left Panel
      | username | <username> |
      | password | <password> |
    When  User clicks on Element on Left Panel
      | loginbutton |
    Then  Customer should not be registered


    Examples:
      | username  | password |
      | grup11_ts0 | 123456   |
      | grup11_t  | 12345    |
      | grup11    | 123458   |

