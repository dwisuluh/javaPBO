
public class Pegawai {
    String NamaPegawai;
    int IdPegawai;
    String PosisiPegawai;
    
    Pegawai(String nama, int Id, String posisi){
        NamaPegawai = nama;
        IdPegawai = Id;
        PosisiPegawai = posisi;
    }
    
    Pegawai(){
        NamaPegawai = "Azkiya";
        IdPegawai = 2514;
        PosisiPegawai = "Staf Pengajar";
    }
    
    void show(){
        System.out.println("Informasi Pegawai");
        System.out.println("Nama    : "+NamaPegawai);
        System.out.println("Id      : "+IdPegawai);
        System.out.println("Posisi  : "+PosisiPegawai);
    }
    
    public static void main(String [] args){
        Pegawai pegawai1 = new Pegawai();
        Pegawai pegawai2 = new Pegawai("Zahwa", 3313, "Staf Akademik");
        
        pegawai1.show();
        pegawai2.show();
    }
}
