
class Mahasiswa1 {
    
    private String nama;
    private int nim;
    private String jurusan;
    
    public void setMahasiswa(String nama, int nim, String jurusan){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        System.out.println("Proses Input data telah selesai.....");
    }
    
    public void getCetak(){
        System.out.println("Nama : "+nama);
        System.out.println("Nim : "+nim);
        System.out.println("Jurusan : "+jurusan);
    }
}

class Mahasiswa2 {
    
    private String nama;
    private int nim;
    private String jurusan;
    
    public void setMahasiswa(String nama, int nim, String jurusan){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        System.out.println("Proses Input data telah selesai.....");
    }
    
    public void getCetak(){
        System.out.println("Nama : "+nama);
        System.out.println("Nim : "+nim);
        System.out.println("Jurusan : "+jurusan);
    }
}

class programUtama{
    public static void main(String [] args){
        
        Mahasiswa1 data1 = new Mahasiswa1();
          
        data1.setMahasiswa("Dwi Suluh P", 19541132, "Informatika");
        
        data1.getCetak();

    }
}
