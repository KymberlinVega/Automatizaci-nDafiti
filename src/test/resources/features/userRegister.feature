#languaje:en
Feature: User Register

  Scenario Outline: User Register
    Given That user has opened the ecommerce
    When he selects module
    |  module  |
    | <module> |
    And he adds log data
    |  email  |  pass  |  confirmpass  |  name  |  lastname  |  document  |  type  |  date  |  month  |  year  |  sex  |
    | <email> | <pass> | <confirmpass> | <name> | <lastname> | <document> | <type> | <date> | <month> | <year> | <sex> |
    Then he should see the registered user

    Examples:
    |  module      |  email              |  pass        |  confirmpass  |  name    |  lastname  |  document  |  type  |  date  | month  |  year  |  sex      |
    |  registrate  |  pruebas@gmail.com  |  0123456789  |  0123456789   |  prueba  |  prueba    |  40563451  |  CC    |  20    | 02     |  1995  | Femenino  |