
public class TestMobil {
    public static void main(String [] args){
        System.out.println("Merupakan pemanggilan object mobil");
        Mobil avanza = new Mobil(10, "Avanza");
        avanza.PrintInfoMobil();
        System.out.println("");
        System.out.println("Merupakan pemanggilan object Truck");
        Truck truk = new Truck(7,"Tronton","Kapasitas 10 Ton");
        truk.PrintInfoMobil();
        truk.PrintInfoTruck();
    }
}
