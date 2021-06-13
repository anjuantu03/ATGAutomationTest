Feature: To test the Make coupon functionality

  @Test
  Scenario: Make a coupon and mark the horses
    Given the user in ATG home page
    When the user select Horse
    And Select V4
    And Make a Coupon
    And Mark four horses on v4:One
    And Mark one horse on v4:Two
    And Mark two horses on v4:Three
    And Mark all horses on v4:Four
    Then test is finished
