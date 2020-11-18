
Feature: Feature para validar login en el sitio clever.com

  Background: Usuario Ingresa en el browser al Sitio clever.com
    Given  Usuario ingresa direccion web clever.com
    Then   Usuario se encuentra en el sitio.

  @Smoke1
  Scenario: Validar Login en clever.com 1
    ##No uso Given por que tengo un Background que me lo propone para este y todos los Scenarios.
    When  user ingresa el usuario en el Login
    And   user ingresa el pass en el Login y selecciona Ingresar
    Then  user valida nombre de usuario Logueado



  @Smoke2
  Scenario: Validar Login en clever.com 2
    ##No uso Given por que tengo un Background que me lo propone para este y todos los Scenarios.
    When  user ingresa el usuario en el Login
    And   user ingresa el pass en el Login y selecciona Ingresar
    Then  user valida nombre de usuario Logueado



