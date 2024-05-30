Feature: Remplir et soumettre le formulaire de contact

  @SoumissionReussi
  Scenario Outline: Remplir et soumettre le formulaire avec différents jeux de données
    Given je suis sur la page du formulaire de contact
    When je remplis le champ Nom avec <nom>
    And je remplis le champ Prenom avec <prenom>
    And je remplis le champ Email avec <email>
    And je sélectionne "<source>" dans la liste déroulante Ou avez-vous entendu parler de nous
    And je selectionne "<contact_method>" dans la case a cocher Je souhaite etre contacte
    And je click sur le boutton submit
    Then je devrais voir un message "<expected_message>"

    Examples: 
      | nom  | prenom | email                   | source   | contact_method      |
      | Jean | Dupont | jean.dupont@example.com | Twitter  | Par email           |
      |  123 | Dupont | jean.dupont@example.com | Twitter  | Par email           |
      | Jean | Dupont | jean.dupont@example.com | LinkedIn | Par réseaux sociaux |
      | Jean | Dupont | jean.dupont@example.com | Facebook | Par email           |
      |      | Dupont | jean.dupont@example.com | Facebook | Par email           |
      | Jean |        | jean.dupont@example.com | Facebook | Par email           |
      | Jean | Dupont | jean.dupont             | Facebook | Par email           |
      | Jean | Dupont | jean.dupont             | Facebook | Par réseaux sociaux |
