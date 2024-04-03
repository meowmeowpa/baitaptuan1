import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class doi {
    public static void main(String[] args) {
        double vnđ = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Giá trị VNĐ :" + quydoi);
    }
}
