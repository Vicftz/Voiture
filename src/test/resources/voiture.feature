#Author: Victor FRITZ, Quentin SAUVAGE

Feature: Création de voiture et de ses éléments
  En tant que client du garage,
  Je veux créer ma voiture comme je l'entend,
  Afin de pouvoir maîtriser le poids de celle-ci.

  Scenario Outline: le client ajoute des roues à une voiture
    Given le client crée <nombre de roues> roues de poids <poids des roues>, un chassis de poids <poids du chassis>
    When le client applique les éléments à la voiture
    Then Le poids de la voiture vaut <poids total>

    Examples:
      | nombre de roues | poids des roues | poids du chassis | poids total |
      | 4               | 50              | 200              | 400         |
      | 4               | 100             | 500              | 900         |

  Scenario: un habitant de la ville fait créer une voiture à l'usine
    Given un habitant normal
    When il veut créer une voiture à l'aide de la factory
    Then la voiture créée est de la classe attendue