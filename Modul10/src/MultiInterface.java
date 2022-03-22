interface Interface1{
    public void tampilInfo();
    public void setInfo(String info);
}
interface Interface2{
    public void cetakInfo();
}
public class MultiInterface implements Interface1, Interface2 {
    private String info;
    
    public void setInfo(String info){
        this.info = info;
    }
    public void tampilInfo(){
        System.out.println(this.info+" : ini info dari method tampilInfo");
    }
    public void cetakInfo(){
        System.out.println(this.info+" : ini info dari method cetakInfo");
    }
    public static void main(String [] a){
        MultiInterface t = new MultiInterface();
        t.setInfo("Hai");
        t.tampilInfo();
    }
}
