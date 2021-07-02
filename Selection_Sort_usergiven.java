import java.util.*;

public class Selection_Sort_usergiven {
    void sort(int arr[]) {


        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
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
            Scanner sc =new Scanner(System.in);
            Selection_Sort_usergiven ob = new Selection_Sort_usergiven();
            System.out.println("Enter Size of array");
            int n = sc.nextInt();
            int[] arr=new int[n];
            System.out.println("Enter numbers:");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            ob.sort(arr);
            ob.printArray(arr);
        }

}

