#Author: Victor FRITZ, Quentin SAUVAGE

Feature: Création de voiture et de ses éléments
  En tant que client du garage,
  Je veux créer ma voiture comme je l'entend,
  Afin de pouvoir maîtriser le poids de celle-ci.

  Scenario Outline: le client ajoute des roues et un chassis à une voiture
    Given le client crée <nombre de roues> roues de poids <poids des roues>, un chassis de poids <poids du chassis>
    When le client applique les éléments à la voiture
    Then Le poids de la voiture vaut <poids total>

    Examples:
      | nombre de roues | poids des roues | poids du chassis | poids total |
      | 4               | 50              | 200              | 400         |
      | 4               | 100             | 500              | 900         |

  Scenario Outline: Remplacement d'une roue de voiture
    Given le client a une voiture à <nombre de roues> roues de poids <poids de chaque roue>
    When le client remplace une roue de sa voiture par une nouvelle de poids <poids nouvelle roue>
    Then la voiture a toujours <nombre de roues> roues
    And le poids de la voiture est mis à jour au poids <poids final>

    Examples:
      | nombre de roues | poids de chaque roue | poids nouvelle roue | poids final |
      | 4               | 5                    | 6                   | 21          |
      | 3               | 10                   | 15                  | 35          |