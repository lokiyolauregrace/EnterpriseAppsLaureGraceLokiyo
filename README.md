# Enterprise Apps Laure Grace Lokiyo

## Projectbeschrijving

Dit project werd ontwikkeld voor het vak Enterprise Applications.

De opdracht bestond uit het ontwikkelen van een werkend prototype van een nieuwe website voor een Anderlechtse NGO die zich inzet voor gemeenschapsvorming en hulp aan mensen die het minder breed hebben.

De applicatie werd ontwikkeld met Java en Spring Boot volgens het MVC-patroon.

---

## Functionaliteiten

### Homepagina

De homepagina toont een overzicht van de laatste evenementen.

Per evenement worden weergegeven:

* Titel
* Organisatie
* Link naar detailpagina

Onder de tabel bevindt zich een knop om een nieuw evenement toe te voegen.

---

### Nieuw evenement

Via het formulier kan een gebruiker een nieuw evenement toevoegen.

Per evenement worden volgende gegevens opgeslagen:

* Titel
* Omschrijving
* Organisatie
* E-mailadres contactpersoon
* Tijdstip
* Locatie

    * Naam
    * Adres
    * Capaciteit

Validatie werd toegevoegd zodat:

* Alle velden verplicht zijn
* Het e-mailadres geldig moet zijn

Wanneer het formulier correct werd ingevuld, wordt het evenement toegevoegd en wordt de gebruiker teruggestuurd naar de homepagina.

---

### Detailspagina

Via de knop "Bekijk" kan een detailpagina geopend worden.

Deze pagina toont:

* Titel
* Omschrijving
* Organisatie
* Contactpersoon
* Tijdstip
* Locatiegegevens

---

### About

De About-pagina bevat:

* Adres van de NGO
* Contactgegevens
* Beschrijving van de organisatie

---

### Contact

Via het contactformulier kan een bezoeker:

* Naam invullen
* E-mailadres invullen
* Bericht versturen

De berichten worden verwerkt via Mailtrap.

---

## Gebruikte technologieën

* Java 21
* Spring Boot 3.5.3
* Spring MVC
* Thymeleaf
* Spring Validation
* Spring Mail
* Gradle
* HTML
* CSS
* Mailtrap

---

## Projectstructuur

```text
src
├── controller
│   └── HomeController
│
├── model
│   ├── Event
│   ├── Location
│   └── ContactMessage
│
├── service
│   └── MailService
│
└── resources
    ├── templates
    │   ├── index.html
    │   ├── new.html
    │   ├── details.html
    │   ├── about.html
    │   └── contact.html
    │
    └── static
        └── style.css
```

---

## Gebruikte documentatie

### Spring Boot

https://spring.io/projects/spring-boot

### Thymeleaf

https://www.thymeleaf.org/

### Spring Validation

https://docs.spring.io/spring-framework/reference/core/validation/

### Mailtrap

https://mailtrap.io/

---

## AI-gebruik

Tijdens de ontwikkeling van dit project werd gebruik gemaakt van ChatGPT voor:

* uitleg over Spring Boot
* hulp bij Thymeleaf
* validatie van formulieren
* Mailtrap configuratie
* debugging van fouten
* opstellen van de README

Alle code werd nagekeken, getest en geïntegreerd in het project.

---

## Installatiehandleiding

1. Clone de repository

```bash
git clone <repository-url>
```

2. Open het project in IntelliJ IDEA

3. Laat Gradle dependencies downloaden

4. Start de applicatie via:

```text
EnterpriseAppsLaureGraceLokiyoApplication
```

5. Open de browser

```text
http://localhost:8081
```

---

## Auteur

Laure Grace Lokiyo

Enterprise Applications

Erasmushogeschool Brussel
