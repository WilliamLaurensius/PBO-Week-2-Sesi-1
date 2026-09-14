/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.week.pkg2.sesi.pkg1;

/**
 *
 * @author ASUS
 */
public class UnaryOperators {
    // Compound assignment: +=, -=, *=, /=, %=
int x = 10;
x += 5; // 15

// Dampak tipe data:
double d = 10.0 / 3; // 3.333...
int i = 10 / 3;      // 3 (truncation)

// Pada ekspresi campuran, tipe lebih kecil dipromosikan
// (int -> double). Hasil utilitas:
double d = Math.pow(2.5, 3); // 8.0
double s = Math.sqrt(64);    // 8.0
}
