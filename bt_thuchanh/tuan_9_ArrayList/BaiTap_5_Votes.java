
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaiTap_5_Votes {
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<String> UngVien = new ArrayList<>();
        ArrayList<String> PhieuBau = new ArrayList<>();
        String filePath = System.getProperty("user.dir") + File.separator + "phieu.txt";
        try (Scanner console = new Scanner(new File(filePath))) {
            while (console.hasNext())
            {
                String name = console.next();
                PhieuBau.add(name);

                // Bổ sung tên ứng viên nếu chưa có
                if (!UngVien.contains(name))    
                {
                    UngVien.add(name);
                }
            }
        }

        System.out.println("list = " + UngVien);

        // Sort tên ứng viên
        Collections.sort(UngVien);

        // Đếm phiếu
        int VotesCount[] = new int[4];

        
    }
}
