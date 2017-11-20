/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jugueteria311.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Josem
 */
public class ConnectionDB {
    Connection conn;
    
    public Connection open() throws Exception{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("Server=tcp:servidorintegrador.database.windows.net,1433;Initial Catalog=IntegradorJugueteria;Persist Security Info=False;User ID=EquipoIntegrador311;Password=UDLSB311Integrador;MultipleActiveResultSets=False;Encrypt=True;TrustServerCertificate=False;Connection Timeout=30;");
            return conn;
    }
    
    public void close(){
        if(conn == null){
            return;
        }
        try{
            conn.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            conn = null;
        }
    }
}
