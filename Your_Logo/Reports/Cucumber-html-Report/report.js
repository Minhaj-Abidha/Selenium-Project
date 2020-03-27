$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Features/Your Logo.feature");
formatter.feature({
  "line": 2,
  "name": "Your_Logo_Shopping_Website",
  "description": "",
  "id": "your-logo-shopping-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Your_Logo"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Login and logout with 3 accounts",
  "description": "",
  "id": "your-logo-shopping-website;login-and-logout-with-3-accounts",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC_01"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User opens browser with  Your Logo online store",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "logs in with valid \u003cMail id\u003e and \u003cPassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "verifies the \u003cUsername\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "take \u003cScreenshot\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "logs out",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "closes the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "your-logo-shopping-website;login-and-logout-with-3-accounts;",
  "rows": [
    {
      "cells": [
        "Mail id",
        "Password",
        "Username",
        "Screenshot"
      ],
      "line": 14,
      "id": "your-logo-shopping-website;login-and-logout-with-3-accounts;;1"
    },
    {
      "cells": [
        "kolan@gmail.com",
        "zaqwsx~369!",
        "Alexander Hawking",
        "\\Alexander.png"
      ],
      "line": 15,
      "id": "your-logo-shopping-website;login-and-logout-with-3-accounts;;2"
    },
    {
      "cells": [
        "qwert144@gmail.com",
        "qwert^7890",
        "Jefry David",
        "\\Jefry.png"
      ],
      "line": 16,
      "id": "your-logo-shopping-website;login-and-logout-with-3-accounts;;3"
    },
    {
      "cells": [
        "asdf!2@gmail.com",
        "12345^7890",
        "Perry The platypus",
        "\\Perry.png"
      ],
      "line": 17,
      "id": "your-logo-shopping-website;login-and-logout-with-3-accounts;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Login and logout with 3 accounts",
  "description": "",
  "id": "your-logo-shopping-website;login-and-logout-with-3-accounts;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC_01"
    },
    {
      "line": 1,
      "name": "@Your_Logo"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User opens browser with  Your Logo online store",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "logs in with valid kolan@gmail.com and zaqwsx~369!",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "verifies the Alexander Hawking",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "take \\Alexander.png",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "logs out",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Logout_Step.user_opens_browser_with_Your_Logo_online_store()"
});
formatter.result({
  "duration": 25978286500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kolan@gmail.com",
      "offset": 19
    },
    {
      "val": "zaqwsx~369!",
      "offset": 39
    }
  ],
  "location": "Login_Logout_Step.logs_in_with_valid_and(String,String)"
});
formatter.result({
  "duration": 12188203500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Alexander Hawking",
      "offset": 13
    }
  ],
  "location": "Login_Logout_Step.verifies_the(String)"
});
formatter.result({
  "duration": 181425100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\\Alexander.png",
      "offset": 5
    }
  ],
  "location": "Login_Logout_Step.take(String)"
});
formatter.result({
  "duration": 5217074300,
  "status": "passed"
});
formatter.match({
  "location": "Login_Logout_Step.logs_out()"
});
formatter.result({
  "duration": 5269164600,
  "status": "passed"
});
formatter.match({
  "location": "Login_Logout_Step.closes_the_browser()"
});
formatter.result({
  "duration": 551685200,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Login and logout with 3 accounts",
  "description": "",
  "id": "your-logo-shopping-website;login-and-logout-with-3-accounts;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC_01"
    },
    {
      "line": 1,
      "name": "@Your_Logo"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User opens browser with  Your Logo online store",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "logs in with valid qwert144@gmail.com and qwert^7890",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "verifies the Jefry David",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "take \\Jefry.png",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "logs out",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Logout_Step.user_opens_browser_with_Your_Logo_online_store()"
});
formatter.result({
  "duration": 20506269700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qwert144@gmail.com",
      "offset": 19
    },
    {
      "val": "qwert^7890",
      "offset": 42
    }
  ],
  "location": "Login_Logout_Step.logs_in_with_valid_and(String,String)"
});
formatter.result({
  "duration": 11806273600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jefry David",
      "offset": 13
    }
  ],
  "location": "Login_Logout_Step.verifies_the(String)"
});
formatter.result({
  "duration": 129527600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\\Jefry.png",
      "offset": 5
    }
  ],
  "location": "Login_Logout_Step.take(String)"
});
formatter.result({
  "duration": 3189089000,
  "status": "passed"
});
formatter.match({
  "location": "Login_Logout_Step.logs_out()"
});
formatter.result({
  "duration": 5219732200,
  "status": "passed"
});
formatter.match({
  "location": "Login_Logout_Step.closes_the_browser()"
});
formatter.result({
  "duration": 525151700,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Login and logout with 3 accounts",
  "description": "",
  "id": "your-logo-shopping-website;login-and-logout-with-3-accounts;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC_01"
    },
    {
      "line": 1,
      "name": "@Your_Logo"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User opens browser with  Your Logo online store",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "logs in with valid asdf!2@gmail.com and 12345^7890",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "verifies the Perry The platypus",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "take \\Perry.png",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "logs out",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Logout_Step.user_opens_browser_with_Your_Logo_online_store()"
});
formatter.result({
  "duration": 20738099800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "asdf!2@gmail.com",
      "offset": 19
    },
    {
      "val": "12345^7890",
      "offset": 40
    }
  ],
  "location": "Login_Logout_Step.logs_in_with_valid_and(String,String)"
});
formatter.result({
  "duration": 12447569100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Perry The platypus",
      "offset": 13
    }
  ],
  "location": "Login_Logout_Step.verifies_the(String)"
});
formatter.result({
  "duration": 164541200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\\Perry.png",
      "offset": 5
    }
  ],
  "location": "Login_Logout_Step.take(String)"
});
formatter.result({
  "duration": 3503983300,
  "status": "passed"
});
formatter.match({
  "location": "Login_Logout_Step.logs_out()"
});
formatter.result({
  "duration": 4915004500,
  "status": "passed"
});
formatter.match({
  "location": "Login_Logout_Step.closes_the_browser()"
});
formatter.result({
  "duration": 418821900,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Login,search,add to cart,fill customer care details and upload a file",
  "description": "",
  "id": "your-logo-shopping-website;login,search,add-to-cart,fill-customer-care-details-and-upload-a-file",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@TC_02"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User opens browser with the Your Logo online store",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "the user login with valid username \"kolan@gmail.com\" and password \"zaqwsx~369!\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "searches \"Printed Dress\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "add it to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Fill the contact us details,uploads file \"src\\test\\resources\\Uploading_Doc\\The Selenium Automation Project.docx\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "click submit buttom",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Cart_Contact_Step.user_opens_browser_with_Your_Logo_online_store()"
});
formatter.result({
  "duration": 25297206100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kolan@gmail.com",
      "offset": 36
    },
    {
      "val": "zaqwsx~369!",
      "offset": 67
    }
  ],
  "location": "Login_Cart_Contact_Step.the_user_login_with_valid_username_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 11921051300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Dress",
      "offset": 10
    }
  ],
  "location": "Login_Cart_Contact_Step.searches_something(String)"
});
formatter.result({
  "duration": 6276696600,
  "status": "passed"
});
formatter.match({
  "location": "Login_Cart_Contact_Step.add_it_to_the_cart()"
});
formatter.result({
  "duration": 11819807300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "src\\test\\resources\\Uploading_Doc\\The Selenium Automation Project.docx",
      "offset": 42
    }
  ],
  "location": "Login_Cart_Contact_Step.fill_the_contact_us_details_uploads_src_test_resources_Uploading_Doc_The_Selenium_Automation_Project_docx(String)"
});
formatter.result({
  "duration": 7105211600,
  "status": "passed"
});
formatter.match({
  "location": "Login_Cart_Contact_Step.click_submit_buttom()"
});
formatter.result({
  "duration": 6086719600,
  "status": "passed"
});
formatter.match({
  "location": "Login_Cart_Contact_Step.close_the_browser()"
});
formatter.result({
  "duration": 588542300,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "To check the number of products added in cart",
  "description": "",
  "id": "your-logo-shopping-website;to-check-the-number-of-products-added-in-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@TC_03"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "The user launches browser and opens Your Logo online store",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "user logins with valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "searches the dress \"Printed Dress\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "adds required number of dresses to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "checks whether the cart shows correct number of items added",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "close the chrome browser",
  "keyword": "And "
});
formatter.match({
  "location": "Cart_Check_Step.the_user_launches_browser_and_opens_Your_Logo_online_store()"
});
formatter.result({
  "duration": 22932410200,
  "status": "passed"
});
formatter.match({
  "location": "Cart_Check_Step.user_logins_with_valid_credentials()"
});
formatter.result({
  "duration": 12375979800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Dress",
      "offset": 20
    }
  ],
  "location": "Cart_Check_Step.searches_the_dress_something(String)"
});
formatter.result({
  "duration": 7103394400,
  "status": "passed"
});
formatter.match({
  "location": "Cart_Check_Step.adds_required_number_of_dresses_to_the_cart()"
});
formatter.result({
  "duration": 19984634400,
  "status": "passed"
});
formatter.match({
  "location": "Cart_Check_Step.checks_whether_the_cart_shows_correct_number_of_items_added()"
});
formatter.result({
  "duration": 14553765900,
  "status": "passed"
});
formatter.match({
  "location": "Cart_Check_Step.close_the_chrome_browser()"
});
formatter.result({
  "duration": 791807500,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "To check whether the user is able to send message to customer care without logging in",
  "description": "",
  "id": "your-logo-shopping-website;to-check-whether-the-user-is-able-to-send-message-to-customer-care-without-logging-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 38,
      "name": "@TC_04"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "The user opens Your Logo online store using chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "the user clicks and fills contact us details,leaving the mail address textbox empty",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "clicks submit button",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "an error message should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "The browser is closed",
  "keyword": "And "
});
formatter.match({
  "location": "Customer_Care_Step.the_user_opens_Your_Logo_online_store_using_chrome_browser()"
});
formatter.result({
  "duration": 22054205700,
  "status": "passed"
});
formatter.match({
  "location": "Customer_Care_Step.the_user_clicks_and_fills_contact_us_details_leaving_the_mail_address_textbox_empty()"
});
formatter.result({
  "duration": 7431999600,
  "status": "passed"
});
formatter.match({
  "location": "Customer_Care_Step.clicks_submit_button()"
});
formatter.result({
  "duration": 3672061000,
  "status": "passed"
});
formatter.match({
  "location": "Customer_Care_Step.an_error_message_should_be_displayed()"
});
formatter.result({
  "duration": 3297596300,
  "status": "passed"
});
formatter.match({
  "location": "Customer_Care_Step.the_browser_is_closed()"
});
formatter.result({
  "duration": 406638000,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "Login,search and purchase",
  "description": "",
  "id": "your-logo-shopping-website;login,search-and-purchase",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 46,
      "name": "@TC_05"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "the user launches chrome browser and opens the website Your Logo online store",
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "the user logs in with valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "search \"Casual Dress\"",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "add the dress to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "purchase the dress",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "gets successful message as response",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "closing the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Login_And_Purchase_Step.the_user_launches_chrome_browser_and_opens_the_website_Your_Logo_online_store()"
});
formatter.result({
  "duration": 21161452400,
  "status": "passed"
});
formatter.match({
  "location": "Login_And_Purchase_Step.the_user_login_with_valid_username_and_password()"
});
formatter.result({
  "duration": 11640238100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Casual Dress",
      "offset": 8
    }
  ],
  "location": "Login_And_Purchase_Step.search_something(String)"
});
formatter.result({
  "duration": 6011824500,
  "status": "passed"
});
formatter.match({
  "location": "Login_And_Purchase_Step.add_it_to_the_cart()"
});
formatter.result({
  "duration": 14746177200,
  "status": "passed"
});
formatter.match({
  "location": "Login_And_Purchase_Step.purchase_the_dress()"
});
formatter.result({
  "duration": 23540832100,
  "status": "passed"
});
formatter.match({
  "location": "Login_And_Purchase_Step.gets_successful_message()"
});
formatter.result({
  "duration": 3090750000,
  "status": "passed"
});
formatter.match({
  "location": "Login_And_Purchase_Step.close_the_browser()"
});
formatter.result({
  "duration": 569762000,
  "status": "passed"
});
formatter.scenario({
  "line": 57,
  "name": "To check whether the colour of the selected dress is displayed",
  "description": "",
  "id": "your-logo-shopping-website;to-check-whether-the-colour-of-the-selected-dress-is-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 56,
      "name": "@TC_06"
    }
  ]
});
formatter.step({
  "line": 58,
  "name": "User opens Your Logo online store website using chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 59,
  "name": "the user searches \"T-Shirts\"",
  "keyword": "When "
});
formatter.step({
  "line": 60,
  "name": "selects Blue colour and adds it to cart",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "the selected colour of the dress should be displayed in the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "closing the chrome browser",
  "keyword": "And "
});
formatter.match({
  "location": "Colour_Check_Step.user_opens_Your_Logo_online_store_website_using_chrome_browser()"
});
formatter.result({
  "duration": 47830996800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "T-Shirts",
      "offset": 19
    }
  ],
  "location": "Colour_Check_Step.the_user_searches(String)"
});
formatter.result({
  "duration": 6537904400,
  "status": "passed"
});
formatter.match({
  "location": "Colour_Check_Step.selects_blue_colour_and_adds_it_to_cart()"
});
formatter.result({
  "duration": 9535460000,
  "status": "passed"
});
formatter.match({
  "location": "Colour_Check_Step.the_selected_colour_of_the_dress_should_be_displayed_in_the_cart()"
});
formatter.result({
  "duration": 8284872800,
  "status": "passed"
});
formatter.match({
  "location": "Colour_Check_Step.closing_the_chrome_browser()"
});
formatter.result({
  "duration": 563128700,
  "status": "passed"
});
formatter.scenario({
  "line": 65,
  "name": "To check whether the user is able to share the searched dress to a friend",
  "description": "",
  "id": "your-logo-shopping-website;to-check-whether-the-user-is-able-to-share-the-searched-dress-to-a-friend",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 64,
      "name": "@TC_07"
    }
  ]
});
formatter.step({
  "line": 66,
  "name": "the user starts chrome browser and opens Your Logo online store",
  "keyword": "Given "
});
formatter.step({
  "line": 67,
  "name": "user searches \"Printed Dress\"",
  "keyword": "When "
});
formatter.step({
  "line": 68,
  "name": "sends it to a friend",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "gets a message- sent to a friend",
  "keyword": "Then "
});
formatter.step({
  "line": 70,
  "name": "closes the web browser",
  "keyword": "And "
});
formatter.match({
  "location": "Sharing_To_Friend_Step.the_user_starts_chrome_browser_and_opens_Your_Logo_online_store()"
});
formatter.result({
  "duration": 29776822400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Dress",
      "offset": 15
    }
  ],
  "location": "Sharing_To_Friend_Step.user_searches_something(String)"
});
formatter.result({
  "duration": 6785035700,
  "status": "passed"
});
formatter.match({
  "location": "Sharing_To_Friend_Step.sends_it_to_a_friend()"
});
formatter.result({
  "duration": 14966573400,
  "status": "passed"
});
formatter.match({
  "location": "Sharing_To_Friend_Step.gets_a_message_sent_to_a_friend()"
});
formatter.result({
  "duration": 6510510800,
  "status": "passed"
});
formatter.match({
  "location": "Sharing_To_Friend_Step.closes_the_web_browser()"
});
formatter.result({
  "duration": 558293800,
  "status": "passed"
});
formatter.scenario({
  "line": 73,
  "name": "Invalid registration",
  "description": "",
  "id": "your-logo-shopping-website;invalid-registration",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 72,
      "name": "@TC_08"
    }
  ]
});
formatter.step({
  "line": 74,
  "name": "user starts chrome browser and opens Your Logo online store",
  "keyword": "Given "
});
formatter.step({
  "line": 75,
  "name": "the user clicks sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 76,
  "name": "fills all information leaving one of the mandatory field empty",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "clicks the register button",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "user gets error message",
  "keyword": "Then "
});
formatter.step({
  "line": 79,
  "name": "close the web browser",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Account_Step.user_starts_chrome_browser_and_opens_Your_Logo_online_store()"
});
formatter.result({
  "duration": 20659227500,
  "status": "passed"
});
formatter.match({
  "location": "Create_Account_Step.the_user_clicks_sign_in_button()"
});
formatter.result({
  "duration": 11081263400,
  "status": "passed"
});
formatter.match({
  "location": "Create_Account_Step.fills_all_information_leaving_one_of_the_mandatory_field_empty()"
});
formatter.result({
  "duration": 4861659700,
  "status": "passed"
});
formatter.match({
  "location": "Create_Account_Step.clicks_the_register_button()"
});
formatter.result({
  "duration": 5647719000,
  "status": "passed"
});
formatter.match({
  "location": "Create_Account_Step.user_gets_error_message()"
});
formatter.result({
  "duration": 5266321000,
  "status": "passed"
});
formatter.match({
  "location": "Create_Account_Step.close_the_web_browser()"
});
formatter.result({
  "duration": 467316900,
  "status": "passed"
});
});