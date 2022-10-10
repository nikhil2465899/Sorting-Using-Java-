import java.util.Scanner;
public class InsertionSortExample {
    public static  void InsertionSort(int arr[]) {
        // first we take array and i= unsorted array
        // j= sorted array
        for (int i = 1; i < arr.length; i++) {
            // first we take unsorted element from array
            int unsorted= arr[i];
            // now we take sorted element from array
            int j=i-1;
            // comparing with each unsorted array element using while loop
            while(j>=0 && unsorted < arr[j]){
                // when above condition is satisfied then following changes is done.
                arr[j+1]= arr[j];
                j--;
                // j-- is for comparing the unsorted element to each of sorted element in array ..
                // j is 3 then j become 2,1,0 also then the condition become false then following changes will done.
            }
            arr[j+1]= unsorted;
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
        // Printing the array element before insertion sort
        System.out.println("array before Insertion sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        InsertionSort(arr);
        System.out.println();
        // printing the array element after insertion sort
        System.out.println("Array after insertion sort: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
