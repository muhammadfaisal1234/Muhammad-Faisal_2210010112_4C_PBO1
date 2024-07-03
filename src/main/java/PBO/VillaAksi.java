package PBO;

import java.util.Scanner;

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
