
public class Mahasiswa {
    private String nim, nama;
    
    //method mutator
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    //method acessor
    public String getNim(){
        return nim;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void tampil(){
        System.out.println("Nim : "+getNim());
        System.out.println("Nama : "+getNama());
    }
    
    public static void main(String [] args){
        Mahasiswa obj = new Mahasiswa();
        obj.setNim("17540001");
        obj.setNama("Azkiya");
        
        System.out.println("==Data==");
//        System.out.println("Nim : "+obj.getNim());
//        System.out.println("Nama : "+obj.getNama());
        obj.tampil();
    }
}
