package com.impequeibel.facturados.model; /**
 * Created with IntelliJ IDEA.
 * User: Diego Anazonian
 * Date: 4/24/14
 * Time: 1:54 PM
 * To change this template use File | Settings | File Templates.
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class LoadDriver {

    private Connection connection;

    public void getConnection(){
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "facturas";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "mysql";
        String password = "facturados";

        try {
            Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url + dbName, userName, password);
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
