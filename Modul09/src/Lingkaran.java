
class Lingkaran extends Bentuk {
    public Lingkaran(){
        System.out.println("Kelas Lingkaran turunan kelas abstrak Bentuk");
    }
    public String getBentuk(){
        return "Bentuk Lingkaran";
    }
    public static void main (String [] args){
        Bentuk geometri = new BujurSangkar(10,10);
    }
}

