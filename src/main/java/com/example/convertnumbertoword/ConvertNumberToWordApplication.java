package com.example.convertnumbertoword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ConvertNumberToWordApplication {
    public static void main(String[] args) {

        SpringApplication.run(ConvertNumberToWordApplication.class, args);
        String donvi = null;
        String chuc = null;
        String tram;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int number = sc.nextInt();
        int unit = number % 10;
        int dozens = (number / 10) % 10;
        int hundreds = number / 100;
        if (hundreds == 0){
            if (dozens == 0){
                switch (unit){
                    case 0:
                        System.out.println("Không");
                        break;
                    case 1:
                        donvi = "Một";
                        System.out.println("Một");
                        break;
                    case 2:
                        System.out.println("Hai");
                        break;
                    case 3:
                        System.out.println("Ba");
                        break;
                    case 4:
                        System.out.println("Bốn");
                        break;
                    case 5:
                        System.out.println("Năm");
                        break;
                    case 6:
                        System.out.println("Sáu");
                        break;
                    case 7:
                        System.out.println("Bảy");
                        break;
                    case 8:
                        System.out.println("Tám");
                        break;
                    case 9:
                        System.out.println("Chín");
                }
            }else if(dozens > 0 && dozens < 9){
                switch (dozens){
                    case 1:
                        chuc = "Mười";
                        System.out.println("Mười");
                        break;
                    case 2:
                        chuc = "Hai Mươi";
                        System.out.println("Hai Mươi");
                        break;
                    case 3:
                        chuc = "Ba Mươi";
                        System.out.println("Ba Mươi");
                        break;
                    case 4:
                        chuc = "Bốn Mươi";
                        System.out.println("Bốn Mươi");
                        break;
                    case 5:
                        chuc = "Năm Mươi";
                        System.out.println("Năm Mươi");
                        break;
                    case 6:
                        chuc = "Sáu Mươi";
                        System.out.println("Sáu Mươi");
                        break;
                    case 7:
                        chuc = "Bảy Mươi";
                        System.out.println("Bảy Mươi");
                        break;
                    case 8:
                        chuc = "Tám Mươi";
                        System.out.println("Tám Mươi");
                        break;
                    case 9:
                        chuc = "Chín Mươi";
                        System.out.println("Chín Mươi");
                }
                switch (unit){
                    case 1:
                        donvi = "Một";
                        System.out.println("Một");
                        break;
                    case 2:
                        donvi = "Hai";
                        System.out.println("Hai");
                        break;
                    case 3:
                        donvi = "Ba";
                        System.out.println("Ba");
                        break;
                    case 4:
                        donvi = "Bốn";
                        System.out.println("Bốn");
                        break;
                    case 5:
                        donvi = "Năm";
                        System.out.println("Năm");
                        break;
                    case 6:
                        donvi = "Sáu";
                        System.out.println("Sáu");
                        break;
                    case 7:
                        donvi = "Bảy";
                        System.out.println("Bảy");
                        break;
                    case 8:
                        donvi = "Tám";
                        System.out.println("Tám");
                        break;
                    case 9:
                        donvi = "Chín";
                        System.out.println("Chín");
                }
                System.out.println("Số bạn nhập là : " + chuc + ' ' + donvi);
            }
        }else {
            switch (hundreds){
                case 1:
                    System.out.println("Một Trăm");
                    break;
                case 2:
                    System.out.println("Hai Trăm");
                    break;
                case 3:
                    System.out.println("Ba Trăm");
                    break;
                case 4:
                    System.out.println("Bốn Trăm");
                    break;
                case 5:
                    System.out.println("Năm Trăm");
                    break;
                case 6:
                    System.out.println("Sáu Trăm");
                    break;
                case 7:
                    System.out.println("Bảy Trăm");
                    break;
                case 8:
                    System.out.println("Tám Trăm");
                    break;
                case 9:
                    System.out.println("Chín Trăm");
                    break;
            }
            switch (dozens){
                case 1:
                    System.out.println("Mười");
                    break;
                case 2:
                    System.out.println("Hai Mươi");
                    break;
                case 3:
                    System.out.println("Ba Mươi");
                    break;
                case 4:
                    System.out.println("Bốn Mươi");
                    break;
                case 5:
                    System.out.println("Năm Mươi");
                    break;
                case 6:
                    System.out.println("Sáu Mươi");
                    break;
                case 7:
                    System.out.println("Bảy Mươi");
                    break;
                case 8:
                    System.out.println("Tám Mươi");
                    break;
                case 9:
                    System.out.println("Chín Mươi");
            }
            switch (unit){
                case 1:
                    System.out.println("Một");
                    break;
                case 2:
                    System.out.println("Hai");
                    break;
                case 3:
                    System.out.println("Ba");
                    break;
                case 4:
                    System.out.println("Bốn");
                    break;
                case 5:
                    System.out.println("Năm");
                    break;
                case 6:
                    System.out.println("Sáu");
                    break;
                case 7:
                    System.out.println("Bảy");
                    break;
                case 8:
                    System.out.println("Tám");
                    break;
                case 9:
                    System.out.println("Chín");
            }
        }

   }
}
