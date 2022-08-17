Feature: Verify Testimonals functionality

  @sanity
  Scenario: Verify user is on Website
    Given User redirects to the site.
    Then Verify website title
    And Verify website current url

  @sanity
  Scenario: Verify About us section
    Given User redirects to the site.
    Then User click on About us
    And  Verify click on testimonial
    And Verify read all client names


