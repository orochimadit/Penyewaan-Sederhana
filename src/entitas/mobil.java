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
public class mobil {
private String id_mobil;
private String no_polisi;
private String merek_mobil;
private Double harga_sewa;
private int stok;
    koneksi kon = new koneksi();

    public mobil() {
    }

    public mobil(String id_mobil, String no_polisi, String merek_mobil, Double harga_sewa, int stok) {
        this.id_mobil = id_mobil;
        this.no_polisi = no_polisi;
        this.merek_mobil = merek_mobil;
        this.harga_sewa = harga_sewa;
        this.stok = stok;
    }

    

    public void setId_mobil(String id_mobil) {
        this.id_mobil = id_mobil;
    }


    public void setNo_polisi(String no_polisi) {
        this.no_polisi = no_polisi;
    }

    public void setMerek_mobil(String merek_mobil) {
        this.merek_mobil = merek_mobil;
    }

    public void setHarga_sewa(Double harga_sewa) {
        this.harga_sewa = harga_sewa;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    

 

    public String getId_mobil() {
        return id_mobil;
    }

    public String getNo_polisi() {
        return no_polisi;
    }

    public String getMerek_mobil() {
        return merek_mobil;
    }

    public Double getHarga_sewa() {
        return harga_sewa;
    }

    public int getStok() {
        return stok;
    }

    
    public void insertMobil(){
        String sql = "insert into t_mobil values ('"+this.id_mobil+"','"+this.no_polisi+"','"+this.merek_mobil+"','"+this.harga_sewa+"','"+this.stok+"')";
        kon.query(sql);
    }
    public void updateMobil(){
        String sql = "update t_mobil set no_polisi = '"+this.no_polisi+"' , merek_mobil='"+this.merek_mobil+"', harga_sewa='"+this.harga_sewa+"',stok='"+this.stok+"' where id_mobil='"+this.id_mobil+"'";
        kon.query(sql);
    }
    public void deleteMobil(){
         String sql = "delete t_mobil  where id='"+this.id_mobil+"'";
        kon.query(sql);
    }
    public void updateStokPinjam(){
        String sql = "update t_mobil set stok = stok-1 where id_mobil = '"+this.id_mobil+"'";
        kon.query(sql);
    }
    public void updateStokKembali(){
        String sql = "update t_mobil set stok = stok+1 where id_mobil = '"+this.id_mobil+"'";
        kon.query(sql);
    }    
}
