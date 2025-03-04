package Modul_1.CODELAB;

import java.util.Scanner;
import java.time.LocalDate;

public class a {
    public static void main(String[] args) {
        // Membuat objek Scanner agar bisa membaca input dari user
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari user
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menutup scanner
        scanner.close();

        // Menentukan jenis kelamin
        String jenisKelaminStr;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminStr = "Laki-Laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminStr = "Perempuan";
        } else {
            jenisKelaminStr = "Tidak diketahui";
        }

        // Menghitung umur user
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Menampilkan hasil output
        System.out.println("\nData Diri:");
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelaminStr);
        System.out.println("Umur          : " + umur);
    }
}

