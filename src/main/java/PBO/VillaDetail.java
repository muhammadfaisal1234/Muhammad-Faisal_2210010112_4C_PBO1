package PBO;


//inheritance
public class VillaDetail extends Villa {
    //overriding
    public VillaDetail(String namamu, String kode, String namavilla) {
        super(namamu, kode, namavilla);
    }
    
   public String getLantaiKamar(){
     String kodeLantai = getKodepesanan().substring(0, 1);
     //seleksi if
     if(kodeLantai.equals("1")){
         return "Lantai 1";
     } else if (kodeLantai.equals("2")){
        return "Lantai 2";
     } else if (kodeLantai.equals("3")){
        return "Lantai 3";
     } else if (kodeLantai.equals("4")){
        return "Lantai 4"; 
     } else if (kodeLantai.equals("5")){
        return "Lantai 5";
     } else{
         return "Lantai tidak ada";
     }
  }
 
 public String getNomorkamar(){
     String kodeKamar = getKodepesanan().substring(1, 3);
        //seleksi switch
        return switch (kodeKamar) {
            case "01" -> "01";
            case "02" -> "02";
            case "03" -> "03";
            case "04" -> "04";
            case "05" -> "05";
            case "06" -> "06";
            case "07" -> "07";
            case "08" -> "08";
            default -> "Kamar Tidak Tersedia";
        };
 }
 
 public String getKelas(){
     String kodeKelas = getKodepesanan().substring(3, 6);
        return switch (kodeKelas) {
            case "001" -> "Standar";
            case "002" -> "Deluxe";
            case "003" -> "Superior";
            case "004" -> "Eksekutif";
            case "005" -> "Suite";
            case "006" -> "President";
            default -> "Fasilitas Tidak Tersedia";
        };
    }
 
    //polymorphism (overriding)
 public String infoVilla(){
     return super.infoVilla()+
             "\nLantai Kamar: "+getLantaiKamar()+
             "\nNomor Kamar: "+getNomorkamar()+
             "\nKelas Villa: "+getKelas();
 }
}
