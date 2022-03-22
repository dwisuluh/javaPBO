
public class PersegiPanjang {
    
    double panjang;
    double lebar;
    
    public void setSisi(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double panjang(){
        return (panjang);
    }
    
    public double lebar(){
        return (lebar);
    }
    
    public double luas(){
        double luas0;
        luas0 = panjang * lebar;
        return (luas0);
    }
    
    public double keliling(){
        double keliling0;
        keliling0 = 2 * (panjang + lebar);
        return (keliling0);
    }
    
    public void tampil(){
        System.out.println("Persegi panjang dengan ukuran");
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar : "+lebar);
        System.out.println("Mempunyai Luas dan Keliling sebagai berikut : ");
        System.out.println("Luas : "+luas());
        System.out.println("Keliling : "+keliling());
    }
}
