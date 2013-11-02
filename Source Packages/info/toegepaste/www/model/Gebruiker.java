/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package info.toegepaste.www.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

    

    public List<Reis> getReizen() {
        return reizen;
    }

    public void setReizen(List<Reis> reizen) {
        this.reizen = reizen;
    }
    public void add() {
        
        
            PreparedStatement ps = null;
            Connection con = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project_2013", "root", "mysql");
                String sql = "INSERT INTO java_project_2013.gebruiker(voornaam) VALUES(?)";
                ps = con.prepareStatement(sql);
                ps.setString(1, voornaam);
                
                ps.executeUpdate();
                
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                try {
                    con.close();
                    ps.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
    }
//    public void add() {
//
//
//            PreparedStatement ps = null;
//            Connection con = null;
//            try {
//                Class.forName("com.mysql.jdbc.Driver");
//                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project_2013", "root", "mysql");
//                String sql = "INSERT INTO gebruiker(voornaam, naam, telefoon, email, wachtwoord, straat, nummer, gemeenteId) VALUES(?,?,?,?,?,?,?,?)";
//                ps = con.prepareStatement(sql);
//                ps.setString(1, voornaam);
//                ps.setString(2, naam);
//                ps.setString(3, telefoon);
//                ps.setString(4, email);
//                ps.setString(5, wachtwoord);
//                ps.setString(6, straat);
//                ps.setString(7, nummer);
//                ps.setLong(8, gemeenteId);
//                ps.executeUpdate();
//
//            } catch (Exception e) {
//                System.out.println(e);
//            } finally {
//                try {
//                    con.close();
//                    ps.close();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//    }

@Override
        public String toString() {
        return "Gebruiker{" + "id=" + id + ", voornaam=" + voornaam + ", naam=" + naam + ", telefoon=" + telefoon + ", email=" + email + ", wachtwoord=" + wachtwoord + ", straat=" + straat + ", nummer=" + nummer + ", gemeenteId=" + gemeenteId + ", reizen=" + reizen + '}';
    }
    
}
