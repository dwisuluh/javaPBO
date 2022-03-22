class Buku{
    String judul;
    int harga;
    int halaman;
    
    public void setBuku(String judul, int harga, int halaman){
        this.judul = judul;
        this.harga = harga;
        this.halaman = halaman;
    }
    
    public void tampil(){
        System.out.println("Judul buku : "+judul);
        System.out.println("Harga buku : "+harga);
        System.out.println("jumlah halmaan : "+halaman);
    }
}

class Pegawai{
    String nama;
    String alamat;
    int umur;
    
    public void setPegawai(String nama, String alamat, int umur){
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }
    
    public void tampil(){
        System.out.println("Nama Pegawai : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("Usia : "+umur);
    }
}
public class praktik01 {
    
    public static void main(String [] args){
//        Buku buku1 = new Buku();
//        buku1.setBuku("PBO",75000,200);
//        buku1.tampil();
//        
//        Buku buku2 = new Buku();
//        buku2.setBuku("Algoritma",80000,300);
//        buku2.tampil();
//        
//        Buku buku3 = new Buku();
//        buku3.setBuku("Struktur Data",95000,450);
//        buku3.tampil();
        
        Pegawai pegawai1 = new Pegawai();
        pegawai1.setPegawai("DwiSP","Yogyakarta",35);
        pegawai1.tampil();
        
        Pegawai pegawai2 = new Pegawai();
        pegawai2.setPegawai("Sakha","Yogyakarta",45);
        pegawai2.tampil();
    }
    
}
