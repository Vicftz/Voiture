#Author: Victor FRITZ, Quentin SAUVAGE

Feature: Création d'un chassis
  En tant que client du garage,
  Je veux créer un chassis,
  Afin de pouvoir l'utiliser pour ma future voiture.

  Scenario Outline: le client crée un chassis dont le poids est valide.
    Given le client crée un nouveau chassis sans spécifier son poids
    When le client applique au chassis un <poids> positif
    Then le chassis est créé et son <poids enregistre> est celui indiqué en entrée
    Examples:
      | poids | poids enregistre |
      | 500   | 500              |
      | 0     | 0                |


  Scenario Outline: le client crée un chassis dont le poids est invalide.
    Given le client crée un nouveau chassis sans spécifier son poids
    When le client applique au chassis un <poids> négatif
    Then le chassis est créé et son poids est enregistré avec une valeur de <poids enregistre>
    Examples:
      | poids | poids enregistre |
      | -500  | 0                |
      | -1    | 0                |