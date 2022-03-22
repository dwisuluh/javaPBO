
abstract class Mahasiswa {
    protected String nama;
    protected int nilai;
    
    public String getInfoRegistrsi(){
        return "Nama "+nama+" telah melakukan Registrasi";
    }
 //   int Mahasiswa.NilaiTest();
    
    public abstract int NilaiTest();
}
 class MahasiswaBaru extends Mahasiswa{
     public MahasiswaBaru(String nama, int nilai){
         this.nama = nama;
         this.nilai = nilai;
     }
     public String getInfoRegistrasi(){
         return "Nama "+nama+" telah melakukan Registrasi";
     }
     public int NilaiTest(){
         return nilai;
     }
 }

