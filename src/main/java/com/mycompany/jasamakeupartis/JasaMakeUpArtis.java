/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jasamakeupartis;

import java.util.Scanner;
/**
 *
 * @author HP VICTUS
 */

public class JasaMakeUpArtis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LayananCRUD crud = new LayananCRUD();
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n==============================================================");
            System.out.println("   SELAMAT DATANG DI JASA MAKE UP ARTIS BY GRANDE 100% HALAL.");
            System.out.println("==============================================================");
            System.out.println("1. Lihat Semua Pemesanan");
            System.out.println("2. Tambah Pemesanan");
            System.out.println("3. Update Pemesanan");
            System.out.println("4. Hapus Pemesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    crud.tampilkanSemuaPemesanan();
                    break;

                case "2":
                    System.out.print("Nama Pelanggan: ");
                    String namaPelanggan = scanner.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = scanner.nextLine();
                    System.out.print("No. HP: ");
                    String noHP = scanner.nextLine();  
                    Pelanggan pelangganBaru = new Pelanggan(namaPelanggan, alamat, noHP);
                    System.out.print("Masukkan ID Pesanan: ");
                    String idPesanan = scanner.nextLine();
                    System.out.print("Masukkan Tanggal Pesanan (dd/mm/yyyy): ");
                    String tgl = scanner.nextLine();
                    System.out.print("Masukkan Jenis Makeup: ");
                    String jenis = scanner.nextLine();

                    System.out.print("Masukkan Total Harga: ");
                    double harga = scanner.nextDouble();
                    scanner.nextLine(); 

                    System.out.print("Masukkan Status Pembayaran: ");
                    String status = scanner.nextLine();

               
                    PemesananLayananMUA pesananBaru = new PemesananLayananMUA(idPesanan, tgl, jenis, harga, status, pelangganBaru);
                    crud.tambahPemesanan(pesananBaru);
                    break;

                case "3":
                    System.out.print("Masukkan ID Pesanan yang diupdate: ");
                    String idUp = scanner.nextLine();
                    System.out.print("Masukkan Status Baru: ");
                    String statusUp = scanner.nextLine();

                    System.out.print("Masukkan Total Harga Baru: ");
                    double hargaUp = scanner.nextDouble();
                    scanner.nextLine(); 

                    crud.updatePemesanan(idUp, statusUp, hargaUp);
                    break;

                case "4":
                    System.out.print("Masukkan ID Pesanan yang dihapus: ");
                    String idHapus = scanner.nextLine();
                    crud.hapusPemesanan(idHapus);
                    break;

                case "5":
                    berjalan = false;
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        scanner.close();
    }
}