@Your_Logo
Feature: Your_Logo_Shopping_Website

  @TC_01
  Scenario Outline: Login and logout with 3 accounts
    Given User opens browser with  Your Logo online store
    When logs in with valid <Mail id> and <Password>
    Then verifies the <Username>
    Then take <Screenshot>
    And logs out
    And closes the browser

    Examples: 
      | Mail id            | Password    | Username           | Screenshot      |
      | kolan@gmail.com    | zaqwsx~369! | Alexander Hawking  | \\Alexander.png |
      | qwert144@gmail.com | qwert^7890  | Jefry David        | \\Jefry.png     |
      | asdf!2@gmail.com   | 12345^7890  | Perry The platypus | \\Perry.png     |

  @TC_02
  Scenario: Login,search,add to cart,fill customer care details and upload a file
    Given User opens browser with the Your Logo online store
    When the user login with valid username "kolan@gmail.com" and password "zaqwsx~369!"
    And searches "Printed Dress"
    And add it to the cart
    And Fill the contact us details,uploads file "src\test\resources\Uploading_Doc\The Selenium Automation Project.docx"
    Then click submit buttom
    And close the browser

  @TC_03
  Scenario: To check the number of products added in cart
    Given The user launches browser and opens Your Logo online store
    When user logins with valid credentials
    And searches the dress "Printed Dress"
    And adds required number of dresses to the cart
    Then checks whether the cart shows correct number of items added
    And close the chrome browser

  @TC_04
  Scenario: To check whether the user is able to send message to customer care without logging in
    Given The user opens Your Logo online store using chrome browser
    When the user clicks and fills contact us details,leaving the mail address textbox empty
    And clicks submit button
    Then an error message should be displayed
    And The browser is closed

  @TC_05
  Scenario: Login,search and purchase
    Given the user launches chrome browser and opens the website Your Logo online store
    When the user logs in with valid username and password
    And search "Casual Dress"
    And add the dress to the cart
    Then purchase the dress
    And gets successful message as response
    And closing the browser

  @TC_06
  Scenario: To check whether the colour of the selected dress is displayed
    Given User opens Your Logo online store website using chrome browser
    When the user searches "T-Shirts"
    And selects Blue colour and adds it to cart
    Then the selected colour of the dress should be displayed in the cart
    And closing the chrome browser

  @TC_07
  Scenario: To check whether the user is able to share the searched dress to a friend
    Given the user starts chrome browser and opens Your Logo online store
    When user searches "Printed Dress"
    And sends it to a friend
    Then gets a message- sent to a friend
    And closes the web browser

  @TC_08
  Scenario: Invalid registration
    Given user starts chrome browser and opens Your Logo online store
    When the user clicks sign in button
    And fills all information leaving one of the mandatory field empty
    And clicks the register button
    Then user gets error message
    And close the web browser
