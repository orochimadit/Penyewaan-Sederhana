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
public class peminjaman {
    private String id_pegawai;
    private String id_pelanggan;
    private String id_peminjaman;
    private String id_mobil;
    private String tgl_pinjam;
    private String tgl_kembali;
    private String status;
    private int lama;
    private double  denda;
    private double total;
    private int telat;
    private double biaya;
    koneksi kon = new koneksi();

    public peminjaman() {
    }
    
    public peminjaman(String id_pegawai, String id_pelanggan, String id_peminjaman, String id_mobil, String tgl_pinjam, String tgl_kembali, String status, int lama, double denda, double total, int telat, double biaya) {
        this.id_pegawai = id_pegawai;
        this.id_pelanggan = id_pelanggan;
        this.id_peminjaman = id_peminjaman;
        this.id_mobil = id_mobil;
        this.tgl_pinjam = tgl_pinjam;
        this.tgl_kembali = tgl_kembali;
        this.status = status;
        this.lama = lama;
        this.denda = denda;
        this.total = total;
        this.telat = telat;
        this.biaya = biaya;
    }
    
    public void setId_pegawai(String id_pegawai) {
        this.id_pegawai = id_pegawai;
    }

    public void setId_pelanggan(String id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }

    public void setId_mobil(String id_mobil) {
        this.id_mobil = id_mobil;
    }

    public void setId_peminjaman(String id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }

    public void setTgl_pinjam(String tgl_pinjam) {
        this.tgl_pinjam = tgl_pinjam;
    }

    public void setTgl_kembali(String tgl_kembali) {
        this.tgl_kembali = tgl_kembali;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLama(int lama) {
        this.lama = lama;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }

    public void setTelat(int telat) {
        this.telat = telat;
    }
    
    
    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }

    public String getId_pegawai() {
        return id_pegawai;
    }

    public String getId_pelanggan() {
        return id_pelanggan;
    }

    public String getId_mobil() {
        return id_mobil;
    }

    public String getId_peminjaman() {
        return id_peminjaman;
    }

    public String getTgl_pinjam() {
        return tgl_pinjam;
    }

    public String getTgl_kembali() {
        return tgl_kembali;
    }

    public String getStatus() {
        return status;
    }

    public int getLama() {
        return lama;
    }

    public double getDenda() {
        return denda;
    }

    public double getTotal() {
        return total;
    }

    public int getTelat() {
        return telat;
    }

    public double getBiaya() {
        return biaya;
    }
    
    public void insertData(){
        String data = "insert into t_peminjaman values ('"+this.id_pegawai+"','"+this.id_peminjaman+"','"+this.id_pelanggan+"','"+
                this.id_mobil+"','"+this.tgl_pinjam+"','"+this.tgl_kembali+"','"+this.lama+"','0','"+this.biaya+"','0','0','"+this.status+"')";
        kon.query(data);
    }
    public void updateData(){
        String data = "update t_peminjaman set telat = '"+this.telat+"', denda='"+this.denda+"' ,total = "
                + "'"+this.total+"', status= '"+this.status+"' where id_pinjam  = '"+this.id_peminjaman+"' ";
        kon.query(data);
    }
   
}
