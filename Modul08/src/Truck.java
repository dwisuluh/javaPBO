
public class Truck extends Mobil{
    protected String spesifikasi;
    
    public Truck(String spesifikasi, int kec){
        super(kec);
        this.spesifikasi = spesifikasi;
        System.out.println(spesifikasi);
    }
    
    public Truck(int kecmaks, String namaken, String spesifikasi){
        super(kecmaks, namaken);
        this.spesifikasi = spesifikasi;
    }
    
    @Override
    public void PrintInfoMobil(){
        super.PrintInfoMobil();
        System.out.println("Gandengan : "+spesifikasi);
    }
    
    public void PrintInfoTruck(){
        System.out.println("Kecepatan maksimal : "+kecmaks);
        System.out.println("Nama Kendaraan : "+namaken);
        System.out.println("Spesifikasi : "+spesifikasi);
    }
    
}
