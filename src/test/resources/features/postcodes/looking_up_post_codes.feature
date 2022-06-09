Feature: Looking up post codes

  @smoke
  Scenario Outline 01: User update API  Put-type request
    When I look up a post code <process>
    Then the resulting should be <200> and body display
    Examples:
    | process |
    | 9243    |
    | 9243    |
  @smoke
  Scenario Outline 02: Get User Info API get-type request
   When get info about user <id>
    Then the resulting should be <status_code> and body  should be display update address
    Examples:
      | id      |status_code|
      | 2786    |200        |

