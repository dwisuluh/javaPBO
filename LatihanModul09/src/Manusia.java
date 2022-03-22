
abstract class Manusia {
    protected String nama;
    protected int umur;
    protected int tinggi;
    protected String status;
    
    public String getInfo(){
        return "Manusia";
    }
}

class MahasiswaDosen extends Manusia{
    public MahasiswaDosen(String nama, int umur, int tinggi, String status){
        this.nama = nama;
        this.umur = umur;
        this.tinggi = tinggi;
        this.status = status;
    }
    public String getInfo(){
        return "Seorang bernama "+nama+" dengan umur "+umur+", tinggi"+tinggi+" dan berstatus "+status;
    }
}
