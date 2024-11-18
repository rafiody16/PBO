/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formant;

/**
 *
 * @author Broody
 */
public class Biodata {
    
    private int id_biodata;
    private String nama_lengkap;
    private String jenis_kelamin;
    private String agama;
    private String hobi;
    private String email;
    private String no_telp;
    private String alamat;
    
    public void setId_biodata (int id_biodata) {
        this.id_biodata = id_biodata;
    }
    
    public int getId_biodata () {
        return id_biodata;
    }
    
    public void setNama_lengkap (String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }
    
    public String getNama_lengkap () {
        return nama_lengkap;
    }
    
    public void setJenis_kelamin (String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }
    
    public String getJenis_kelamin () {
        return jenis_kelamin;
    }
    
    public void setAgama(String agama){
        this.agama = agama;
    }
    
    public String getAgama () {
        return agama;
    }
    
    public void setHobi (String hobi){
        this.hobi = hobi;
    }
    
    public String getHobi () {
        return hobi;
    }
    
    public void setEmail (String email) {
        this.email = email;
    }
    
    public String getEmail () {
        return email;
    }
    
    public void setNo_telp (String no_telp) {
        this.no_telp = no_telp;
    }
    
    public String getNo_telp () {
        return no_telp;
    }
    
    public void setAlamat (String alamat) {
        this.alamat = alamat;
    }
    
    public String getAlamat () {
        return alamat;
    }
    
    
}
