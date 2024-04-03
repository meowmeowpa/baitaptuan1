import java.util.Scanner;

public class diem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm chuyên cần:");
        double diemChuyenCan = scanner.nextDouble();
        System.out.println("Nhập điểm kiểm tra:");
        double diemKiemTra = scanner.nextDouble();
        System.out.println("Nhập điểm thi học kỳ:");
        double diemThi = scanner.nextDouble();
        double diemTrungBinh = (diemChuyenCan + diemKiemTra + diemThi) / 3;
         String xepLoai = xepLoaiDiem(diemTrungBinh);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
        System.out.println("Xếp loại: " + xepLoai);

        scanner.close();
    }
    public static String xepLoaiDiem(double diemTrungBinh) {
        if (diemTrungBinh >= 8.5) {
            return " A";
        } else if (diemTrungBinh >= 7) {
            return " B";
        } else if (diemTrungBinh >= 5.5) {
            return " C";
        } else if (diemTrungBinh >= 4) {
            return " D";
        } else {
            return " F";
        }
    }
}


