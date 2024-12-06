package melvin;

import java.util.Scanner;

public class uklmudah1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("============================================");
        System.out.println("SELAMAT DATANG DI JKT EKSEPERES\n   INI ADALAH PRAISLIS KAMI");
        System.out.println(
                "\n1. <10 KM  =  Rp. 4.250/KG\n2. >10 KM  =  Rp.6.000/KG\n3. VOLUME BARANG >100cm3  =  +Rp. 50.000\n");

        // Input berat paket (dalam kilogram)
        System.out.print("Masukkan berat paket (kg): ");
        double beratPaket = s.nextDouble();

        // Input jarak tempuh (dalam kilometer)
        System.out.print("Masukkan jarak tempuh (km): ");
        double jarakTempuh = s.nextDouble();

        // Input dimensi paket (panjang, lebar, dan tinggi dalam cm)
        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = s.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = s.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = s.nextDouble();

        // ADA 4 YG DIHITUNG
        // 1. MENGHITUNG VOLUME PAKET
        double volumePaket = panjang * lebar * tinggi;

        // 2. MENGHITUNG BIAYA PENGIRIMAN
        double biayaPerKg = 0;

        if (jarakTempuh <= 10) {
            biayaPerKg = 4250; // Biaya per kg untuk jarak <= 10 km
        } else {
            biayaPerKg = 6000; // Biaya per kg untuk jarak > 10 km
        }

        // 3. Menghitung biaya tambahan jika volume paket lebih dari 100 cm^3
        double biayaVolume = 0;
        if (volumePaket > 100) {
            biayaVolume = 50000; // Biaya tambahan untuk volume > 100 cm^3
        }

        // 4. MENGHITUNMG BIAYA TOTSL
        double totalBiaya = (biayaPerKg * beratPaket) + biayaVolume;

        // Menampilkan hasil perhitungan
        System.out.println("============================================");
        System.out.println("Rincian Biaya Pengiriman:");
        System.out.println("Berat Paket: " + beratPaket + " kg");
        System.out.println("Jarak Tempuh: " + jarakTempuh + " km");
        System.out.println("Volume Paket: " + volumePaket + " cm^3");
        System.out.println("");
        System.out.println("Biaya Pengiriman berat paket: Rp " + biayaPerKg * beratPaket);
        System.out.println("Biaya Volume: Rp " + biayaVolume);
        System.out.println("Total Biaya Pengiriman: Rp " + totalBiaya);

        // Menutup scanner
        s.close();

    }
}
