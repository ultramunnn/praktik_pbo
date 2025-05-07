package model;

import java.sql.*;
import model.koneksi;
public class PersegiPanjang {
    private int panjang, lebar;
    private String query;
    private ResultSet rs;
    private ResultSet rs_c;
    private Statement stmt_c;
    private Statement stmt;
    private int jumlahBaris;
    
   
    public int TambahDataPersegiPanjang (int p, int l, String pilihJenis, int H) 
    throws SQLException{
        int id = 0;
        koneksi kon = new koneksi();
        Connection connect = kon.koneksiDatabase();
        
        if(connect == null){
            throw new SQLException("Koneksi Database Gagal!!");
        }
        
        try{
            stmt = connect.createStatement();
            query = "INSERT INTO `persegi_panjang`"
                    +"(`panjang`, `lebar`,`jenis`,`hasil`)"
                    +" values ('"+ p +"','"+ l +"','" +pilihJenis+"','"+H+"')";
            stmt.executeUpdate(query);
            stmt_c = connect.createStatement();
            rs_c = stmt_c.executeQuery("SELECT `id_persegi_panjang` FROM `persegi_panjang`"
                    + "ORDER BY `id_persegi_panjang` DESC LIMIT 1");
            
            while (rs_c.next()){
                id = rs_c.getInt(1);
                
            }
            
            stmt.close();
            stmt_c.close();
            connect.close();
            
            
        }catch(SQLException ex){
            System.err.println("Error : " + ex.getMessage());
        }
        
        return id;
        
    }
    
    public String [][] getAllDataPersegiPanjang() throws Exception{

        koneksi kon = new koneksi();
        Connection connect = kon.koneksiDatabase();
        String data [][] = null;
        
        if(connect == null){
            throw new SQLException("Koneksi Database Gagal!!");
        }
        
        try{
            stmt = connect.createStatement();
            
            //ambil data
            query = "SELECT `id_persegi_panjang`, `panjang`,`lebar`,`jenis`,`hasil`"
                    + "FROM `persegi_panjang` "
                    + "ORDER BY `id_persegi_panjang`";
            rs = stmt.executeQuery(query);
            
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            String[][] tmpData = new String[1000][jmlKolom];
            tmpData = new String[1000][jmlKolom];
            int r = 0;
            
            while(rs.next()){
                for(int c = 0; c < jmlKolom; c++){
                    tmpData[r][c] = rs.getString(c+1);
                }
                r++;
                
            }
            
           // Buat array dengan ukuran yang tepat
            data = new String[r][jmlKolom];
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < jmlKolom; j++) {
                data[i][j] = tmpData[i][j];
            }
            
            stmt.close();
            connect.close();
                
        }
            
            
        }catch(SQLException ex){
            System.err.println("Error : " + ex.getMessage());
        
        }
        
        return data;
        
        
    }
    
    public void UpdateDataPersersegiPanjang(int id, int p, int l, String pilihJenis, int H){
        koneksi kon = new koneksi();
        Connection connect = kon.koneksiDatabase();
        
        try{
            stmt = connect.createStatement();
            query = "UPDATE persegi_panjang SET panjang='" + p + "', "
                    + "lebar='" + l + "', jenis='" + pilihJenis + "', hasil='" + H + "' "
                    + "WHERE id_persegi_panjang='" + id + "'";
            stmt.executeUpdate(query);
            
            stmt.close();
            connect.close();
            
        }catch(SQLException ex){
            
            System.err.println("Error : " + ex.getMessage());
            
        }
        
    }
    
    public void HapusPersegiPanjang(int id){
        koneksi kon = new koneksi();
        Connection connect = kon.koneksiDatabase();
        
        try{
            stmt = connect.createStatement();
            query="DELETE FROM `persegi_panjang` WHERE `id_persegi_panjang` = '"+id+"'";
            stmt.executeUpdate(query);
            
            stmt.close();
            connect.close();
            
        }catch(SQLException ex){
            System.err.println("Error : " + ex.getMessage());
        }
    }
    
    
    public String [][] CariDataPersegiPanjang (String katakunci){
        koneksi kon = new koneksi();
        Connection connect = kon.koneksiDatabase();
        String data [][] = null;
        
        try{
            stmt = connect.createStatement();
             query = "SELECT `id_persegi_panjang`, `panjang`, `lebar`, `jenis`, `hasil` "
                     + "FROM `persegi_panjang` WHERE "
                     + "(panjang LIKE '%" + katakunci + "%' OR lebar LIKE '%" + katakunci + "%' "
                     + "OR jenis LIKE '%" + katakunci + "%' OR hasil LIKE '%" + katakunci + "%') "
                     + "ORDER BY id_persegi_panjang";
            rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            data = new String[1000][jmlKolom];
            int r = 0;
            
            while(rs.next()){
                for(int c = 0; c<jmlKolom; c++){
                    data[r][c] =rs.getString(c+1);
                }
                r++;
            }
            
            int jmlBaris = r;
            String [][] tmparray = data;
            data = new String[jmlBaris][jmlKolom];
            
            for(r=0; r<jmlBaris; r++){
                for(int c = 0; c<jmlKolom; c++){
                    data[r][c] =tmparray[r][c];
                }
            }
            
            stmt.close();
            connect.close();
            
        }catch(SQLException ex){
            System.err.println("Error : " + ex.getMessage());
            
        }
        
        return data;
    }
    
    
    
    public void setPersegiPanjang(int p, int l){
        this.panjang = p;
        this.lebar = l;
    }
    
    public int getLuas(){
        int Luas = this.panjang * this.lebar;
        return Luas;
    }
    
    public int getKeliling(){
        int Keliling = 2*(this.panjang +this.lebar);
        return Keliling;
    }
}
