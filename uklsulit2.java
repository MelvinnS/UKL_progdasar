package melvin;

import java.util.Scanner;

public class uklsulit2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = s.nextInt();

        // Membuat array untuk menampung input
        int[] array = new int[n];

        // Meminta pengguna untuk memasukkan elemen-elemen array
        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = s.nextInt();
        }

        // Memanggil fungsi untuk mengecek duplikat
        cekDuplikat(array);

        s.close();
    }

    // Fungsi untuk mengecek elemen duplikat dalam array
    public static void cekDuplikat(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            // Memeriksa apakah elemen array[i] muncul lebih dari sekali dalam array
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Array yang memiliki elemen duplikat adalah: " + array[i]);
                    return;  // Keluar dari fungsi setelah menemukan duplikat
                }
            }
        }

        // Muncul jika tidak ada duplikat
        System.out.println("Array tidak memiliki elemen duplikat");
    
    }
    
}
