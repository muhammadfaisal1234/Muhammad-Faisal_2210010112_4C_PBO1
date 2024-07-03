# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Villa`, `VillaDetail`, dan `VillaAksi` adalah contoh dari class.

```bash
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

public class VillaDetail extends Villa {
    //overriding
    public VillaDetail(String namatamu, String kode, String namavilla) {
        super(namatamu, kode, namavilla);
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
    @Override
 public String infoVilla(){
     return super.infoVilla()+
             "\nLantai Kamar: "+getLantaiKamar()+
             "\nNomor Kamar: "+getNomorkamar()+
             "\nKelas Villa: "+getKelas();
 }
}
public class VillaAksi {
    public static void main(String[] args) {
        //object
        //hotel tamu = new Hotel("Muhammad Faisal","101001","Villa Resort Bali");
        
        //System.out.println(tamu.infoVilla());
        //System.out.println(tamu.infoVilla("500000"));
        
        //error handling
        try{
            //io sederhana
            Scanner scanner = new Scanner(System.in);
            
            //array
            VillaDetail[] tamu = new VillaDetail[2];
            
            //perulangan
            for(int i=0; i<tamu.length; i++){
                System.out.print("1. Masukkan Nama Tamu : ");
                String namatamu = scanner.nextLine();
                System.out.print("2. Masukkan kode Pesanan : ");
                String kode = scanner.nextLine();
                System.out.print("3. Masukkan Nama Villa : ");
                String harga = scanner.nextLine();
                
                //objek
                tamu[i] = new VillaDetail(namatamu, kode, harga);
            }
            
            //perulangan
            for(VillaDetail data: tamu){
                System.out.println("=================");
                System.out.println("Data Tamu Villa: ");
                System.out.println(data.infoVilla());
            }
        } catch (NumberFormatException e){
            System.out.println("Kesalahan format Nomor:"+e.getMessage());
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format Kode Pesanan: "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum: "+e.getMessage());
        }
    }
}


```

2. **Object** adalah instance dari class. Pada kode ini, `tamu[i] = new VillaDetail(namatamu, kode, harga);` adalah contoh pembuatan object.

```bash
tamu[i] = new VillaDetail(namatamu, kode, harga);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namatamu`, `kode` dan `namavilla` adalah contoh atribut.

```bash
private String namatamu;
private String kode;
private String namavilla;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Villa` dan `VillaDetail`.

```bash
public Villa(String namamu, String kode, String namavilla) {
        this.namatamu = namatamu;
        this.kode = kode;
        this.namavilla = namavilla;
    }

public VillaDetail(String namatamu, String kode, String namavilla) {
        super(namatamu, kode, namavilla);
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamatamu`, `setKodepesanan` dan `setNamahotel` adalah contoh method mutator.

```bash
public void setNamatamu(String namatamu) {
        this.namatamu = namatamu;
    }
    
    public void setKodepesanan(String kode) {
        this.kode = kode;
    }
    
    public void setNamahotel(String namavilla) {
        this.namavilla = namavilla;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamatamu`, `getKodepesanan`, dan `getNamavilla` adalah contoh method accessor.

```bash
public String getNamatamu() {
        return namatamu;
    }
    
    public String getKodepesanan() {
        return kode;
    }
    
    public String getNamavilla() {
        return namavilla;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namatamu`, `kode` dan `namavilla` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namatamu;
private String kode;
private String namavilla;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `VillaDetail` mewarisi `Villa` dengan sintaks `extends`.

```bash
public class VillaDetail extends Villa {
    public VillaDetail(String namatamu, String kode, String namavilla) {
        super(namatamu, kode, namavilla);
    }
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Villa` merupakan overloading method `displayInfo` dan `displayInfo` di `VillaDetail` merupakan override dari method `displayInfo` di `Villa`.

```bash
 public String infoVilla(String harga){
        return infoVilla() + "\nHarga : "+harga;
    }
   @Override
 public String infoVilla(){
     return super.infoVilla()+
             "\nLantai Kamar: "+getLantaiKamar()+
             "\nNomor Kamar: "+getNomorkamar()+
             "\nKelas Villa: "+getKelas();
 }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getLantaikamar` dan seleksi `switch` dalam method `getNomorkamar`dan`GetKelas`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
 for(int i=0; i<tamu.length; i++){
                System.out.print("1. Masukkan Nama Tamu : ");
                String namatamu = scanner.nextLine();
                System.out.print("2. Masukkan kode Pesanan : ");
                String kode = scanner.nextLine();
                System.out.print("3. Masukkan Nama Villa : ");
                String harga = scanner.nextLine();
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
 System.out.print("1. Masukkan Nama Tamu : ");
 String namatamu = scanner.nextLine();
 System.out.print("2. Masukkan kode Pesanan : ");
 String kode = scanner.nextLine();
 System.out.print("3. Masukkan Nama Villa : ");
 String harga = scanner.nextLine();

 System.out.println("=================");
 System.out.println("Data Tamu Villa: ");
 System.out.println(data.infoVilla());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `VillaDetail[] tamu = new VillaDetail[2];` adalah contoh penggunaan array.

```bash
VillaDetail[] tamu = new VillaDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
} catch (NumberFormatException e){
    System.out.println("Kesalahan format Nomor:"+e.getMessage());
} catch (StringIndexOutOfBoundsException e){
    System.out.println("Kesalahan Format Kode Pesanan: "+e.getMessage());
} catch (Exception e) {
    System.out.println("Kesalahan umum: "+e.getMessage());
   }
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Faisal
NPM: 2110010112
