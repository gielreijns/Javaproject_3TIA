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
public class Land {
    private Long id;
    private String naam;
    private List<Continent> continenten;
    private List<Gemeente> gemeenten;

    public Land() {
    }

    public List<Gemeente> getGemeenten() {
        return gemeenten;
    }

    public void setGemeenten(List<Gemeente> gemeenten) {
        this.gemeenten = gemeenten;
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

    public List<Continent> getContinenten() {
        return continenten;
    }

    public void setContinenten(List<Continent> continenten) {
        this.continenten = continenten;
    }

    @Override
    public String toString() {
        return "Land{" + "id=" + id + ", naam=" + naam + ", continenten=" + continenten + ", gemeenten=" + gemeenten + '}';
    }
}
