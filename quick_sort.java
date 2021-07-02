import java.util.*;

class quick_sort
{
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {

            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    { 
        Scanner sc =new Scanner(System.in);
        System.out.println("enter Array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Values");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        quick_sort ob = new quick_sort();
        ob.sort(arr, 0, n-1);

        System.out.println("\nArray Sorted!!!");
        printArray(arr);
    }
}