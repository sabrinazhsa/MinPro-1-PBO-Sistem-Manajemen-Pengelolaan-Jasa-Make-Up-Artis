# MinPro-1-PBO-Sistem-Manajemen-Pengelolaan-Jasa-Make-Up-Artis
Sabrina Azhmalia Nisa (NIM 2509116051)
# Deskripsi Program
Program ini memiliki tema Sistem Manajemen Pengelolaan Jasa Make Up Artis. Program ini digunakan untuk mecatat seluruh data pelanggan yang melakukan pemesanan jasa make up . Program ini memiliki 4 class, yaitu:
### 1. Kelas `JasaMakeUpArtis.java` (Main)


   Class ini berfungsi untuk menjalankan program sehingga dapat berinteraksi secara langsung dengan pengguna.
### 2. Kelas `LayananMUA.java`

   Kelas ini menyimpan data pemesanan pelanggan, seperti nama pelanggan, jenis make up yang dipesan, tanggal reservasi, total harga pesanan, dan status pesanan.
### 3. Kelas `Pelanggan.java`

   Kelas ini menyimpan informasi dari pelanggan, seperti nama, nomor _handphone_, dan alamat pelanggan.
### 4. Kelas `LayananCRUD.java`

   Kelas ini berfungsi untuk menyimpan `ArrayList` serta fungsi menambah, membaca, mengedit, dan menghapus atau biasa disebut dengan CRUD.

Program ini memiliki fitur utama CRUD, adapun rincian fitur tersebut adalah sebagai berikut:
### 1. Create atau Tambah Pemesanan.

Fitur ini berfungsi untuk mencatat data pemesanan jasa make up baru.
### 2. Read atau Lihat Daftar Pemesanan

Fitur ini berfungsi menampilkan seluruh data pemesanan yang tersimpan di sistem secara rapi dengan menggunakan perintah perulangan.
### 3. Update atau Perbarui Data

Fitur ini berfungsi mengubah informasi tertentu pada pesanan yang sudah ada, contohnya seperti status pembayaran atau penyesuaian total harga.
### 4. Delete atau Hapus Pemesanan

Fitur ini berfungsi menghapus data transaksi pemesanan dari sistem jika terjadi pembatalan pesanan.


# Penjelasan Alur Program
### 1. Tampilan Menu Utama
Pada gambar di bawah ini merupakan output ketika program dijalankan. Sistem akan menampilkan kalimat sambutan hangat kepada user, lalu memberikan beberapa pilihan untuk melihat isi program. Pilihan tersebut dapat dilihat pada gambar di bawah ini.
<img width="585" height="188" alt="image" src="https://github.com/user-attachments/assets/8885cb6b-b431-4fc8-9f16-f4d79d21f8c0" />
### 2. Proses Pilihan User
- Ketika user memasukkan angka '1' maka outputnya adalah menampilkan semua pesanan yang telah tercatat di dalam sistem. Jika sistem belum menerima catatan pemesanan maka sistem hanya akan menampilkan teks informasi bahwa pemesanan belum ada.
- Ketika user memasukkan angka '2' maka outputnya adalah program meminta data pelanggan dan data pemesanan jasa make up. Data pemesanan dan Pelanggan kemudian digunakan untuk membuat catatan informasi PemesananLayananMUA.
- Ketika user memasukkan angka '3', maka outputnya program meminta ID pesanan yang ingin diperbarui. Program kemudian meminta status pembayaran dan total harga baru. Jika data ditemukan, status dan total harga diperbarui dan jika data tidak ditemukan atau harga yang dimasukkan tidak valid, program menampilkan pesan kesalahan.
- Ketika user memasukkan angka '4', maka outputnya adalah program meminta ID pesanan yang ingin dihapus. Jika data ditemukan, pemesanan akan dihapus dan jika data tidak ditemukan, program menampilkan pesan bahwa pemesanan tidak ditemukan.
- Ketika user memasukkan angka '5', maka outputnya program menampilkan pesan bahwa program telah selesai.
### 3. Kembali ke Menu Utama
Setelah proses tambah, tampil, update, atau hapus selesai, program kembali ke menu utama. Perulangan while membuat program tetap berjalan sehingga pengguna dapat melakukan proses lainnya.

# Penerapan Nilai Tambah
### 1. Menerapkan Access Modifier
Program menggunakan access modifier seperti private pada atribut setiap class untuk membatasi akses langsung dari luar class. Contohnya pada class `Pelanggan` dan `PemesananLayananMUA`, atribut seperti namaPelanggan, alamat, noHP, idPesanan, dan totalHarga dideklarasikan menggunakan private.

<img width="367" height="137" alt="image" src="https://github.com/user-attachments/assets/18aec979-c6a2-4a16-8241-0d7a8096c70e" />  
  
  
<img width="376" height="180" alt="image" src="https://github.com/user-attachments/assets/fb12fb5e-a3ab-4f02-a1b2-463968a364d2" />


### 2. Menerapkan encapsulation
Encapsulation diterapkan dengan menyembunyikan atribut menggunakan private dan menyediakan method getter dan setter untuk mengakses atau mengubah data tersebut. Dengan demikian, data dalam objek tidak dapat diakses atau diubah secara langsung dari luar class. Contohnya, data pemesanan diakses menggunakan method seperti getidPesanan(), getjenisMakeup(), gettotalHarga(), dan getstatus(), sedangkan perubahan data dilakukan melalui setter seperti settotalHarga() dan setstatus().
<img width="598" height="307" alt="image" src="https://github.com/user-attachments/assets/7ff37b4f-0fc7-4e25-b63f-19540879f25b" />

### 3. Menerapkan validasi input
Program memiliki validasi untuk mencegah data yang tidak sesuai. Pada class LayananCRUD, program memeriksa apakah objek pemesanan tidak kosong, memastikan ID pesanan tidak duplikat, serta memastikan total harga tidak bernilai negatif saat proses update. Program juga memberikan pesan ketika data pemesanan tidak ditemukan atau pilihan menu yang dimasukkan tidak valid.
<img width="375" height="155" alt="image" src="https://github.com/user-attachments/assets/bf52a35e-0daf-46c2-94c9-e68bf1879222" />

<img width="480" height="180" alt="image" src="https://github.com/user-attachments/assets/f6e2160a-4652-479b-8ca5-54fb5dd58852" />


