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
public class Udara extends Kendaraan {
    private boolean mesin;
    
    public Udara(){
        
    }
    
    public Udara(String nama, int tahunProduksi,boolean mesin ){
        super(nama,tahunProduksi);
        this.mesin=mesin;
        
    }
    public boolean getMesin(){
        return mesin;
    }
    public void setMesin(boolean mesin){
        this.mesin=mesin;
    }
    public void Cetak(){
        super.Cetak();
        System.out.println("Menggunakan mesin"+(mesin? "Ya" : "Tidak"));
    }
}
