
public class SepedaMotor {
    private String merk;
    private String tipe;
    private String warna;
    private int cc;
    private int tahun;
    
    public String getMerk(){
        return merk;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public String getTipe(){
        return tipe;
    }
    public void setTipe(String tipe){
        this.tipe = tipe;
    }
    public String getWarna(){
        return warna;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }
    public int getKapasitas(){
        return cc;
    }
    public void setKapasitas(int cc){
        this.cc = cc;
    }
    public int getTahun(){
        return tahun;
    }
    public void setWarna(int tahun){
        this.tahun = tahun;
    }
    public void cetakSepedaMotor(){
        System.out.println("");
        System.out.println("Sepeda Motor");
        System.out.println("Merek : "+this.merk);
        System.out.println("Tipe : "+this.tipe);
        System.out.println("Warna : "+this.warna);
        System.out.println("Kapasitas : "+this.cc+" cc");
        System.out.println("Tahun : "+this.tahun);
    }
}
