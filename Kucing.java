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
public class Kucing extends Hewan{
    
    public Kucing(String nama){
        super(nama);
    }
    @Override
    public void bersuara(){
        super.bersuara();//mengakses method super class
        System.out.println(nama+"berkata Meong!!!");
    }
}
