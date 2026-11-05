/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistempembayaranpegawaibank;

/**
 *
 * @author wajdie
 */
import java.util.ArrayList;

public class MainPembayaranPegawaiBank {
    public static void main(String[] args) {
        //pembuatan objek
        ManajerBank m1 = new ManajerBank("M001", "Budi Rahman", 80000000, true);
        ManajerBank m2 = new ManajerBank("M002", "Adelia Rahman", 80000000, false);
        Teller t1 = new Teller("T001", "Tania Kamil", 3000000, 30);
        Teller t2 = new Teller("T002", "Hana Maria", 3000000, 38);
        Teller t3 = new Teller("T003", "Billy Hasan", 3000000, 24);
        CustomerService c1 = new CustomerService("C001", "Abdul Karim", 6000000, 5);
        CustomerService c2 = new CustomerService("C002", "Karen Sutisno", 6000000, 4);
        
        //pembuatan array dan input objek ke array
        ArrayList<PegawaiBank> daftarPegawaiBank = new ArrayList<>();
        daftarPegawaiBank.add(m1);
        daftarPegawaiBank.add(m2);
        daftarPegawaiBank.add(t1);
        daftarPegawaiBank.add(t2);
        daftarPegawaiBank.add(t3);
        daftarPegawaiBank.add(c1);
        daftarPegawaiBank.add(c2);
        
        System.out.println("========= SLIP GAJI BULAN INI =========");
        //loop untuk mencetak slip gaji
        for (PegawaiBank p : daftarPegawaiBank) {
            System.out.println("Role    : " + p.getTipePegawaiBank());
            p.cetakslipGaji();
        }
        
        //penetapan variabel untuk default jumlah pegawai
        int manajer = 0;
        int teller = 0;
        int cs = 0;
        
        //loop untuk menjumlah pegawai di stiap role
        for (PegawaiBank p : daftarPegawaiBank) {
            if (p instanceof ManajerBank) {
                manajer += 1;
            } else if (p instanceof Teller) {
                teller += 1;
            } else if (p instanceof CustomerService) {
                cs += 1;
            }
        }
        
        //pencetakan jumlah pegawai
        System.out.println("========= JUMLAH PEGAWAI =========");
        System.out.println("Manajer         : " + manajer);
        System.out.println("Teller          : " + teller);
        System.out.println("Customer Service: " + cs);
        
        //menghitung dan menampilkan total pengeluaran
        double totalPengeluaran = 0;
        for (PegawaiBank p : daftarPegawaiBank) {
            totalPengeluaran += p.hitungGaji();
        }
        System.out.println("\nTotal Pengeluaran Perusahaan: Rp " + totalPengeluaran);
        
    }
}
