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
public class Continent {
   private Long id;
   private String naam;
   private List<Land> landen;

    public Continent() {
    }

    public List<Land> getLanden() {
        return landen;
    }

    public void setLanden(List<Land> landen) {
        this.landen = landen;
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

    @Override
    public String toString() {
        return "Continent{" + "id=" + id + ", naam=" + naam + '}';
    }
}
