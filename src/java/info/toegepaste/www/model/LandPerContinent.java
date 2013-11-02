/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package info.toegepaste.www.model;
/**
 *
 * @author Bruno
 */
public class LandPerContinent {
    private Long landId;
    private Long continentId;

    public LandPerContinent() {
    }

    public Long getLandId() {
        return landId;
    }

    public void setLandId(Long landId) {
        this.landId = landId;
    }

    public Long getContinentId() {
        return continentId;
    }

    public void setContinentId(Long continentId) {
        this.continentId = continentId;
    }

    @Override
    public String toString() {
        return "LandPerContinent{" + "landId=" + landId + ", continentId=" + continentId + '}';
    }
    
    
}
