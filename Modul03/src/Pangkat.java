/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sakha-Sabiya
 */
class Pangkat {
    private double bil, pangkat;
    
    public void setBilangan(double bil){
        this.bil = bil;
    }
    
    public void setPangkat(double pangkat){
        this.pangkat = pangkat;
    }
    
    public double hitungPangkat(){
        double hasil;
        hasil = Math.pow(bil, pangkat);
        return hasil;
    }
    
    public static void main(String [] args){
        
        Pangkat obj = new Pangkat();
        obj.setBilangan(15.0);
        obj.setPangkat(3.0);
        
        System.out.println("Hasil dari 15 pangkat 3 adalah "+obj.hitungPangkat());
    }
}
