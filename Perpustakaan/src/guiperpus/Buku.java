/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiperpus;

/**
 *
 * @author Broody
 */
import java.util.ArrayList;
import java.sql.*;

public class Buku {
    
    private int idBuku;
    private Kategori kategori = new Kategori();
    private String judul;
    private String penerbit;
    private String penulis;

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getPenulis() {
        return penulis;
    }
    
    public Buku(){
        
    }
    
    public Buku(Kategori kategori, String judul, String penerbit, String penulis){
        this.kategori = kategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }
    
    public Buku getById(int id) {
        Buku bk = new Buku();
        ResultSet rs = DBHelper.selectQuery("SELECT b.idbuku, b.judul, b.penerbit, b.penulis, "+
                                            "k.idkategori, k.nama, k.keterangan FROM buku AS b LEFT JOIN "+
                                            "kategori AS k ON b.idkategori = k.idkategori WHERE b.idbuku = "+
                                            "'"+id+"'");  
        try{
            while(rs.next()){
                bk = new Buku();
                bk.setIdBuku(rs.getInt("idbuku"));
                bk.getKategori().setIdKategori(rs.getInt("idkategori"));
                bk.getKategori().setNama(rs.getString("nama"));
                bk.getKategori().setKeterangan(rs.getString("keterangan"));
                bk.setJudul(rs.getString("judul"));
                bk.setPenerbit(rs.getString("penerbit"));
                bk.setPenulis(rs.getString("penulis"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return bk;
    }
    
    public ArrayList<Buku> getAll() {
        ArrayList<Buku> ListBuku = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT b.idbuku, b.judul, b.penerbit, b.penulis, "+
                                            "k.idkategori, k.nama, k.keterangan FROM buku AS b LEFT JOIN "+
                                            "kategori AS k ON b.idkategori = k.idkategori ");
        try{
            while(rs.next()){
                Buku bk = new Buku();
                bk.setIdBuku(rs.getInt("idbuku"));
                bk.getKategori().setIdKategori(rs.getInt("idkategori"));
                bk.getKategori().setNama(rs.getString("nama"));
                bk.getKategori().setKeterangan(rs.getString("keterangan"));
                bk.setJudul(rs.getString("judul"));
                bk.setPenerbit(rs.getString("penerbit"));
                bk.setPenulis(rs.getString("penulis"));
                
                ListBuku.add(bk);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public ArrayList<Buku> search(String keyword) {
        ArrayList<Buku> ListBuku = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT b.idbuku, b.judul, b.penerbit, b.penulis, "+
                                            "k.idkategori, k.nama, k.keterangan FROM buku AS b LEFT JOIN "+
                                            "kategori AS k ON b.idkategori = k.idkategori "+
                                            "WHERE b.idbuku LIKE '%"+keyword+"%' "+
                                            "   OR b.judul LIKE '%"+keyword+"%' "+
                                            "   OR k.nama LIKE '%"+keyword+"%' "+
                                            "   OR b.penerbit LIKE '%"+keyword+"%' "+
                                            "   OR b.penulis  LIKE '%"+keyword+"%' ");    
        try{
            while(rs.next()){
                Buku bk = new Buku();
                bk.setIdBuku(rs.getInt("idbuku"));
                bk.getKategori().setIdKategori(rs.getInt("idkategori"));
                bk.getKategori().setNama(rs.getString("nama"));
                bk.getKategori().setKeterangan(rs.getString("keterangan"));
                bk.setJudul(rs.getString("judul"));
                bk.setPenerbit(rs.getString("penerbit"));
                bk.setPenulis(rs.getString("penulis"));
                
                ListBuku.add(bk);;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public void save() {
        if(getById(idBuku).getIdBuku() == 0){
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES"
                        +"('"+this.judul+"', '"+this.getKategori().getIdKategori()+"', '"
                        +this.penulis+"', '"+this.penerbit+"') ";
            this.idBuku = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE buku SET "
                        +" judul = '"+this.judul+"', "
                        +" idkategori = '"+this.getKategori().getIdKategori()+"', "
                        +" penulis = '"+this.penulis+"', "
                        +" penerbit = '"+this.penerbit+"' "
                        +" WHERE idbuku = '"+this.idBuku+"'";
            this.idBuku = DBHelper.insertQueryGetId(SQL);
        }
    }
    
    public void delete() {
        String SQL = "DELETE FROM buku WHERE idbuku = '"+this.idBuku+"'";
        DBHelper.insertQueryGetId(SQL);
    }
    
}
