/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistempembayaranpegawaibank;

/**
 *
 * @author wajdie
 */
public class Teller extends PegawaiBank{
    //atribut
    private int jumlahTransaksi;
    
    //constructor
    public Teller(String id, String nama, double gajiPokok, int jumlahTransaksi) {
        super(id, nama, gajiPokok);
        this.jumlahTransaksi = jumlahTransaksi;
    }
    
    //method hitung gaji teller
    @Override
    public double hitungGaji() {
        return gajiPokok + (jumlahTransaksi * 5000);
    }
}
