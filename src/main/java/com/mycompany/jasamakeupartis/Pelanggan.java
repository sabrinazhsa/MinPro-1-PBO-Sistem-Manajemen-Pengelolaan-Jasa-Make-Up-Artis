/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jasamakeupartis;

/**
 *
 * @author HP VICTUS
 */
public class Pelanggan {

    private String namaPelanggan;
    private String alamat;
    private String noHP;

    public Pelanggan(String namaPelanggan, String alamat, String noHP) {
        this.namaPelanggan = namaPelanggan;
        this.alamat = alamat;
        this.noHP = noHP;
    }

    public String getnamaPelanggan() {
        return namaPelanggan;
    }

    public String getalamat() {
        return alamat;
    }

    public String getnoHP() {
        return noHP;
    }
}
