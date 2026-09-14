/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.week.pkg2.sesi.pkg1;

/**
 *
 * @author ASUS
 */
public class MultiLabel {
    switch (month) {
    case 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12:
        days = 31;
        break;
    case 4:
        days = 30;
        break;
    case 2:
        days = isLeap(year) ? 29 : 28;
        break;
    default:
        days = -1;
        break;
}
}
