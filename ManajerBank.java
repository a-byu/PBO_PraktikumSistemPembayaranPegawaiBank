/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistempembayaranpegawaibank;

/**
 *
 * @author wajdie
 */
public class ManajerBank extends PegawaiBank{
    //atribut
    private boolean targetTercapai;
    
    //constructor
    public ManajerBank(String id, String nama, double gajiPokok, boolean targetTercapai) {
        super(id, nama, gajiPokok);
        this.targetTercapai = targetTercapai;
    }
    
    //method hitung gaji manajer
    @Override
    public double hitungGaji() {
        if (targetTercapai){
            return gajiPokok + (gajiPokok * 0.2);
        } else {
            return gajiPokok;
        }
    }
}
