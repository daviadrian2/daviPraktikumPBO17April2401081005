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
public class Pesawat extends Udara {
    private int muatan;
    
public Pesawat(){
}
public Pesawat(String nama, int tahunProduksi, boolean mesin, int muatan){
        super(nama,tahunProduksi,mesin);
        this.muatan=muatan;
}

    Pesawat(String nama, int tahunProduksi, boolean mesin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   public int getMuatan(){
        return 0;
       
}
public void setMuatan(int muatan){
    this.muatan=muatan;
}
public void reset(String nama, int tahunPorduksi,boolean mesin,int muatan){
    setNama(nama);
    setTahunProduksi(tahunProduksi);
    setMesin(mesin);
    setMuatan(muatan);
    
}

public String kategori(int muatan){
    if(muatan<=50)
        return "Bobot kecil";
    else if(muatan<=100)
        return "Bobot menengah";
    else
        return "Bobot besar";
}
@Override
public void Cetak(){
    super.Cetak();
    System.out.println("Muatan pesawat"+muatan+"orang penumpang");
    System.out.println("Kategori ="+kategori(muatan));
}

    private void setTahunProduksi(String tahunProduksi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
