#Author: Victor FRITZ, Quentin SAUVAGE

  Feature: Création d'un chassis
    En tant que client du garage,
    Je veux créer un chassis,
    Afin de pouvoir l'utiliser pour ma future voiture.

    Scenario Outline: le client crée un chassis dont le poids est valide.
      Given le client crée un nouveau chassis sans spécifier son poids
        When le client applique au chassis un poids positif
        Then le chassis est créé et son poids est enregistré avec celui indiqué en entrée

      Examples:
        | appel constructeur           | spécification du poids  | poids enregistré |
        | chassis = new Chassis();     | chassis.setPoids(0);    | 0                |
        | chassis = new Chassis();     | chassis.setPoids(1000); | 1000             |

    Scenario Outline: le client crée un chassis dont le poids est invalide.
      Given le client crée un nouveau chassis sans spécifier son poids
      When le client applique au chassis un poids négatif
      Then le chassis est créé et son poids est enregistré avec une valeur de 0

      Examples:
        | appel constructeur           | spécification du poids  | poids enregistré |
        | chassis = new Chassis();     | chassis.setPoids(-1);   | 0                |
        | chassis = new Chassis();     | chassis.setPoids(-500); | 0                |