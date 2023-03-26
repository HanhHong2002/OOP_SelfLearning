package java_intro;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

/*
 * LÝ THUYẾT
 Các phép toán 1 ngôi gồm:
 + : biểu thị giá trị dương
 - : biểu thị giá trị âm
 ++ : tăng giá trị biến lên 1
 -- : giảm giá trị biến đi 1
 ! : nghịch đảo 1 giá trị boolean
 */
public class Java12_PhepToan1Ngoi {
    public static void main(String[] args) {
        int a = 4;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(-a);
        System.out.println(++a);
    }
}
