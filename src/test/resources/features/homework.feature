Feature: I as a user want to authenticate in the application to check my credentials


  @auth_incorrect
  Scenario: check login with incorrect username and password
    When I login with username company and password company
    Then you should see the eribank image


  @auth_correct
  Scenario: check login with correct username and password
    When I login with username company and password company
    Then you should see the payment button

  @payment_three
  Scenario : make a payment to three different client
    When  I login with username company and password company and enter valids
    Then  I should see balance

  @payment_country
    Scenario :
    When I enter <phone>,<name>,<amount> and <country>
    Then I choose different country in each scenario

  @logout
  Scenario : log out to eribank
    When  I made payment
    Then  I click log out button







