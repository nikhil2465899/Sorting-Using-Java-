import java.util.Scanner;

public class QuickSort {
    public static void partition(int arr[],int low, int high){
        int pivot= arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                // here we increase the i because we get empty space for store the smallest element.

            }
        }
    }

    public static void QuickSortTech(int arr[],int low,int high){
        if(low<high){
            int pivotindex=
        }
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your array size: ");
        int x= sc.nextInt();
        int []arr= new int[x];
        System.out.println("Enter your array element here: ");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        // Printing the array element before selection sort
        System.out.println("array before Selection sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("array After Selection sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
