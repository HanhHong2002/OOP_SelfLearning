package java_intro;
/*
 * LÝ THUYẾT
 * Có 2 kiểu ép kiểu:
 - Ép kiểu ngầm định
 + Kiểu đích lớn hơn kiểu nguồn
 vd: byte -> short,int,long...

 - Ép kiểu tường minh
 + Khi cần chuyển sang kiểu dữ liệu có tính chính xác cao hơn
 + Kiểu đích nhỏ hơn kiểu nguồn

vd: float-> int 
 */
public class Java10_ChangeDatatype {
public static void main(String[] args) {
    // ép kiểu ngầm định
    int a = 100;
    int b= 10;
    float c = a;
    float d = b;
    // ép kiểu tường minh
    float e = 9.5f;
    int f = (int) e;


}
    
}
