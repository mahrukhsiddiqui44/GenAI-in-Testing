# 🟦 6. Prompt:
Write Gherkin scenarios for user registration on an e-commerce site.

# 🔶 Output:

Feature: User Registration

Scenario: Successful registration
  Given the user is on the registration page
  When the user enters valid name, email, and password
  And clicks the register button
  Then the user should see a success message

Scenario: Registration with existing email
  Given the user is on the registration page
  When the user enters an email that is already registered
  Then an error message should be displayed
