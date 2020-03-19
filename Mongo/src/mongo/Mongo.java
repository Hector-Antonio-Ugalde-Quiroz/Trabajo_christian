/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongo;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


import static java.util.Arrays.asList;
import java.util.LinkedList;

/**
 *
 * @author heuga
 */
public class Mongo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MongoClient mongoClient = new MongoClient();
        MongoDatabase db = mongoClient.getDatabase("NUEVA");
        
        db.getCollection("alumnos").insertOne(
        new Document()
                .append("Nombre", "")
                .append("promedio", 10.0)
                .append("carrera", "tics")
                .append("datos", 
                        new Document()
                            .append("direccion", "Tula")
                            .append("telefono", "7739878754")
                            .append("email", "saul@uttt.edu.mx")
                        )
                .append("actividades", asList("futbol","ajedrez","lectura"))
                .append("comidas", asList("sopas","ensaladas","carne"))
        );
        
        
        
        
        
    }
    
}
