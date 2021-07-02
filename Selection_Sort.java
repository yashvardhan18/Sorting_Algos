public class Selection_Sort {
    void sort(int arr[])
{
    for (int i = 0; i < arr.length-1; i++)
    {
        int min = i;
        for (int j = i+1; j < arr.length; j++)
            if (arr[j] < arr[min])
                min = j;

        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
}
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String args[])
    {
        Selection_Sort ob = new Selection_Sort();
        int[] arr = {64,25,12,22,11};
        ob.sort(arr);
        ob.printArray(arr);
    }
}
