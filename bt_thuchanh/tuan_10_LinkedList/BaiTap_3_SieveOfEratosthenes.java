
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BaiTap_3_SieveOfEratosthenes {
    public static void main(String[] args) {
        // 1) Tạo dãy liên tục (2 -> 25)
        List<Integer> list = Initialize(2, 25);
        PrintList(list);


    }


    // Tạo dãy số
    public static List<Integer> Initialize(int Start, int Max)
    {
        List<Integer> tempList = new LinkedList<>();

        for (int i = Start; i < Max; i++)
        {
            tempList.add(i);
        }

        return tempList;
    }

    // Lấy số nguyên tố
    public static void GetPrime(List<Integer> list)
    {
        
    }

    public static void Clean(List<Integer> list)
    {

    }

    // Print
    public static void PrintList(List<Integer> list)
    {
        Iterator<Integer> i = list.iterator();
        while (i.hasNext())
        {
            int element = i.next();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
