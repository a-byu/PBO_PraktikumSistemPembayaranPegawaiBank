/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistempembayaranpegawaibank;

/**
 *
 * @author wajdie
 */
public class CustomerService extends PegawaiBank{
    //atribut
    private int ratingKepuasan;
    
    //constructor
    public CustomerService(String id, String nama, double gajiPokok, int ratingKepuasan) {
        super(id, nama, gajiPokok);
        this.ratingKepuasan = ratingKepuasan;
    }
    
    //methog hitung gaji customer service
    @Override
    public double hitungGaji() {
        return gajiPokok + (ratingKepuasan * 500000);
    }
}
