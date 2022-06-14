#languaje:en
  Feature: Cart operations

    Scenario Outline: Add a product
      Given That "user" has opened the ecommerce
      When he selects the product from the section
        |  category  |  subcategory  |  product  |
        | <category> | <subcategory> | <product> |
      And he adds the product to the cart
        |  size  |
        | <size> |
    Then he should see the added product in the cart

      Examples:
        | category | subcategory      | product            |  size  |
        | Mujer    | Tenis Deportivos | adidas Performance | 36     |