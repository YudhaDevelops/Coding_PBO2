/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.SQLException;

/**
 *
 * @author ASPIRE 5
 */
public class MainHendler {
    
    public static void main(String[] args) throws SQLException {
        DataHandler datahandler = new DataHandler();
        datahandler.getDBConnection();
        datahandler.close();
    }
    
}
