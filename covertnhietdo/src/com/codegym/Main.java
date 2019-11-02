package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    converCandF converCandF = new converCandF();
    int choise;
    do {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Menu chuyen doi nhiet do");
        System.out.println("phim 1: chuyen tu F sang C");
        System.out.println("phim 2: chuyen tu C sang F");
        System.out.println("phim 0: thoat");
        choise = scanner.nextInt();
        System.out.println("=================================");
        switch (choise){
            case 1:
                converCandF.getCCovertF();
                break;
            case 2:
                converCandF.getFandC();
                break;
            case 0:
                System.exit(0);
             break;
            default:
                System.out.println("hay nhap lai lua chon");
             break;
        }
    }while (choise !=0);

    }
}