Feature: Disque SSD

  Scenario: Connexion a la page disque SSD
    Given L utilisateur est sur la page disque ssd
    When L utilisateur verifier que le produit"NGFFDGBM2280" est valable
    And  L utilisateur commande le produit
    Then L'utilisateur verifier que la commande de"Disque Dur Interne SSD TwinMOS NGFFDGBM2280 SATA III M.2 / 128 Go" est effectuer



