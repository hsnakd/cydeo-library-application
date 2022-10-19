Feature: librarian on the page

  Scenario: As a user, I should be able to login as librarian
    Given user is on the librarian page
    Then user should see below columns
      | Action    |
      | UserID    |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |