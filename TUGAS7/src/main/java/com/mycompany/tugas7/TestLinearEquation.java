package com.mycompany.tugas7;

import java.util.Scanner;

public class TestLinearEquation {
    public static void main(String[] args) {
        // Membuat objek LinearEquation
        LinearEquation equation = new LinearEquation();

        try ( // Meminta pengguna untuk memasukkan nilai koefisien a, b, c, d, e, dan f
                Scanner scanner = new Scanner(System.in)) {
            System.out.println("Masukkan nilai a: ");
            double a = scanner.nextDouble();
            System.out.println("Masukkan nilai b: ");
            double b = scanner.nextDouble();
            System.out.println("Masukkan nilai c: ");
            double c = scanner.nextDouble();
            System.out.println("Masukkan nilai d: ");
            double d = scanner.nextDouble();
            System.out.println("Masukkan nilai e: ");
            double e = scanner.nextDouble();
            System.out.println("Masukkan nilai f: ");
            double f = scanner.nextDouble();
            // Mengatur nilai-nilai koefisien menggunakan metode setter
            equation.setCoefficients(a, b, c, d, e, f);
            // Menampilkan hasil
            System.out.println("Nilai a: " + equation.getA());
            System.out.println("Nilai b: " + equation.getB());
            System.out.println("Nilai c: " + equation.getC());
            System.out.println("Nilai d: " + equation.getD());
            System.out.println("Nilai e: " + equation.getE());
            System.out.println("Nilai f: " + equation.getF());
            // Memeriksa apakah persamaan memiliki solusi dan menampilkan solusinya
            if (equation.isSolvable()) {
                System.out.println("Solusi x adalah: " + equation.getX());
                System.out.println("Solusi y adalah: " + equation.getY());
            } else {
                System.out.println("Persamaan tidak memiliki solusi.");
            }
        // Menutup scanner
        }
    }
}
