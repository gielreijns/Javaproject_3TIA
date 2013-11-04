/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package info.toegepaste.www.controllers;

import info.toegepaste.www.model.Gemeente;
import info.toegepaste.www.model.Land;
import info.toegepaste.www.services.GemeenteService;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Bruno
 */
@Named
@RequestScoped
public class GemeenteController implements Serializable {
    @Inject
    private GemeenteService gemeenteService;
    
    public List<Gemeente> getAllGemeentes() {
        return gemeenteService.getAllGemeentes();
    }
    
    public List<Gemeente> getAllGemeentesByLand(Land land) {
        return gemeenteService.getAllGemeentesByLand(land);
    }
}
