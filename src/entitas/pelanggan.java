/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitas;

import source.koneksi;

/**
 *
 * @author badra
 */
public class pelanggan {
    private String id;
    private String nama;
    private String alamat;
    private String cp;
    
    koneksi kon = new koneksi();

    public pelanggan() {
    }

    public pelanggan(String id, String nama, String alamat, String cp) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.cp = cp;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getId() {
        return id;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getCp() {
        return cp;
    }
    
    public void insertPelanggan(){
        String sql = "insert into t_pelanggan values ('"+this.id+"','"+this.nama+"','"+this.alamat+"','"+this.cp+"')";
        kon.query(sql);
    } 
    
    public void updatePelanggan(){
        String sql = "update t_pelanggan set nama = '"+this.nama+"' , alamat='"+this.alamat+"', cp='"+this.cp+"' where id='"+this.id+"'";
        kon.query(sql);
    }
    public void deletePelanggan(){
        String sql = "delete t_pelanggan  where id='"+this.id+"'";
        kon.query(sql);
    }
    public boolean cekError(){
        return kon.getError();
    }
}
