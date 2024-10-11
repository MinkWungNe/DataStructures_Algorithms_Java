import java.util.Scanner;

public class BaiTap_2_TinhNhietDo2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int days;
        double sum = 0;
        double average;
        int Hotdays = 0;

        System.out.print("Ban muon nhap nhiet do bao nhieu ngay?: ");
        days = console.nextInt();
        double arr[] = new double[days];

        // Input
        for (int i = 0; i < days; i++)
        {
            System.out.print("Nhiet do ngay thu " + (i + 1) + ": ");
            arr[i] = console.nextInt();
            System.out.println();
            sum += arr[i];
        }
        average = sum / days;

        // Tinh so ngay nhiet do > trung binh
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] > average)
            {
                Hotdays++;
            }
        }

        // Output
        System.out.println("Nhiet do trung binh: " + average);
        System.out.println("So ngay nong hon trung binh: " + Hotdays);
    }
}
