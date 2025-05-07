package model;

import java.sql.*;

public class koneksi {
    public Connection koneksiDatabase() {
        try {
            // Untuk MySQL versi 8.0+
            Class.forName("com.mysql.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost/Bidang2D?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
            String user = "root";
            String password = "root0506";
            
            return DriverManager.getConnection(url, user, password);
            
        } catch (ClassNotFoundException e) {
            System.err.println("Error: Driver JDBC tidak ditemukan!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Error: Gagal koneksi ke database!");
            e.printStackTrace();
        }
        
        return null;
    }
}