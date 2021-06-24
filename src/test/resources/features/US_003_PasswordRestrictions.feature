@passwordRestriction
Feature: US003 Password Restrictions

  Scenario Outline: Password Strength Bar changes according to password
    Given User on the "gmibank_url"
    And User navigates to registration page
    And User provides a "<password>" and confirmation
    Then Password Strength Bar should show "<strength>"

    Examples:
      | password   | strength |
      | aaaaaaa    | 2        |
      | BBBBBBB    | 2        |
      | *******    | 2        |
      | 4444444    | 2        |
      | aaaaaaaB   | 3        |
      | aaaaaaa*   | 3        |
      | aaaaaaa4   | 3        |
      | BBBBBBB*   | 3        |
      | 4444444B   | 3        |
      | 4444444*   | 3        |
      | aaaaaaaB4  | 4        |
      | aaaaaaaB*  | 4        |
      | aaaaaaa4*  | 4        |
      | aaaaaaaB*4 | 5        |



