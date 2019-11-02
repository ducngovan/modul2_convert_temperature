package com.codegym;

import java.util.Scanner;

public class converCandF {
    private double celsius;
    private double fahrenheit;
    Scanner scanner = new Scanner(System.in);
    public void getCCovertF(){
        System.out.println("hay nhap nhiet do(F): ");
        fahrenheit = scanner.nextDouble();
        double result = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("nhiet do doi duoc la: "+result+" C");
    }
    public void getFandC(){
        System.out.println("hay nhap nhiet do(C): ");
        celsius = scanner.nextDouble();
        double result = (9.0 / 5) * celsius + 32;
        System.out.println("nhiet do doi duoc la: "+result+" F");
    }

    }

