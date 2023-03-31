Feature: Register Functionality

  Scenario:Register
    Given Navigate to ParaBank
    When  User clicks on Element on Left Panel
      | register |
    And   User sends key on Right Panel
      | firstname       | grup11       |
      | lastname        | StudyTechno  |
      | address         | Kadıköy      |
      | city            | Istanbul     |
      | state           | Türkiye      |
      | zipcode         | 34400        |
      | phone           | 0532567 8749 |
      | ssn             | 11111111111  |
      | username        | grup11_ts0   |
      | password        | 12345        |
      | confirmpassword | 12345        |

    And User clicks on Element on Right Panel
      | registerbutton |

    Then  Customer should be registered successfully