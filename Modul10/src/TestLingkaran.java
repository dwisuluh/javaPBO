interface Bangun2D{
    public double hitungLuas();
    public double hitungKeliling();
}

class Lingkaran implements Bangun2D{
    private double jejari;
    
    public void setJejari(double jejari){
        this.jejari = jejari;
    }
    public double getJejari(){
        return this.jejari;
    }
    public double hitungLuas(){
        return (3.14 * this.jejari * this.jejari);
    }
    public double hitungKeliling(){
        return (2*3.14*this.jejari);
    }
}
public class TestLingkaran {
    public static void main(String [] args){
        Lingkaran bunder = new Lingkaran();
        bunder.setJejari(10);
        double luas = bunder.hitungLuas();
        double keliling = bunder.hitungKeliling();
        System.out.println("Luas Lingkaran dengan jejari "+bunder.getJejari()+" adalah "+luas);
        System.out.println("Keliling Lingkaran dengan jejari "+bunder.getJejari()+" adalah "+keliling);

    }
    
}
