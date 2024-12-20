Feature: page d'accueil tunisianet

  Scenario: verification des menus de la page d'accueil
    Given L utilisateur est sur la page d accueil de tunisianet
    When L utilisateur survole la soure sur le menu de la page d accueil
    And l utilisateur clique sur submenu
    Then L'utilisateur est redirige vers la page submenu