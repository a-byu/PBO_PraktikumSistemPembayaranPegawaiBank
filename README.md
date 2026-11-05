# Sistem Pembayaran Pegawai Bank 🏦

Proyek Java sederhana ini dibuat untuk memenuhi tugas praktikum Pemrograman Berorientasi Objek (PBO). Program ini mensimulasikan sistem penggajian pegawai di sebuah bank dengan menerapkan konsep-konsep PBO seperti Pewarisan (*Inheritance*), Polimorfisme (*Polymorphism*), *Method Overriding*, dan penggunaan operator `instanceof`.

## 📌 Fitur & Konsep PBO yang Digunakan
* **Inheritance (Pewarisan):** Kelas `PegawaiBank` bertindak sebagai *superclass* yang mewariskan atribut dan metode dasar ke kelas-kelas anak (*subclass*).
* **Polimorfisme:** Menggunakan satu `ArrayList<PegawaiBank>` untuk menampung berbagai objek turunan (`ManajerBank`, `Teller`, `CustomerService`) secara bersamaan.
* **Method Overriding:** Setiap *subclass* memodifikasi logika metode `hitungGaji()` sesuai dengan aturan bonus masing-masing jabatan.
* **Runtime Type Identification (`instanceof`):** Digunakan untuk mendeteksi tipe objek saat program berjalan guna menghitung jumlah pegawai di setiap *role*.

---

## 🏗️ Struktur Kelas
1. **`PegawaiBank.java`** *(Superclass)*: Menampung atribut dasar (`id`, `nama`, `gajiPokok`) serta metode standar pencetakan slip gaji.
2. **`ManajerBank.java`** *(Subclass)*: Menghitung gaji manajer berdasarkan pencapaian target (`targetTercapai` dengan bonus tunjangan 20%).
3. **`Teller.java`** *(Subclass)*: Menghitung gaji teller berdasarkan gaji pokok ditambah insentif transaksi (`jumlahTransaksi * 5000`).
4. **`CustomerService.java`** *(Subclass)*: Menghitung gaji *Customer Service* berdasarkan rating kepuasan (`ratingKepuasan * 500000`).
5. **`MainPembayaranPegawaiBank.java`** *(Main Class)*: Titik eksekusi program untuk menjalankan simulasi, menampilkan slip gaji, rekap jumlah pegawai, dan total pengeluaran perusahaan.

---

## 💡 Lesson Learned (Pelajaran yang Dipetik)
Melalui pengerjaan proyek ini, beberapa poin penting terkait Pemrograman Berorientasi Objek (PBO) yang berhasil dipelajari meliputi:
* **Efisiensi Struktur Data dengan Polimorfisme:** Penggunaan `ArrayList` berbasis *superclass* (`PegawaiBank`) terbukti sangat mempermudah pengelolaan banyak objek berbeda jenis ke dalam satu struktur list tunggal tanpa harus membuat *array* terpisah untuk setiap jabatan.
* **Fleksibilitas *Method Overriding*:** Memahami bagaimana kelas anak (*subclass*) dapat memodifikasi perilaku metode dari kelas induk (`hitungGaji()`) secara spesifik sesuai aturan bisnis masing-masing peran, sekaligus memastikan pemanggilan metode tetap konsisten.
* **Pentingnya Pengecekan Tipe Data (`instanceof`):** Mengetahui cara aman mengenali bentuk instansiasi objek saat program berjalan (*runtime*) guna mengelompokkan data atau melakukan *casting* dengan tepat tanpa risiko *error*.
