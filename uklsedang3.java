package melvin;

import java.util.Random;
import java.util.Scanner;

public class uklsedang3 {


    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
    Random r = new Random();

        // Menu untuk melanjutkan atau berhenti
        String pilihan;
        
        do {
            // User dipilih operasi secara acak (perkalian / pembagian / modulus)
            int operasi = r.nextInt(3); // 0 = perkalian, 1 = pembagian, 2 = modulus

            // Menghasilkan dua bilangan acak
            int bilangan1 = r.nextInt(10) + 1; 
            int bilangan2 = r.nextInt(10) + 1; 
            int jawabanBenar = 0; 
            String operator = "";

            // Menentukan jenis operasi dan soal
            switch (operasi) {
                case 0: // Perkalian
                    operator = "x";
                    jawabanBenar = bilangan1 * bilangan2;
                    break;
                case 1: // Pembagian
                    operator = "/";
                    // Agar pembagian bulat, bilangan1 harus merupakan kelipatan bilangan2
                    bilangan1 = bilangan2 * (r.nextInt(10) + 1); // Pastikan bilangan1 dapat dibagi bilangan2
                    jawabanBenar = bilangan1 / bilangan2;
                    break;
                case 2: // Modulus
                    operator = "%";
                    jawabanBenar = bilangan1 % bilangan2;
                    break;
            }

            // Menampilkan soal kuis kepada pengguna
            System.out.println("Apa hasil dari: " + bilangan1 + " " + operator + " " + bilangan2 + " ?");
            int jawabanUser = s.nextInt();

            // Memeriksa apakah jawaban pengguna benar atau salah
            if (jawabanUser == jawabanBenar) {
                System.out.println("Jawaban Anda Benar!\n");
            } else {
                System.out.println("Jawaban Anda Salah! Jawaban yang benar adalah: " + jawabanBenar + "\n");
            }

            // Menanyakan kepada pengguna apakah ingin melanjutkan kuis
            System.out.print("Apakah Anda ingin melanjutkan kuis? (y/n): ");
            pilihan = s.next();
            
        } while (pilihan.equalsIgnoreCase("y")); 
       
        System.out.println("Terima kasih telah bermain!");
        s.close();
    
}
}
