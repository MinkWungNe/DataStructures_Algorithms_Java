import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BaiTap_1_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("Hung", "Vuong", "University", "of", "Ho", "Chi", "Minh", "City"));
        AddFirst(list, "Hello!");
        PrintList(list);
    }

    public static void PrintList(LinkedList<String> list)
    {
        Iterator<String> i = list.iterator();
        while (i.hasNext())
        {
            String element = i.next();
            System.out.print(element);
        }
    }

    public static void AddFirst(LinkedList<String> list, String StringToAdd)
    {
        list.add(0, StringToAdd);
    }

    public static void DeleteEvenLength(LinkedList<String> list)
    {
        Iterator<String> i = list.iterator();
        while (i.hasNext())
        {
            String element = i.next();
            if (element.length() % 2 == 0)
            {
                i.remove();
            }
        }
    }
}
