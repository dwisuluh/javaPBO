interface Bangun2D{
    public double hitungLuas();
    public double hitungKeliling();
}
interface Bangun3D{
    public double hitungVolume();
    public void tampilInfo();
}
interface Pola{
    public void setWarna(String warna);
    public void getWarna();
}
class Lingkaran implements Bangun2D{
    private double jarijari;
    
    public void setJarijari(double jarijari){
        this.jarijari = jarijari;
    }
    public double getJarijari(){
        return this.jarijari;
    }
    public double hitungLuas(){
        return (3.14*this.jarijari*this.jarijari);
    }
    public double hitungKeliling(){
        return (2*3*this.jarijari);
    }
}

class Tabung extends Lingkaran implements Bangun3D, Pola{
    private double tinggi;
    private double alas = hitungLuas();
    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return this.tinggi;
    }
    public double hitungVolume(){
        return (alas*tinggi);
    }

    @Override
    public void tampilInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setWarna(String warna) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getWarna() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
class Testing{
    public static void main(String [] args){
        Lingkaran bunder = new Lingkaran();
        Tabung tab = new Tabung();
        bunder.setJarijari(10);
        tab.setTinggi(5);
        System.out.println("Volume Tabung : "+tab.hitungVolume());
    }
}


