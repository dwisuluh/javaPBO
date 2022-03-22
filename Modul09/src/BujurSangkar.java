
class BujurSangkar extends Bentuk{
    public BujurSangkar(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public String getBentuk(){
        return "Bentuk Bujur Sangkar";
    }
    
    public int HitungLuas(){
        return panjang*lebar;
    }
}
