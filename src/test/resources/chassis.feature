#Author: Victor FRITZ, Quentin SAUVAGE

  Feature: Création d'un chassis
    En tant que client du garage,
    Je veux créer un chassis,
    Afin de pouvoir l'utiliser pour ma future voiture.

    Scenario Outline: le client crée un chassis dont le poids est valide.
      Given le client appelle le constructeur de chassis
        When le client saisit un poids positif
        Then le chassis est créé avec le poids indiqué en entrée

      Examples:
        | appel constructeur | poids enregistré |
        | new Chassis(0);    | 0                |
        | new Chassis(1000); | 1000             |

    Scenario Outline: le client crée un chassis dont le poids est invalide.
      Given le client appelle le constructeur de chassis
      When le client saisit un poids strictement négatif
      Then le chassis est créé avec un poids de 0

      Examples:
        | appel constructeur | poids enregistré |
        | new Chassis(-1);   | 0                |
        | new Chassis(-500); | 0                |