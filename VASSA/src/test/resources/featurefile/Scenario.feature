Feature: Verify black screen issue
  @CreateScenario
  Scenario Outline:
    Given login admin account email "<username>" and password "<password>"
    Then go to place order page
    And select Sales Date
    When select seller name "<seller>"
    And select slot "<slot>"
    Then select customer name "<customer>"
    And enter Quantity count "<Quantity>"
    When select Daily Payment mode "<Paymentmode>"
    Then click Place order button
    And again select customer name "<customer>", Quantity "<Quantity>" and Payment mode "<Paymentmode>"
    Examples:
      |username|password|seller|slot|customer|Quantity|Paymentmode|
      |admin|12345|Sarath_Distributor|evening|testing (8978098909)|1|Offline|