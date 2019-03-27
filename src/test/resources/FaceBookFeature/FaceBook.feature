Feature: Title of your feature
  Testing the login page of FaceBook

  Scenario Outline: Validating facebook login page
    Given The user should in FaceBook Login Page
    When The user should pass username and password"<rowNo>"
    Then The Facebook should logged in

    Examples: 
      | rowNo |
      |     1 |
      |     2 |
      |     3 |
      