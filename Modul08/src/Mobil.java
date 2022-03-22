
public class Mobil {
    protected int kecmaks;
    protected String namaken;
    
    public Mobil(){
        System.out.println("Konstruktor mobil");
    }
    
    public Mobil(int kecmaks){
        this.kecmaks = kecmaks;
    }
    
    Mobil(int kecmaks, String namaken){
        this.kecmaks = kecmaks;
        this.namaken = namaken;
    }
    
    public void PrintInfoMobil(){
        System.out.println("Kecepatan maksimal :"+kecmaks);
        System.out.println("Nama Kendaraan : "+namaken);
    }
}
