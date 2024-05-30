# testify_Tech_Test
D'accord, voici une documentation pour le fichier de fonctionnalités donné :

---

# Documentation du fichier de fonctionnalités "Remplir et soumettre le formulaire de contact"

## Introduction
Ce fichier de fonctionnalités décrit les scénarios de test pour remplir et soumettre un formulaire de contact avec différentes combinaisons de données. Ces scénarios permettent de vérifier le bon fonctionnement du formulaire et la validation des données saisies.

## Scénarios de test

### Scénario 1: Remplir le formulaire avec des données valides
- **Nom du test:** Remplir et soumettre le formulaire avec des données valides
- **Description:** Ce scénario teste le remplissage et la soumission du formulaire avec des données valides.
- **Données de test:**
  - Nom: Jean
  - Prénom: Dupont
  - Email: jean.dupont@example.com
  - Source: Twitter
  - Méthode de contact: Par email
- **Étapes du scénario:**
  1. Accéder à la page du formulaire de contact.
  2. Remplir les champs Nom, Prénom, Email, Source, et Méthode de contact.
  3. Cliquer sur le bouton submit.
- **Résultat attendu:** Un message de confirmation "Thanks for contacting us!" devrait être affiché.

### Scénario 2: Remplir le formulaire avec des données invalides
- **Nom du test:** Remplir le formulaire avec des données invalides
- **Description:** Ce scénario teste le comportement du formulaire lorsqu'il est rempli avec des données invalides.
- **Données de test:**
  - Nom: 123
  - Prénom: Dupont
  - Email: jean.dupont@example.com
  - Source: Twitter
  - Méthode de contact: Par email
- **Étapes du scénario:**
  1. Accéder à la page du formulaire de contact.
  2. Remplir les champs Nom, Prénom, Email, Source, et Méthode de contact avec des données invalides.
  3. Cliquer sur le bouton submit.
- **Résultat attendu:** Un message d'erreur "Veuillez saisir un nom valide." devrait être affiché à côté du champ Nom.

### Scénario 3: Remplir le formulaire sans certains champs obligatoires
- **Nom du test:** Remplir le formulaire sans certains champs obligatoires
- **Description:** Ce scénario teste le comportement du formulaire lorsqu'il est soumis avec des champs obligatoires non renseignés.
- **Données de test:**
  - Nom: Jean
  - Prénom: 
  - Email: jean.dupont@example.com
  - Source: Facebook
  - Méthode de contact: Par email
- **Étapes du scénario:**
  1. Accéder à la page du formulaire de contact.
  2. Remplir les champs Nom, Email, Source, et Méthode de contact en laissant le champ Prénom vide.
  3. Cliquer sur le bouton submit.
- **Résultat attendu:** Un message d'erreur "Veuillez saisir un prénom." devrait être affiché à côté du champ Prénom.

### Scénario 4: Remplir le formulaire avec une adresse email invalide
- **Nom du test:** Remplir le formulaire avec une adresse email invalide
- **Description:** Ce scénario teste le comportement du formulaire lorsqu'il est soumis avec une adresse email invalide.
- **Données de test:**
  - Nom: Jean
  - Prénom: Dupont
  - Email: jean.dupont
  - Source: Facebook
  - Méthode de contact: Par email
- **Étapes du scénario:**
  1. Accéder à la page du formulaire de contact.
  2. Remplir les champs Nom, Prénom, Email, Source, et Méthode de contact avec une adresse email invalide.
  3. Cliquer sur le bouton submit.
- **Résultat attendu:** Un message d'erreur "Veuillez saisir une adresse e-mail valide." devrait être affiché à côté du champ Email.

---

Cette documentation fournit une vue d'ensemble des scénarios de test couverts par le fichier de fonctionnalités, ainsi que les données de test et les résultats attendus pour chaque scénario.
