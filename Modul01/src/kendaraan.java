class Mobil{
    String nomorPlat;
    String warna;
    String merek;
    int kecepatan;
    
    public void setMobil(String plat, String warna, String merek, int speed){
        this.nomorPlat = plat;
        this.warna = warna;
        this.merek = merek;
        this.kecepatan = speed;
    }
    
    public void tampil(){
        System.out.println("Nomor Plat : "+nomorPlat);
        System.out.println("Warna : "+warna);
        System.out.println("Merek : "+merek);
        System.out.println("Kecepatan : "+kecepatan+" Km/h");
    }
    
        public void akselerasi(){
        System.out.println("Injak Pedal Gas");
    }
    
    public void belok(){
        System.out.println("Putar Stang Kemudi");
    }
    
    public void rem(){
        System.out.println("Injak Pedal Rem");
    }
}

public class kendaraan {
    
    public static void main(String [] args){
        
        Mobil mobilA = new Mobil();
        mobilA.setMobil("AB 3313 SY", "Biru", "Mitsubishi", 50);
        mobilA.tampil();
        mobilA.akselerasi();
        mobilA.belok();
        mobilA.rem();
        
        System.out.println();
        
        Mobil mobilB = new Mobil();
        mobilB.setMobil("AB 1234 AT","Merah","Toyota",100);
        mobilB.tampil();
        mobilB.akselerasi();
        mobilB.belok();
        mobilB.rem();
    }
    
}
