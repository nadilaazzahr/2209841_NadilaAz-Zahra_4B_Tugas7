package com.mycompany.tugas7;

public class LinearEquation {
    private double a, b, c, d, e, f;

    // Constructor tanpa argumen
    public LinearEquation() {
        // Inisialisasi nilai-nilai koefisien ke 0
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }

    // Metode setter untuk mengatur nilai-nilai koefisien
    public void setCoefficients(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Getter untuk a
    public double getA() {
        return a;
    }

    // Getter untuk b
    public double getB() {
        return b;
    }

    // Getter untuk c
    public double getC() {
        return c;
    }

    // Getter untuk d
    public double getD() {
        return d;
    }

    // Getter untuk e
    public double getE() {
        return e;
    }

    // Getter untuk f
    public double getF() {
        return f;
    }

    // Method untuk mengecek apakah persamaan solvable
    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    // Method untuk menghitung dan mengembalikan nilai x
    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    // Method untuk menghitung dan mengembalikan nilai y
    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}
