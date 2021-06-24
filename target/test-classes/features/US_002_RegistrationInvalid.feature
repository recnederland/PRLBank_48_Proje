@registrationinvalid
Feature: US_002 Invalid Registration
  Scenario Outline: User applies for registration
    Given User on the "gmibank_url"
    And User navigates to registration page
    And User provides a ssn "<ssn>"
    And User provides a firstname "<firstname>" and a lastname "<lastname>"
    And User provides a adress "<address>"
    And User provides a mobile phone number "<mobile phone number>"
    And User provides a username "<username>"
    And User provides a email "<email>"
    And User provides a new password "<new password>"
    And User provides a new password confirmation "<new password confirmation>"
    And User clicks Register button
    Then User should see same page
    # ssn numarası rakamlardan oluşacaktı ama başına 9 yazıldığında hata veriyor
Examples: Registration info
| ssn       | firstname| lastname| address    | mobile phone number | username | email                | new password | new password confirmation |
#|923-12-1234| team42    | team42   | cikmaz sok | 123-123-1234        | team42   | rumeysa2903@gmail.com| Team-42      | Team-42                |
|           | Team42   | team42  | cikmaz sok | 123-123-1234        | team42   | recep@gmail.com| Team-42      | Team-42                   |
|123-12-1234|          | team42  | cikmaz sok | 123-123-1234        | team42   | recep@gmail.com| Team-42      | Team-42                   |
|123-12-1234| Team42   |         | cikmaz sok | 123-123-1234        | team42   | recep@gmail.com| Team-42      | Team-42                   |
|123-12-1234| Team42   | team42  | cikmaz sok | 123-123-1234        |          | recep@gmail.com| Team-42      | Team-42                   |
|123-12-1234| Team42   | team42  | cikmaz sok | 123-123-1234        | team42   |                | Team-42      | Team-42                   |
|123-12-1234| Team42   | team42  | cikmaz sok | 123-123-1234        | team42   | recep@gmail.com|              | Team-42                   |
|123-12-1234| team42   | team42  | cikmaz sok | 123-123-1234        | team42   | recep@gmail.com| Team-42      |                           |