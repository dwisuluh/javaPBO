class Handphone{
    String brand;
    String OS;
    String tipeLayar;
    double ukuranLayar;
    int baterai;
    String noTelp;
    
    public void setHandphone(String brand,String os, String tipeLayar, double sizeLayar, int baterai){
        this.brand = brand;
        this.OS = os;
        this.tipeLayar = tipeLayar;
        this.ukuranLayar = sizeLayar;
        this.baterai = baterai;
    }
    
    public void tampil(){
        System.out.println("Merek HP : "+brand);
        System.out.println("Operating System HP : "+OS);
        System.out.println("Type Layar : "+tipeLayar);
        System.out.println("Ukuran Layar : "+ukuranLayar+" inch");
        System.out.println("Ukuran Baterai : "+baterai+" mAh");
    }
    public void telp(String noTelp){
        this.noTelp = noTelp;
        System.out.println("anda menelpon Nomer: "+noTelp);
    }
}


public class Smartphone {
    
    public static void main(String [] args){
        
        Handphone hp1 = new Handphone();
        hp1.setHandphone("Iphone X","OS 14.5","OLED",6,3000);
        hp1.tampil();
        hp1.telp("08122827755");
        
        System.out.println();
        
        Handphone hp2 = new Handphone();
        hp2.setHandphone("Samsung S21","Android 11","OLED",6.5,4500);
        hp2.tampil();
        hp2.telp("08122827755");
    }
    
}
