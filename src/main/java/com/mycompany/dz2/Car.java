/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dz2;

/**
 *
 * @author NicSt
 */
public class Car {
    String Brand;
    String RegNumber;
    int Year;

    public Car(String Brand, String RegNumber, int Year) {
        this.Brand = Brand;
        this.RegNumber = RegNumber;
        this.Year = Year;
    }

    public String getBrand() {
        return Brand;
    }

    public String getRegNumber() {
        return RegNumber;
    }

    public int getYear() {
        return Year;
    }
}
