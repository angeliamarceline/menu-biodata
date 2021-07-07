package src.test;
import java.util.Scanner;
import java.util.Calendar;
 
public class Biodata {
    public static void main(String[] args) throws Exception {
        String nama;
        int tahun_lahir;
        int tahun_sekarang;
        int umur;
 
        // inisialisasi input
        Scanner input = new Scanner(System.in);
 
        // inisialsisasi kalendar
        Calendar kalender = Calendar.getInstance();
 
        // tampung ke variabel
        tahun_sekarang = kalender.get(Calendar.YEAR);
 
        // membuat menu sederhana
 
        System.out.print("Masukan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukan Tahun Lahir: ");
        tahun_lahir = input.nextInt();
 
        // rumus
        umur = tahun_sekarang - tahun_lahir;
         
        // cetak hasil
        System.out.println("Nama Kamu: " + nama);
        System.out.println("Umur Kamu adalah " + umur + " Tahun");
 
 
    }
}