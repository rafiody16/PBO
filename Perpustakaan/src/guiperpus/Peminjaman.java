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
import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;


public class Peminjaman {
    
    private int idpeminjaman;
    private Buku buku = new Buku();
    private Anggota anggota = new Anggota();
    private Date tanggalpinjam;
    private Date tanggalkembali;
    
     private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public int getIdpeminjaman() {
        return idpeminjaman;
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public String getTanggalpinjam() {
        return (tanggalpinjam != null) ? DATE_FORMAT.format(tanggalpinjam) : null;
    }

    public void setTanggalpinjam(String tanggalpinjam) {
        try {
            this.tanggalpinjam = DATE_FORMAT.parse(tanggalpinjam);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getTanggalkembali() {
        return (tanggalkembali != null) ? DATE_FORMAT.format(tanggalkembali) : null;
    }

    public void setTanggalkembali(String tanggalkembali) {
        try {
            this.tanggalkembali = DATE_FORMAT.parse(tanggalkembali);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Peminjaman getById(int id) {
        Peminjaman pj = new Peminjaman();
        ResultSet rs = DBHelper.selectQuery("SELECT p.idpeminjaman, a.idanggota, b.idbuku, p.tanggalpinjam, "+
                                            "p.tanggalkembali FROM peminjaman AS p INNER JOIN anggota AS a "+
                                            "ON p.idanggota = a.idanggota INNER JOIN buku AS b ON p.idbuku = b.idbuku "+
                                            "WHERE p.idpeminjaman = '"+id+"'");
        
        try{
            while(rs.next()){
                pj = new Peminjaman();
                pj.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pj.getBuku().setIdBuku(rs.getInt("idbuku"));
                pj.getAnggota().setIdanggota(rs.getInt("idanggota"));
                pj.setTanggalpinjam(rs.getString("tanggalpinjam"));
                pj.setTanggalkembali(rs.getString("tanggalkembali"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return pj;
    }
    
    public ArrayList<Peminjaman> getAll() {
        ArrayList<Peminjaman> ListPeminjaman = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT p.idpeminjaman, a.idanggota, "+
                                            "a.nama, a.alamat, a.telepon, b.idbuku, "+
                                            "b.idkategori, b.judul, b.penerbit, b.penulis, "+
                                            "p.tanggalpinjam, p.tanggalkembali FROM peminjaman AS p "+
                                            "INNER JOIN anggota AS a ON p.idanggota = a.idanggota "+
                                            "INNER JOIN buku as b ON p.idbuku = b.idbuku");
        try{
            while(rs.next()){
                Peminjaman pj = new Peminjaman();
                pj.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pj.getBuku().setIdBuku(rs.getInt("idbuku"));
                pj.getAnggota().setIdanggota(rs.getInt("idanggota"));
                pj.setTanggalpinjam(rs.getString("tanggalpinjam"));
                pj.setTanggalkembali(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(pj);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return ListPeminjaman;
    }
    
    public ArrayList<Peminjaman> search(String keyword) {
        ArrayList<Peminjaman> ListPeminjaman = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT p.idpeminjaman, a.idanggota, b.idbuku, p.tanggalpinjam, "+
                                            "p.tanggalkembali FROM peminjaman AS p INNER JOIN anggota AS a "+
                                            "ON p.idanggota = a.idanggota INNER JOIN buku AS b ON p.idbuku = b.idbuku "+
                                            "WHERE p.idpeminjaman LIKE '%"+keyword+"%' "+
                                            "OR a.idanggota LIKE '%"+keyword+"%' "+
                                            "OR b.idbuku LIKE '%"+keyword+"%' "+
                                            "OR p.tanggalpinjam LIKE '%"+keyword+"%' "+
                                            "OR p.tanggalkembali LIKE '%"+keyword+"%'");
        
        try{
            while(rs.next()){
                Peminjaman pj = new Peminjaman();
                pj.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pj.getBuku().setIdBuku(rs.getInt("idbuku"));
                pj.getAnggota().setIdanggota(rs.getInt("idanggota"));
                pj.setTanggalpinjam(rs.getString("tanggalpinjam"));
                pj.setTanggalkembali(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(pj);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return ListPeminjaman;
    }
    
    public void save() {
        String formattedTanggalPinjam = (tanggalpinjam != null) ? DATE_FORMAT.format(tanggalpinjam) : null;
        String formattedTanggalKembali = (tanggalkembali != null) ? DATE_FORMAT.format(tanggalkembali) : null;
        if(getById(idpeminjaman).getIdpeminjaman() == 0){
            String SQL = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES "
                        +"('"+this.getAnggota().getIdanggota()+"', '"+this.getBuku().getIdBuku()+
                        "', '"+formattedTanggalPinjam+"', '"+formattedTanggalKembali+"')";
            this.idpeminjaman = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE peminjaman SET "
                        +"idanggota = '"+this.getAnggota().getIdanggota()+"', idbuku = '"+this.getBuku().getIdBuku()+"', tanggalpinjam = '"
                        +formattedTanggalPinjam+"', tanggalkembali = '"+formattedTanggalKembali+"' WHERE idpeminjaman = '"+this.idpeminjaman+"'";
            this.idpeminjaman = DBHelper.insertQueryGetId(SQL);
        }
    }
    
    public void delete() {
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idpeminjaman + "'";
        DBHelper.insertQueryGetId(SQL);
    }
    
    
}
