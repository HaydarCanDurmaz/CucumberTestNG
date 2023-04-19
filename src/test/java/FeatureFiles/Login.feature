Feature: Login creating
  Scenario: Login is successfuly
    Given Nagigate to website
    And Enter username as "username" and password as  "password"
    When clicl login button
    Then Verifly that you are logged in.