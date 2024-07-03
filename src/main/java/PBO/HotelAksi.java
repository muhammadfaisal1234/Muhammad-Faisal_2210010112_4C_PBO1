package PBO;

import java.util.Scanner;

public class HotelAksi {
    public static void main(String[] args) {
        //object
        //hotel tamu = new Hotel("Muhammad Faisal","101001","Aston Banua");
        
        //System.out.println(tamu.infoHotel());
        //System.out.println(tamu.infoHotel("500000"));
        
        //error handling
        try{
            //io sederhana
            Scanner scanner = new Scanner(System.in);
            
            //array
            HotelDetail[] tamu = new HotelDetail[2];
            
            //perulangan
            for(int i=0; i<tamu.length; i++){
                System.out.print("1. Masukkan Nama Tamu : ");
                String namatamu = scanner.nextLine();
                System.out.print("2. Masukkan kode Pesanana : ");
                String kode = scanner.nextLine();
                System.out.print("3. Masukkan Nama Hotel : ");
                String harga = scanner.nextLine();
                
                //objek
                tamu[i] = new HotelDetail(namatamu, kode, harga);
            }
            
            //perulangan
            for(HotelDetail data: tamu){
                System.out.println("=================");
                System.out.println("Data Tamu Hotel: ");
                System.out.println(data.infoHotel());
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
