
class Segitiga extends Bentuk{
    
    public Segitiga(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public String getBentuk(){
        return "Bentuk segitiga";
    }
    
    public int HitungLuas(){
        return (panjang*lebar)/2;
    }
}
