/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package info.toegepaste.www.model;
/**
 *
 * @author Bruno
 */
public class ReizenPerGebruiker {
    private Long gebruikerId;
    private Long reisId;
    private int aantalPersonen;

    public ReizenPerGebruiker() {
    }

    public Long getGebruikerId() {
        return gebruikerId;
    }

    public void setGebruikerId(Long gebruikerId) {
        this.gebruikerId = gebruikerId;
    }

    public Long getReisId() {
        return reisId;
    }

    public void setReisId(Long reisId) {
        this.reisId = reisId;
    }

    public int getAantalPersonen() {
        return aantalPersonen;
    }

    public void setAantalPersonen(int aantalPersonen) {
        this.aantalPersonen = aantalPersonen;
    }

    @Override
    public String toString() {
        return "ReizenPerGebruiker{" + "gebruikerId=" + gebruikerId + ", reisId=" + reisId + ", aantalPersonen=" + aantalPersonen + '}';
    }
    
    
}
