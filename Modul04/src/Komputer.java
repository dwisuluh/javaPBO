
public class Komputer {
    String MainBoard;
    String Processor;
    int Ram;
    int HDD;
    
    Komputer(String MainBoard, String processor, int ram, int hdd){
        this.MainBoard = MainBoard;
        this.Processor = processor;
        this.Ram = ram;
        this.HDD = hdd;
    }
    
    void tampilkan(){
        System.out.println("Spesifikasi Komputer");
        System.out.println("Main Board  : "+MainBoard);
        System.out.println("Processor   : "+Processor);
        System.out.println("Ram         : "+Ram+" Giga Byte");
        System.out.println("Storage     : "+HDD+" Giga Byte");
    }
    
    void nyalakan(){
        System.out.println("Komputer dinyalakan");
    }
    
    void matikan(){
        System.out.println("Komputer dimatikan");
    }
    
    public static void main(String [] args){
        
        Komputer kompie = new Komputer("Asus","Intel",16,1000);
        kompie.tampilkan();
        kompie.nyalakan();
        kompie.matikan();
    }
}
