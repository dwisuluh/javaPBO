
public class Buku {
    String judul;
    int harga;
    int halaman;
    
    Buku(String judul, int harga, int halaman){
        this.judul = judul;
        this.harga = harga;
        this.halaman = halaman;
    }
    
    public void tampil(){
        System.out.println("Judul buku : "+judul);
        System.out.println("Harga buku : "+harga);
        System.out.println("jumlah halmaan : "+halaman);
    }
    
    public static void main(String [] args){
        Buku buku1 = new Buku("PBO",75000,200);
        buku1.tampil();
        
        Buku buku2 = new Buku("Algoritma",80000,300);
        buku2.tampil();
    }
}
