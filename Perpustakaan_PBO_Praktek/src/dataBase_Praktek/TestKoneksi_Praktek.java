package dataBase_Praktek;

import java.sql.*;

public class TestKoneksi_Praktek {
    
    public static void main(String[] args) {
        DataHandler datahandler = new  DataHandler();
        datahandler.getDBConnection();
        datahandler.close();
    }
}
