/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package info.toegepaste.www.model;

import java.util.Date;
/**
 *
 * @author Bruno
 */
public class Reis {
    private Long id;
    private String naam;
    private String beschrijving;
    private Date vertrekdatum;
    private Date terugkeerdatum;
    private int aantalPlaatsen;
    private Double prijsPerPersoon;
    private Long gemeenteId;
    private Long vervoerswijzeId;
    private Long vertrekplaatsId;
    private Gemeente gemeente;
    private Vervoerswijze vervoerswijze;
    private Vertrekplaats vertrekplaats;

    public Reis() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public Date getVertrekdatum() {
        return vertrekdatum;
    }

    public void setVertrekdatum(Date vertrekdatum) {
        this.vertrekdatum = vertrekdatum;
    }

    public Date getTerugkeerdatum() {
        return terugkeerdatum;
    }

    public void setTerugkeerdatum(Date terugkeerdatum) {
        this.terugkeerdatum = terugkeerdatum;
    }

    public int getAantalPlaatsen() {
        return aantalPlaatsen;
    }

    public void setAantalPlaatsen(int aantalPlaatsen) {
        this.aantalPlaatsen = aantalPlaatsen;
    }

    public Double getPrijsPerPersoon() {
        return prijsPerPersoon;
    }

    public void setPrijsPerPersoon(Double prijsPerPersoon) {
        this.prijsPerPersoon = prijsPerPersoon;
    }

    public Long getGemeenteId() {
        return gemeenteId;
    }

    public void setGemeenteId(Long gemeenteId) {
        this.gemeenteId = gemeenteId;
    }

    public Long getVervoerswijzeId() {
        return vervoerswijzeId;
    }

    public void setVervoerswijzeId(Long vervoerswijzeId) {
        this.vervoerswijzeId = vervoerswijzeId;
    }

    public Long getVertrekplaatsId() {
        return vertrekplaatsId;
    }

    public void setVertrekplaatsId(Long vertrekplaatsId) {
        this.vertrekplaatsId = vertrekplaatsId;
    }

    public Gemeente getGemeente() {
        return gemeente;
    }

    public void setGemeente(Gemeente gemeente) {
        this.gemeente = gemeente;
    }

    public Vervoerswijze getVervoerswijze() {
        return vervoerswijze;
    }

    public void setVervoerswijze(Vervoerswijze vervoerswijze) {
        this.vervoerswijze = vervoerswijze;
    }

    public Vertrekplaats getVertrekplaats() {
        return vertrekplaats;
    }

    public void setVertrekplaats(Vertrekplaats vertrekplaats) {
        this.vertrekplaats = vertrekplaats;
    }

    @Override
    public String toString() {
        return "Reis{" + "id=" + id + ", naam=" + naam + ", beschrijving=" + beschrijving + ", vertrekdatum=" + vertrekdatum + ", terugkeerdatum=" + terugkeerdatum + ", aantalPlaatsen=" + aantalPlaatsen + ", prijsPerPersoon=" + prijsPerPersoon + ", gemeenteId=" + gemeenteId + ", vervoerswijzeId=" + vervoerswijzeId + ", vertrekplaatsId=" + vertrekplaatsId + ", gemeente=" + gemeente + ", vervoerswijze=" + vervoerswijze + ", vertrekplaats=" + vertrekplaats + '}';
    }
    
    
}
