package java_intro;

import java.util.Scanner;

/*
 * LÝ THUYẾT
 * Gồm các phép tính +,-,*,/,%
 */
public class Java11_CacPhepToanBasicInJava {
    public static void main(String[] args) {
       int a,b;
       Scanner sc = new Scanner(System.in); 
       System.out.println("Nhap a:");  
       a = sc.nextInt();
       System.out.println("Nhap b:");
       b = sc.nextInt();  
       System.out.println(a + " + "+ b + " = "+ (a+b));
       System.out.println(a + " - "+ b + " = "+ (a-b));
       System.out.println(a + " * "+ b + " = "+ (a*b));
       System.out.println(a + " / "+ b + " = "+ ((float)a/b));
       System.out.println(a + " mod "+ b + " = "+ (a%b));

    }   
    
}
