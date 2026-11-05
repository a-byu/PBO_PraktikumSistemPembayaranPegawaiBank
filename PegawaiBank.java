/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistempembayaranpegawaibank;

/**
 *
 * @author wajdie
 */
public class PegawaiBank {
    //atribut
    protected String id;
    protected String nama;
    protected double gajiPokok;
    
    //constructor
    public PegawaiBank(String id, String nama, double gajiPokok) {
        this.id = id;
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }
    
    //method untuk return gaji default
    public double hitungGaji() {
        return gajiPokok;
    }
    
    //method untuk mencetak slip gaji
    public void cetakslipGaji() {
        System.out.println("ID   : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("Gaji : Rp " + hitungGaji());
        System.out.println("----------------------------");
    }
    
    //getter tipe (class) objek
    public String getTipePegawaiBank() {
        return this.getClass().getSimpleName();
    }
}
