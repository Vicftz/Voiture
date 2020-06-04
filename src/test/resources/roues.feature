#Author: Victor FRITZ, Quentin SAUVAGE

Feature: Création de roues
  En tant que client du garage,
  Je veux créer des roues,
  Afin de pouvoir les utiliser pour ma future voiture.

  Scenario Outline: le client ajoute des roues à une voiture
    Given le client crée <nombre de roues> roues et souhaite les associer à une voiture existante
    When le client applique les roues à la voiture
    Then La voiture possède <taille de la liste> roues

    Examples:
      | nombre de roues | taille de la liste |
      | 1               | 1                  |
      | 2               | 2                  |
      | 4               | 4                  |