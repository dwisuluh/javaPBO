class barang {
    private String namaBarang;
    private int    hargaBarang;
    private int    cacahBarang;
    private String keterangan;
    
    public barang(String NAMABARANG, int HARGABARANG, int CACAHBARANG, String KETERANGAN){
        namaBarang = NAMABARANG;
        cacahBarang = CACAHBARANG;
        hargaBarang = HARGABARANG;
        keterangan = KETERANGAN;
    }
    public void ubahNamaBarang(String NAMABARANG){
        namaBarang = NAMABARANG;
    }
    public void ubahHargaBarang(int HARGABARANG){
        hargaBarang = HARGABARANG;
    }
    public void ubahCacahBarang(int CACAHBARANG){
        cacahBarang = CACAHBARANG;
    }
    public void ubahKeterangan(String KETERANGAN){
        keterangan = KETERANGAN;
    }
    public String infoNamaBarang(){
        return(this.namaBarang);
    }
    public int infoHargaBarang(){
        return(this.hargaBarang);
    }
    public int infoCacahBarang(){
        return(this.cacahBarang);
    }
    public String infoKeterangan(){
        return(this.keterangan);
    }
}
public class programUtama {
    public static void main(String [] args){
        
        barang barang[] = new barang[5];
        for(int i=0;i<5;i++){
            barang[i] = new barang("Barang",0,0,"Keterangan");
        }
        
        barang[0].ubahNamaBarang("Sabun");
        barang[0].ubahHargaBarang(6000);
        barang[0].ubahCacahBarang(25);
        barang[0].ubahKeterangan("Perlengkapan Mandi");
        
        barang[1].ubahNamaBarang("Handuk");
        barang[1].ubahHargaBarang(35000);
        barang[1].ubahCacahBarang(29);
        barang[1].ubahKeterangan("Perlengkapan Mandi");
        
        barang[2].ubahNamaBarang("Sapu");
        barang[2].ubahHargaBarang(7000);
        barang[2].ubahCacahBarang(15);
        barang[2].ubahKeterangan("Kebersihan");
        
        barang[3].ubahNamaBarang("Pensil");
        barang[3].ubahHargaBarang(3500);
        barang[3].ubahCacahBarang(105);
        barang[3].ubahKeterangan("Alat Tulis");
        
        barang[4].ubahNamaBarang("Spidol");
        barang[4].ubahHargaBarang(4000);
        barang[4].ubahCacahBarang(90);
        barang[4].ubahKeterangan("Alat Tulis");
        
        System.out.println("-----------------------------------------");
        System.out.println("Barang \t Harga \t Stock \t Keterangan");
        System.out.println("-----------------------------------------");
        for(int i=0;i<5;i++){
            System.out.print(barang[i].infoNamaBarang()+"\t");
            System.out.print(barang[i].infoHargaBarang()+"\t");
            System.out.print(barang[i].infoCacahBarang()+"\t");
            System.out.print(barang[i].infoKeterangan()+"\n");
        }
        System.out.println("-----------------------------------------");
    }
}
