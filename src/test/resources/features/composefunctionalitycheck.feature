Feature: Compose Functionality in Gmail

  Scenario: Compose a new email
    Given User is on the Gmail homepage
    When User clicks on the compose button
    Then User should see a new email composing window
    And User should be able to enter email recipients, subject, message body, and attachments
    And User should see options to add Cc and Bcc recipients
    And User should be able to close the compose window without sending the email

  Scenario: Save email as draft
    Given User is composing a new email
    When User enters recipient, subject, and message body
    And User clicks on the compose button
    Then The email should be saved as a draft in the Drafts folder
    And User should be able to access the saved draft later

  @test
  Scenario: Send email with valid mail_Id
    Given User is composing a new email
    When User enters recipient, subject, and message body
    And User clicks on the Send button
    Then The email should be sent successfully
    And User should see a confirmation message

  Scenario Outline: Attachments
    Given User is composing a new email
    When User adds attachments of "<filesize>"
    Then The attachments should be successfully attached to the email
    And User should be able to send the email with attachments

    Examples: 
      | filesize      |
      | allowedsize   |
      | morethanlimit |

  Scenario: Auto-save functionality
    Given User is composing a new email
    When User enters recipient, subject, and message body
    And User leaves the email composing window
    Then The email content should be auto-saved periodically
    And User should see the auto-saved version when returning to compose the email
