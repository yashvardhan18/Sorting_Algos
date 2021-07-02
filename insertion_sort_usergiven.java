import java.util.*;
public class insertion_sort_usergiven {
    void sort(int arr[]) {

        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    static void printArray(int arr[])
    {
        for (int i = 0; i <arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        insertion_sort_usergiven ob = new insertion_sort_usergiven();
        ob.sort(arr);
        printArray(arr);
    }
}
