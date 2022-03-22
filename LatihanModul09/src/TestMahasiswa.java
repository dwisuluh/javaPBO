
public class TestMahasiswa {
    public static void cetakInfoMahasiswa(Mahasiswa mhs){
        System.out.println(mhs.getInfoRegistrsi()+" dengan nilai test: "+mhs.NilaiTest());
    }
    
    public static void main(String [] args){
        MahasiswaBaru mhs1 = new MahasiswaBaru("Dwi SP",86);
        mhs1.getInfoRegistrasi();
        mhs1.NilaiTest();
        cetakInfoMahasiswa(mhs1);
    }
}
