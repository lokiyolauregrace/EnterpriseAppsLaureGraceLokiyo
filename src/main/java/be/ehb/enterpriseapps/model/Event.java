package be.ehb.enterpriseapps.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class Event {

    @NotBlank
    private String titel;

    @NotBlank
    private String omschrijving;

    @NotBlank
    private String organisatie;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String tijdstip;

    private Location locatie;

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public String getOrganisatie() {
        return organisatie;
    }

    public void setOrganisatie(String organisatie) {
        this.organisatie = organisatie;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTijdstip() {
        return tijdstip;
    }

    public void setTijdstip(String tijdstip) {
        this.tijdstip = tijdstip;
    }

    public Location getLocatie() {
        return locatie;
    }

    public void setLocatie(Location locatie) {
        this.locatie = locatie;
    }
}