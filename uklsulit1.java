package melvin;

import java.util.Scanner;

public class uklsulit1 {
    public static void main(String[] args) {
        int JumlahSiswa;
        double ratarata, Nilai, TotalNilai=0;
        Scanner hehe = new Scanner(System.in);

        System.out.println("Masukan Jumlah siswa");
        JumlahSiswa = hehe.nextInt();
         
        for (int i = 1; i <=JumlahSiswa; i++){
            System.out.println("Nilai siswa" + i + ":");
            Nilai = hehe.nextDouble();
            TotalNilai += Nilai;
          
        }

        ratarata = TotalNilai/JumlahSiswa;
        System.out.println("Total Nilai: "+TotalNilai);
        System.out.println("Rata-Rata Nilai: " + ratarata );

        hehe.close();
    }
}
    
    

