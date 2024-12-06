package melvin;

import java.util.Scanner;

public class uklsedang2 {
    public static double volTabung(double jariJari, double tinggi) {
        // Rumus volume tabung: V = PI * r^2 * t
        double pi = (22/7);
        double hasil = pi * jariJari*jariJari*tinggi;
        return hasil;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari tabung: ");
        double jariJari = s.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = s.nextDouble();

        // Memanggil fungsi untuk menghitung volume tabung
        double volume = volTabung(jariJari, tinggi);
        System.out.println("Volume tabung adalah: " + volume);

        s.close();
    }
}


