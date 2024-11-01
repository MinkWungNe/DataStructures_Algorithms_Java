public class Bai_9 {
    public static void Space(int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.println("     ");
        }
    }

    public static void StickMan(int part)
    {
        switch (part) {
            case 0:
                System.out.print("  .  ");
                break;
            case 1:
                System.out.print(" /|\\ ");
                break;
            case 2:
                System.out.print(" / \\ ");
                break;
            default:
                break;
        }
    }
    
    public static void Draw(int num)
    {
        for (int i = 0; i < num; i++)
        {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        int space_first = 4, space_last = 0;
        //int i,j;    // i = dòng; j = cột
        // for (i = 0; i <= 16; i++)
        // {   
        //     for (j = 0; j <= 32; j++)
        //     {
        //         if (j == 32) 
        //         {
        //             System.out.println("*");

        //         }
        //     }

        //     if (i == 16)
        //     {   
        //         for (j = 0; j <= 31; j++)
        //         {
        //             System.out.print("* ");
        //         }
        //     }
        // }

        for (int i = 0; i <= 16; i++)
        {
            int space = i % 4;
            StickMan(space);

            if (space == 0)
            {
                Draw(6);
            }
            else if (space == 1 || space == 2)
            {
                Draw(1);
            }
            System.out.println();
            for (int j = 0; j <= 32; j++)
            {
                
            }
        }
    }
}
