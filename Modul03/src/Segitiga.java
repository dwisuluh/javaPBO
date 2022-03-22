/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sakha-Sabiya
 */
public class Segitiga {
    private int alas, tinggi;
    
    public void setAlas(int alas){
        this.alas = alas;
    }
    
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    
    void luas(){
        System.out.println("Luas Segitiga dengan");
        System.out.println("Alas : "+alas);
        System.out.println("Tinggi : "+tinggi);
        System.out.println("Adalah : ");
        System.out.println(alas*tinggi/2);
    }
    
    public static void main(String [] args){
        
        Segitiga obj = new Segitiga();
        
        obj.setAlas(8);
        obj.setTinggi(12);
        
        obj.luas();
    }
}
