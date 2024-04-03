import java.util.Scanner;

public class he {
    public static void main(String[] args) {
        //khai báo biến
        int a, b;
        //nh kiểu dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vào a = ");
        a = sc.nextInt();
        System.out.println("Nhap vào b");
        b = sc.nextInt();
        int tong = a / b;
        System.out.println(a + " / " + b + " =" + tong);

    }
}
