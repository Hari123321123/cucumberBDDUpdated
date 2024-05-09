

Feature: Mail send functionality e2e

  #positive scanario
  
  @test
  Scenario: Sending an Email Successfully with all valid fields
    Given User is on the Gmail homepage
    When User clicks on the compose button
    And User should see a new email composing window
    And User should be able to enter email recipients, subject, message body, and adds attachments
    And User should see options to add Cc and Bcc recipients and adds mail_ids to this fields
    And User clicks on send button
    Then The email is successfully sent
    And The email appears in the sent items folder

  Scenario: Sending an Email Successfully and validate Body message formatting
    Given User is on the Gmail homepage
    When User clicks on the compose button
    And User should see a new email composing window
    And User should be able to enter email recipients, subject, and adds attachments
    And User should see options to add Cc and Bcc recipients and adds mail_ids to this fields
    And User add text in message bodywith apply formatting
    Then The email is successfully sent
    And The email appears in the sent items folder
    And user successfully validate received message body as per sent format

  #Negative scenario
  
  
  Scenario Outline: Sending an Email with Wrong or missing  Information
    Given User is on the Gmail homepage
    When User clicks on the compose button
    And User fill in the recipients maild "<To_email_address>"
    And User click on the send button
    Then An error message appears "Please specify at least one recipient" or "To field was not recognized.Please make sure that all addresses are properly formed."
    And The email is not sent

    Examples: 
      | To_email_address                               | Subject_line | TextBody |
      |                                                |              |          |
      | jdshfjhdjhsjhjsjkshjdhajhdjahdjkhajd@gmail.com | test         |          |
      | sdad12123232323@gmail.com                      | test         | dfsd     |
      | @@@$@%$%$^%^%^@$@$@$dgfgfd@gmail.com           | test         | dsfdsf   |

  Scenario Outline: Sending an Email with mail id with different domain
    Given User is on the Gmail homepage
    When User clicks on the compose button
    And User forget to fill in the recipients "<To_email_address>"
    And User click on the send button
    Then An error message appears like  Please specify at least one recipient.
    And The email is not sent

    Examples: 
      | To_email_address   |
      | afsgsg11@gmail.com |
      | aff123@yahoo.com   |
      | bbh@citi.com       |
