package melvin;

import java.util.HashMap;
import java.util.Scanner;

public class uklsulit3 {
      public static void hitungFrekuensi(int[] array) {
        HashMap<Integer, Integer> frekuensi = new HashMap<>();
        //hasmap untuk menyimpan elemen sebagai frekuensi

        //menghitung frekuensi setiap element
        for(int angka : array){
            frekuensi.put(angka, frekuensi.getOrDefault(angka, 0)+1);
            //jika element sudah ada di hasmap, maka frekuensi ditambahkan (+1)
            
        }
        //hasil
        System.out.println("frekuensi setiap element dalam array: ");
        for ( int angka: frekuensi.keySet()){
            System.out.println(angka+ " muncul "+ frekuensi.get(angka)+ " kali ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("masukkan jumlah element array yang anda mau: ");
        int jumlah = s.nextInt();

        
        int[]array = new int [jumlah];
        System.out.println("masukkan nilai element nya: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("element ke- " + (i+1)+ " : ");
            array[i] = s.nextInt();
            
        }
        hitungFrekuensi(array);
        s.close();
    }
    
}
