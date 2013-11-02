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
public class Vervoerswijze {
    private Long id;
    private String naam;
    private List<Reis> reizen;

    public Vervoerswijze() {
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

    public List<Reis> getReizen() {
        return reizen;
    }

    public void setReizen(List<Reis> reizen) {
        this.reizen = reizen;
    }

    @Override
    public String toString() {
        return "Vervoerswijze{" + "id=" + id + ", naam=" + naam + ", reizen=" + reizen + '}';
    }
}
