package java_intro;
/*
 * LÝ THUYẾT
 * Cấu trúc: final kiểu_dữ_liệu tên_hằng = giá_trị;
 */
public class Java06_HangSo {
    public static void main(String[] args) {
        final int MAX = 100000;
        int soNguoi = 10;
        System.out.println("Số kẹo tối đa chia cho mỗi người là: "+ MAX/soNguoi);
    }
}
