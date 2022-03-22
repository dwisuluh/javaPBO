
public class TestManusia {
    public static void cetakInfo(Manusia mns){
        System.out.println(mns.getInfo());
    }
    public static void main(String[] args){
        MahasiswaDosen mhs = new MahasiswaDosen("Dwi SP ",36,170,"Mahasiswa");
        MahasiswaDosen dosen = new MahasiswaDosen("Agung BP",45,168,"Dosen");
        cetakInfo(mhs);
        cetakInfo(dosen);
    }
}
