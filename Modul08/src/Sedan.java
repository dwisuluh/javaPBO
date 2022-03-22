
public class Sedan extends Mobil {
    protected String transmisi;
    
    public Sedan(String transmisi, int kec){
        super(kec);
        this.transmisi = transmisi;
        System.out.println(transmisi);
    }
    
    public Sedan(int kecmaks, String namaken, String transmisi){
        super(kecmaks, namaken);
        this.transmisi = transmisi;
    }
    
    @Override
    public void PrintInfoMobil(){
        super.PrintInfoMobil();
        System.out.println("Transmisi : "+transmisi);
    }
    
    public void PrintInfoSedan(){
        System.out.println("Kecepatan maksimal : "+kecmaks);
        System.out.println("Nama Kendaraan : "+namaken);
        System.out.println("Transmisi : "+transmisi);
    }
}
