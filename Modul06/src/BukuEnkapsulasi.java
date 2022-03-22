class Buku{
    private String judul;
    private int harga;
    private int halaman;
    
    public void setBuku(String judul, int harga, int halaman){
        this.judul = judul;
        this.harga = harga;
        this.halaman = halaman;
    }
    
    public void tampil(){
        System.out.println("Judul buku : "+this.judul);
        System.out.println("Harga buku : "+this.harga);
        System.out.println("jumlah halmaan : "+this.halaman);
    }
    
}
public class BukuEnkapsulasi {
    public static void main(String [] args){
        Buku buku1 = new Buku();
        buku1.setBuku("PBO",75000,200);
        buku1.tampil();
    }
}
