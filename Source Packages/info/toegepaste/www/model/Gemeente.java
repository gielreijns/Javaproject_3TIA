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
public class Gemeente {
    private Long id;
    private String naam;
    private int postcode;
    private Long landId;
    private Land land;
    private List<Gebruiker> gebruikers;
    private List<Reis> reizen;

    public Gemeente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Reis> getReizen() {
        return reizen;
    }

    public void setReizen(List<Reis> reizen) {
        this.reizen = reizen;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public Long getLandId() {
        return landId;
    }

    public void setLandId(Long landId) {
        this.landId = landId;
    }

    public Land getLand() {
        return land;
    }

    public void setLand(Land land) {
        this.land = land;
    }

    public List<Gebruiker> getGebruikers() {
        return gebruikers;
    }

    public void setGebruikers(List<Gebruiker> gebruikers) {
        this.gebruikers = gebruikers;
    }

    @Override
    public String toString() {
        return "Gemeente{" + "id=" + id + ", naam=" + naam + ", postcode=" + postcode + ", landId=" + landId + ", land=" + land + ", gebruikers=" + gebruikers + ", reizen=" + reizen + '}';
    }
    
}
