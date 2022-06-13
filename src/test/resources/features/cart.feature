#languaje:en
  Feature: Cart operations

    Scenario: Add a product
      Given That user has opened the ecommerce
      When he selects the product from the section
        |  category  |  subcategory  |  product  |
        | <category> | <subcategory> | <product> |
      And he adds the product to the cart
        |  size  |  discount  |
        | <size> | <discount> |
    Then he should see the added product in the cart

      Examples:
        | category | subcategory      | product                                                       |  size  |  discount  |
        | MUJER    | TENIS DEPORTIVOS | Tenis Running Rosa-Naranja-Blanco adidas Performance Galaxy 5 | 36     | yes        |