package jobsheet5;

import java.util.Scanner;
public class ifElseCetakKRS16 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan semester saat ini: ");
        int semester = sc.nextInt();

        if (semester >= 1 && semester <= 8) {
            System.out.println("KRS Semester " + semester + " ditampilkan");
        } else {
            System.out.println("Semester tidak valid");
        }
    }
}