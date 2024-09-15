import java.util.Scanner;

public class BaiTap_1 {
    
    public static void main(String[] args) {
      Scanner Input = new Scanner(System.in);
      int a, b, c, min;

      System.out.println("Nhap a: ");
      a = Input.nextInt();
      System.out.println("Nhap b: ");
      b = Input.nextInt();
      System.out.println("Nhap c: ");
      c = Input.nextInt();

      min = a;
      if(min > b)
      {
        min = b;
      }

      if (min > c)
      {
        min = c;
      }

      System.out.println("Gia tri nho nhat: " + min );
      Input.close();
    }

}