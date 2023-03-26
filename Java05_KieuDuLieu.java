package java_intro;
/*
 * LÝ THUYẾT
 * Trong java có hai dạng kiểu dữ liệu:
 -Kiểu dữ liệu nguyên thủy
 +Số nguyên: byte, short, int, long
 +Số thực: float, double
 +boolean: true,false
 +Ký tự: char
 -Kiểu DL đối tượng (chữ cái đầu tiên viết hoa)
 +Chuổi: String
 +Mảng: Array
 + Số thực: Double
 ....
 */
public class Java05_KieuDuLieu {
    public static void main(String[] args) {
        int soThuTu = 1;
        String tenSach = "Lap trinh huong doi tuong";
        double giaSach = 77.777;
        char maSach = 'A';
        boolean tinhTrang = true;
        System.out.println("Số thứ tự: "+ soThuTu);
        System.out.println("Mã sách: "+ maSach);
        System.out.println("Tên sách: "+ tenSach);
        System.out.println("Giá sách: "+ giaSach);
        System.out.println("Tình trạng: "+ tinhTrang);


    }
}
