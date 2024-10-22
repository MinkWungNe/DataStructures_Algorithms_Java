
import java.util.LinkedList;
import java.util.List;

public class BaiTap_2_AbstractLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(List.of(10, 20, 30, 40));

    }

    public static LinkedList<Integer> AddFirst(LinkedList<Integer> list, int IntegerToAdd)
    {
        LinkedList<Integer> tempList = new LinkedList<>(List.copyOf(list));
        tempList.add(0, IntegerToAdd);
        return tempList;
    }

    public static LinkedList<Integer> DeleteFirst(LinkedList<Integer> list)
    {
        LinkedList<Integer> tempList = new LinkedList<>(List.copyOf(list));

        return tempList;
    }

    public static LinkedList<Integer> Sort(LinkedList<Integer> list)
    {
        LinkedList<Integer> tempList = new LinkedList<>(List.copyOf(list));

        return tempList;
    }

    public static void FindMax(LinkedList<Integer> list)
    {
        
    }

    public static void FindMin(LinkedList<Integer> list)
    {

    }

    public static LinkedList<Integer> Swap(LinkedList<Integer> list)
    {
        LinkedList<Integer> tempList = new LinkedList<>(List.copyOf(list));

        return tempList;
    }
}
