public class ShellSort {
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Hàm ShellSort
    int sort(int arr[])
    {
        int n = arr.length; // lấy kích thước array

        // n/2 -> n/4 -> n/8 -> n/16 -> n/32 -> ...
        for (int gap = n/2; gap > 0; gap /= 2)  // VD: n = 8 -> n/2 = 8/2 = 4 | n = 4 -> 4/2 = 2 | n = 2 -> 2/2 = 1
        {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already in gapped order keep adding one more element until the entire array is gap sorted
            for (int i = gap; i < n; i += 1)
            {
                // add a[i] to the elements that have been gap sorted save a[i] in temp and make a hole at position i
                int temp = arr[i];

                // shift earlier gap-sorted elements up until the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];

                // put temp (the original a[i]) in its correct location
                arr[j] = temp;
            }
        }
        return 0;
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = {12, 34, 54, 2, 3};
        System.out.println("Array before sorting");
        printArray(arr);

        ShellSort ob = new ShellSort();     // or add 'static ' at line 11 and change these two lines to sort(arr)
        ob.sort(arr);

        System.out.println("Array after sorting");
        printArray(arr);
    }

    /* n/2 = 5/2 = 2
     *    [12, _, 54, _, 3] & [_, 34, _, 2, _]
     * => [3, _, 12, _, 54] & [_, 2, _, 34, _]
     * => [3, 2, 12, 34, 54]
     * 
     * n/4 = 5/4 = 1
     *    [3, (2), 12, 34, 54]
     * => [2, 3, (12), 34, 54]
     * => [2, 3, 12, (34), 54]
     * => [2, 3, 12, 34, (54)]
     * => [2, 3, 12, 34, 54]
     */
}
