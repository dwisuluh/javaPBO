
class Nasabah {
    private String nama;
    private int rekening;
    private double saldo;
    
    Nasabah(String nama, int rekening){
        this.nama = nama;
        this.rekening = rekening;
        this.saldo = 0;
    }
    
    Nasabah(String nama, int rekening, double saldo){
        this.nama = nama;
        this. rekening = rekening;
        this.saldo = saldo;
    }
    public void setor(double setor){
        this.saldo = this.saldo + setor;
    }
    public void tarik(double tarik){
        if(this.saldo < tarik){
            System.out.println("Saldo Anda tidak mencukupi");           
        }else{
            this.saldo = this.saldo - tarik;
        }
    }
    public void transfer(Nasabah tujuan, double nominal){
        if(nominal < this.saldo){
            tujuan.setor(nominal);
            tarik(nominal);
            System.out.println("Tranfer Berhasil ke-"+tujuan.nama+" Sebesar "+nominal);
        }else{
            System.out.println("Jumlah Transfer Lebih besar dari saldo anda");
        }
    }
    public void lihatSaldo(){
        System.out.println("Nama : "+this.nama);
        System.out.println("Rekening : "+this.rekening);
        System.out.println("Saldo : "+this.saldo);
        System.out.println();
    }
}

class ProgramUtama{
    public static void main(String [] args){
        Nasabah N1 = new Nasabah("Amir",1111,150000);
        N1.lihatSaldo();
        N1.setor(10000);
        N1.tarik(20000);
        N1.lihatSaldo();
       
        Nasabah N2 = new Nasabah("Budi",2222);
        N2.lihatSaldo();
        N1.transfer(N2, 5000);
        N2.lihatSaldo();
        N1.lihatSaldo();
    }

}
