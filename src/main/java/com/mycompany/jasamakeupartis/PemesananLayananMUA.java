/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jasamakeupartis;

/**
 *
 * @author HP VICTUS
 */
public class PemesananLayananMUA {

    private String idPesanan;
    private String tanggalPesanan;
    private String jenisMakeup;
    private double totalHarga;
    private String status;
    private Pelanggan pelanggan;

    public PemesananLayananMUA(String idPesanan, String tanggalPesanan,
            String jenisMakeup, double totalHarga, String status,
            Pelanggan pelanggan) {

        this.idPesanan = idPesanan;
        this.tanggalPesanan = tanggalPesanan;
        this.jenisMakeup = jenisMakeup;
        this.totalHarga = totalHarga;
        this.status = status;
        this.pelanggan = pelanggan;
    }

    public String getidPesanan() {
        return idPesanan;
    }

    public String gettanggalPesanan() {
        return tanggalPesanan;
    }

    public String getjenisMakeup() {
        return jenisMakeup;
    }

    public double gettotalHarga() {
        return totalHarga;
    }

    public String getstatus() {
        return status;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setjenisMakeup(String jenisMakeup) {
        this.jenisMakeup = jenisMakeup;
    }

    public void settotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public void setstatus(String status) {
        this.status = status;
    }
}