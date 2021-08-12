@stories
Feature: Academy Choucair
        As a user, I want to learn how to automate in screamplay at the choucair Academy with the automation
        course

  @scenario1
  Scenario: Search for a automation course
    Given than brandon wants lo learn automation at the academy choucair
      | strUser    | strPassword   |
      | 1036948935 | Choucair2020* |
    When the search for the course Recursos Automatizacion Bancolombia on the choucair academy platform
      | strCourse               |
      | Metodología Bancolombia |
    Then he finds the course called resources Recursos Automatizacion Bancolombia
      | strCourse               |
      | Metodología Bancolombia |
