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
public class Anjing extends Hewan{
    public Anjing(String nama){
        super(nama);
    }
    public void bersuara(){
        System.out.println(nama+"berkata Guk!! Guk!");
    }
}
