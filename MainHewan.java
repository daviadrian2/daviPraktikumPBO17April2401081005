/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davi17aprilinheritancepbo;

/**
 *
 * @author LENOVO
 */
public class MainHewan {
    public static void main(String[] args){
        Hewan hewanku=new Hewan("Makhluk hidup");
        Kucing kucingku=new Kucing("Bobby");
        Anjing anjingku=new Anjing("Helly");
        //mengakses super class
        System.out.println("Tampilkan akses super class Hewan");
        hewanku.tampilkanNama();
        hewanku.bersuara();
        
        //mengakses sub class kucing
        System.out.println("Tampilkan akses sub class Kucng");
        kucingku.tampilkanNama();
        kucingku.bersuara();
        
        //mengakses sub class anjing
        System.out.println("\nTampilkan akses club Anjing");
        anjingku.tampilkanNama();
        anjingku.bersuara();
        
    }
}
