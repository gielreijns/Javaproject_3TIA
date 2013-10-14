/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package info.toegepaste.www.model;

import java.util.List;
/**
 *
 * @author Bruno
 */
public class Gebruiker {
    private Long id;
    private String voornaam;
    private String naam;
    private String telefoon;
    private String email;
    private String wachtwoord;
    private String straat;
    private String nummer;
    private Long gemeenteId;
    private Gemeente gemeente;
    private List<Reis> reizen;

    public Gebruiker() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getTelefoon() {
        return telefoon;
    }

    public void setTelefoon(String telefoon) {
        this.telefoon = telefoon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    public Long getGemeenteId() {
        return gemeenteId;
    }

    public void setGemeenteId(Long gemeenteId) {
        this.gemeenteId = gemeenteId;
    }

    public Gemeente getGemeente() {
        return gemeente;
    }

    public void setGemeente(Gemeente gemeente) {
        this.gemeente = gemeente;
    }

    public List<Reis> getReizen() {
        return reizen;
    }

    public void setReizen(List<Reis> reizen) {
        this.reizen = reizen;
    }

    @Override
    public String toString() {
        return "Gebruiker{" + "id=" + id + ", voornaam=" + voornaam + ", naam=" + naam + ", telefoon=" + telefoon + ", email=" + email + ", wachtwoord=" + wachtwoord + ", straat=" + straat + ", nummer=" + nummer + ", gemeenteId=" + gemeenteId + ", gemeente=" + gemeente + ", reizen=" + reizen + '}';
    }
    
}
