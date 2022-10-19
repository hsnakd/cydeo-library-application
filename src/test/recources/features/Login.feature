Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials two different accounts

  Background: Assuming user in the login page
    Given user is on the login page

  @librarian @employee
  Scenario: Login as librarian
    When user enters librarian username
    And user anters librarion password
    Then user should see the dashboard

  @student
  Scenario: Login as student
    When user enters student username
    And user enters student password
    Then user should see the dashboard

