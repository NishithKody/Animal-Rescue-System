/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.db4O;

/**
 *
 * @author nishi
 */

import business.ecosystem.ConfigSystem;
import business.ecosystem.Business;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

public class DatabaseUtils {
    
    private static final String FILENAME = Paths.get("Database19.db4o").toAbsolutePath().toString();
    private static DatabaseUtils dB4OUtil;
    
     public synchronized static DatabaseUtils getInstance() {
        if (dB4OUtil == null) {
            dB4OUtil = new DatabaseUtils();
        }
        return dB4OUtil;
    }
    
    private ObjectContainer createConnection() {

        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), FILENAME);
        return db;
    }
    
    
    public synchronized void storeSystem(Business system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
        System.out.println("Save in dbS");
    }
    
    public Business retrieveSystem() {
        ObjectContainer conn = null;
//        try {
        conn = createConnection();

        ObjectSet systems = conn.queryByExample(Business.class); 
        Business system = null;
        if (systems.size() == 0) {
//            system = Business.getInstance();  
              system = ConfigSystem.configure();
        } else {
            system = (Business) systems.get(systems.size() - 1);
        }
        conn.close();
        System.out.println("Ret from dbS");
        return system;

    }
    
}
