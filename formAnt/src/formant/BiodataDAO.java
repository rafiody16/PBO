/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formant;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
/**
 *
 * @author Broody
 */
public class BiodataDAO {
    private final Connection conn;
    private final String curr_time; 
    
    public BiodataDAO() {
        conn = ClassKoneksi.getConnection();
        
        LocalDateTime currentDateTime = LocalDateTime.now(); // Mendapatkan waktu saat ini
        // Konversi LocalDateTime ke Timestamp
        Timestamp timestamp = Timestamp.valueOf(currentDateTime);
        
        this.curr_time = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(timestamp); 
    } 
    
    public String insert(Biodata bd) throws SQLException{
        
        try (conn) {
            String sql = "INSERT INTO [biodataDB].[dbo].[tbl_bio]\n" +
                        "           ([nama_lengkap]\n" +
                        "           ,[jenis_kelamin]\n" +
                        "           ,[agama]\n" +
                        "           ,[hobi]\n" +
                        "           ,[email]\n" +
                        "           ,[no_telp]\n" +
                        "           ,[alamat]\n" +
                        "           ,[created_date])\n" +
                        "     VALUES\n" +
                        "           ('"+bd.getNama_lengkap()+"'\n" +
                        "           ,'"+bd.getJenis_kelamin()+"'\n" +
                        "           ,'"+bd.getAgama()+"'\n" +
                        "           ,'"+bd.getHobi()+"'\n" +
                        "           ,'"+bd.getEmail()+"'\n" +
                        "           ,'"+bd.getNo_telp()+"'\n" +
                        "           ,'"+bd.getAlamat()+"'\n" +
                        "           ,'"+this.curr_time+"')"; 
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            System.out.println(sql);
            
            // Eksekusi query
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                return "Data "+bd.getNama_lengkap()+" berhasil ditambahkan!";
            }else{
                return "Data "+bd.getNama_lengkap()+" gagal ditambahkan!";
            }
        }

    }
     
    public List<ArrayList> readBiodata() throws SQLException {
        String sql = "SELECT * FROM [biodataDB].[dbo].[tbl_bio]";
        List<ArrayList> list = new ArrayList<>(); 
        
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                ArrayList bio = new ArrayList();
                
                bio.add(rs.getInt("id_biodata")); //0
                bio.add(rs.getString("nama_lengkap")); //1
                bio.add(rs.getString("jenis_kelamin"));//2
                bio.add(rs.getString("agama"));//3
                bio.add(rs.getString("hobi"));//4
                bio.add(rs.getString("email"));//5
                bio.add(rs.getString("no_telp")); //6
                bio.add(rs.getString("alamat")); //7
                bio.add(rs.getString("created_date"));//8 
                bio.add(rs.getString("updated_date")); //9
                
                list.add( bio);
            }
        }
        return list;
    }

    public String updateBiodata(Biodata bd) throws SQLException {
        
        try(conn){
            String sql = "UPDATE [biodataDB].[dbo].[tbl_bio]\n" +
                            "   SET [nama_lengkap] = '"+bd.getNama_lengkap()+"'\n" +
                            "      ,[jenis_kelamin] = '"+bd.getJenis_kelamin()+"'\n" +
                            "      ,[agama] = '"+bd.getAgama()+"'\n" +
                            "      ,[hobi] = '"+bd.getHobi()+"'\n" +
                            "      ,[email] = '"+bd.getEmail()+"'\n" +
                            "      ,[no_telp] = '"+bd.getNo_telp()+"'\n" +
                            "      ,[alamat] = '"+bd.getAlamat()+"'\n" + 
                            "      ,[updated_date] = '"+this.curr_time+"'\n" +
                            " WHERE [id_biodata] = "+bd.getId_biodata();
            
             
            PreparedStatement stmt = conn.prepareStatement(sql); 
             
            // Eksekusi query
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                return "Data "+bd.getNama_lengkap()+" berhasil diubah!";
            }else{
                return "Data "+bd.getNama_lengkap()+" gagal diubah!";
            }
            
        } 
    }

    public String deleteBiodata(int id) throws SQLException {
        try(conn){
            String sql = "DELETE FROM [biodataDB].[dbo].[tbl_bio]\n" +
                            " WHERE [id_biodata] = "+id;
            
             
            PreparedStatement stmt = conn.prepareStatement(sql); 
             
            // Eksekusi query
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                return "Data berhasil dihapus!";
            }else{
                return "Data gagal diubah!";
            }
            
        } 
    }
    
}
