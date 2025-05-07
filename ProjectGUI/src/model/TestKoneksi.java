/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Connection;
import model.koneksi;
public class TestKoneksi {
    public static void main(String[] args) {
        Connection conn = new koneksi().koneksiDatabase();
        if (conn != null) {
            System.out.println("Koneksi BERHASIL");
            try { conn.close(); } catch (Exception e) {}
        } else {
            System.out.println("Koneksi GAGAL");
        }
    }
}