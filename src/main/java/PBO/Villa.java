package PBO;

//class
public class Villa {
     //atribut dan encapsulation
    private String namatamu;
    private String kode;
    private String namavilla;
    
    //Constructor
    public Villa(String namamu, String kode, String namavilla) {
        this.namatamu = namatamu;
        this.kode = kode;
        this.namavilla = namavilla;
    }
    
    //mutator (setter)
    public void setNamatamu(String namatamu) {
        this.namatamu = namatamu;
    }
    
    public void setKodepesanan(String kode) {
        this.kode = kode;
    }
    
    public void setNamahotel(String namavilla) {
        this.namavilla = namavilla;
    }
    
    
    //accsessor (getter)
    public String getNamatamu() {
        return namatamu;
    }
    
    public String getKodepesanan() {
        return kode;
    }
    
    public String getNamavilla() {
        return namavilla;
    }
    
    public String infoVilla(){
        return "Nama Tamu: "+getNamatamu()+
               "\nKode Pesanan: "+getKodepesanan()+
               "\nNama Hotel: "+getNamavilla();
    }
    
    //polymorphism (overloading)
    public String infoVilla(String harga){
        return infoVilla() + "\nHarga : "+harga;
    }

  }
