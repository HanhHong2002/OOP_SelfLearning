package java_intro;

import java.util.Scanner;

/*
 * LÝ THUYẾT
 * Có 3 trường tĩnh: E (=2.71..) và PI (=3.14..)
 * Các phương thức:
 * abs(double/int/long a); tính giá trị tuyệt đối
 * ceil(double a); trả về giá trị nguyên nhỏ nhất lớn hơn hoặc bằng a
 * floor(double a); .....................lớn nhất nhỏ hơn hoặc bằng a
 * max(double a, double b); trả về giá trị lớn hơn giữa a và b
 * min(double a, double b); ...............nhỏ hơn............
 * pow(double a, double b); trả về a^b
 * random(); trả về giá trị ngẫu nhiên từ 0.0 đến 1.0
 * round(double a); làm tròn
 * sqrt(double a); trả về căn bậc 2
 * 
 * 
 * 
 */
public class Java16_MathClassAndMathFunction {
    public static void main(String[] args) {
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a:");
        a = sc.nextDouble();
        System.out.println("Input b:");
        b = sc.nextDouble();
        // hàm trị tuyệt đối
        System.out.println("|a| = "+ Math.abs(a));
        // Hàm tìm min
        System.out.println("Min[a,b] = "+ Math.min(a,b));
        // Hàm tìm số nguyên gần nhất lớn hơn hoặc bằng
        System.out.println("["+ a +"] = "+ Math.ceil(a) );
    }
}
