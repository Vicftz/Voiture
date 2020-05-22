#Author: Victor FRITZ, Quentin SAUVAGE

Feature: Création d'un chassis
  En tant que client du garage,
  Je veux créer un chassis,
  Afin de pouvoir l'utiliser pour ma future voiture.

  Scenario Outline: le client crée une roue et l'associe à une voiture.
    Given le client crée une nouvelle roue et souhaite l'associer à une voiture existance
    When le client set la voiture à la roue
    Then On peut accéder à la voiture à partir de la roue

    Examples:
      | appel constructeur | association de la voiture | voiture enregistré |
      | roue = new Roue(); | roue.setVoiture(roue);    | voiture            |

  Scenario Outline: le client ajoute .
    Given Une voiture
    When Le client ajoute 4 roues à la voiture
    Then La voiture possède 4 roues

    Examples:
      | appel constructeur       | nombre de roues ajotuées | Taille de la liste de roue |
      | voiture = new Voiture(); | 4                        | 4                          |