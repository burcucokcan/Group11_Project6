Feature: Bill Pay Functionality

  Background:
    Given Navigate to ParaBank
    Given User sends key on Left Panel
      | username | grup11_ts0 |
      | password | 12345     |
    When  User clicks on Element on Left Panel
      | loginbutton |
    Then  Customer should login successfully

  Scenario Outline: Pay Bill
    Given User clicks on Element on Left Panel
      | billpay |
    And   User sends key on Right Panel
      | payeename     | <faturaTipi> |
      | address       | Kadıköy      |
      | city          | Istanbul     |
      | state         | Türkiye      |
      | zipcode       | 34400        |
      | phone         | 0532567 8749 |
      | account       | 1111         |
      | verifyaccount | 1111         |
      | amount        | <amount>     |


    And User clicks on Element on Right Panel
      | sendpaymentbutton |

    Then Verify BillPayment successful


    Examples:
      | faturaTipi        | amount |
      | Elektrik Faturası | 85     |
      | Su Faturası       | 45     |
      | DoğalGaz Faturası | 120    |



