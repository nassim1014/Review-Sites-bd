/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review.sites;
// 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author zaari
 */
public class ReviewSites {

    /**
     * @param args the command line arguments
     */
    String jdbcDriver = "com.mysql.cj.jdbc.Driver"; // spécifie le driver qu’on va utiliser.
    Connection conn = null;
    String username = "root"; // le nom de l'utilisateur
    String password = "";//mot de passe
    //le chemin qui nous permet de se connecter la base de donne nommé bd_review_sites
    String serverUrl = "jdbc:mysql://localhost:3306/bd_review_sites?zeroDateTimeBehavior=convertToNull";
    Statement stmt = null; // variable de Type Statement qui nous permet d envoyer une requête SQL à la base de données 
    String dbName = "bd_review_sites"; // nom de la base de donnée
    ResultSet rs = null;    // (L'objet ResultSet est un pointeur qui pointe vers 
                            //la ligne d'une table apres l'execution de la requete sql
                            // initialement posé dans la première ligne)
    
public void connection(){
        try {
            Class.forName(jdbcDriver);//forName permet de charger la classe jdbcDriver
            System.out.println("Driver Loaded");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Failed To Load");
            System.out.println(ex.getMessage());
        }
        try {
            //connection au serveur xampp 
            conn = DriverManager.getConnection(serverUrl, username, password);//cree une connection a la bd
            System.out.println("Connected To Server Successfully");
        } catch (SQLException ex) {
            System.out.println("Failed To Connect To Server Successfully");
            System.out.println(ex.getMessage());
 
        }
    }
/*String checkDb = "SELECT SCHEMA_NAME FROM `information_schema`.`SCHEMATA` WHERE `SCHEMA_NAME` = '" + dbName + "'";*/
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

