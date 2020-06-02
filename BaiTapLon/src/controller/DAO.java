/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author quang
 */
public class DAO {

    public Connection conn;
    private final String DB_URL = "jdbc:derby://localhost:1527/BTL";
    private final String USER_NAME = "admins";
    private final String PASSWORD = "123";
    public DAO()
    {
        try {
            conn = (Connection) DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
