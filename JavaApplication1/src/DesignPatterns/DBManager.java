/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesignPatterns;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author ASUS
 */
public class DBManager {
    private static volatile DBManager dbManager = new DBManager();
    private static volatile Connection connection;
    private DBManager(){
        if(dbManager != null ){
            throw new RuntimeException("please use getDBManager Method");
        }
    }
    
    public static DBManager getDbManager(){
        if (dbManager == null){
            synchronized (DBManager.class){
             if (connection == null){
             //    String url = "";
           //              connection = DriverManager.getConnection(url);
                 dbManager = new DBManager();
             }
        }
            dbManager = new DBManager();
            
        }
    return dbManager;
    
}
    public Connection getConnection(){
        if (connection == null){
            synchronized (DBManager.class){
             if (connection == null){
                 dbManager = new DBManager();
             }
        }
            dbManager = new DBManager();
            
        }
        return connection;
    }
}
