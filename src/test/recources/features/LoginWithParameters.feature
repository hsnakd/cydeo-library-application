Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials two different accounts

  Background: Assuming user in the login page
    Given user is on the login page

  @librarian @employee
  Scenario: Login as librarian
    When user enters librarian 'librarian2@library'
    And user enters library 'uYrhHmmj'
    Then user should see the dashboard

  @student
  Scenario: Login as student
    When user enters student 'student2@library'
    And user enters students 'zyxa10vg'
    Then user should see the dashboard

  @student
  Scenario: Login as student
    When user enters username 'student2@library' password 'zyxa10vg' and login
      Then user should see the dashboard