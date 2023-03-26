package java_intro;

import java.util.Scanner;

/*
 * LÝ THUYẾT
 * Sử dụng scanner
 * Scanner variable_name = newScanner(System.in);
 * Một số phương thức nhập:
 * nextBoolean(): đọc giá tri boolean từ bàn phím
 * nextInt(): Đọc 1 giá trị nguyên từ bàn phím
 * nextByte(): .............byte ..............
 * nextDouble(),nextFloat(),nextLỉne():Đọc 1 chuỗi từ bàn phím,nextLong(),nextShort()
 */
public class Java09_NhapData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Hello "+name+" !");
        System.out.println("How old are you?");
        int age = sc.nextInt();
        if (age >=18){
            System.out.println("Will you marry me?");
        }
        else System.out.println("Do you want to be my girlfriend?");
    }
    
}
