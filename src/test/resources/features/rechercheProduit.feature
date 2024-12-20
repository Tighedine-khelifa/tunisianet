Feature: rechercher un produit
@regression
  Scenario: rechercher un produit avec des informations valides
    Given L'utilisateur est sur la page d accueil tunisianet
    When L'utilisateur recherche le produit "protection nano glass 9h pour samsung a12"
    Then L'utilisateur est clique sur le bouton le loup de recherche

