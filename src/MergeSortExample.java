import java.util.Scanner;
import  java.util.*;
public class MergeSortExample {
    public static void Conquer(int arr[], int si, int mid, int ei) {
        // now we creating new array for storing the sorted array.
        int sortedarray[] = new int[ei - si + 1];
        // now for comparing the element of array we need to index. of each divide array.
        //|6|3|5|1|2|4|
        // merge sort - sort the array in recursion format
        // merge sort divide array in two part and and sort the array until its element get sorted.
        // in merge sort we divide above array into two part using mid method. so mid of this array is
        //si+(ei-si)/2 so approximetly  5or 1 something but we take 5 as mid...and 1 as mid+1;
        // leftidx1= 6; rightidx1= mid+1;

        int leftidx1 = si;
        int rightidx1 = mid + 1;
        // now we taking a variable for travers the sorted array elemtnt
        int s = 0;
        // now using while loop we can comparing the two divided array.
        while (leftidx1 <= mid && rightidx1<= ei) {
            if (arr[leftidx1] <= arr[rightidx1]) {
                // so above condition is satisfied then we can stored the indexes in sorted array.
                sortedarray[s] = arr[leftidx1];
                s++;
                leftidx1++;
            } else {
                sortedarray[s] = arr[rightidx1];
                s++;
                rightidx1++;
            }
        }
        //but as compare to above condition when between two condition one is become unsatisfied then below condition is appling on array
        while (leftidx1 <= mid) {
            sortedarray[s] = arr[leftidx1];
            s++;
            leftidx1++;
        }
        while (rightidx1 <= ei) {
            sortedarray[s] = arr[rightidx1];
            s++;
            rightidx1++;
        }
        for (int i = 0, j = si; i < sortedarray.length; i++, j++) {
            // for (int j = si; j < arr.length; j++) {
            arr[j] = sortedarray[i];
            // }

        }

    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        //|6|3|5|1|2|4|=
        // above array divide like ----> |6|3|5|     |1|2|4|
        // so, si of first array is 6 and ei= mid which is 5
        // si of second array is mid+1= 1 and ei= 4
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        Conquer(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter your array element here: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // Printing the array element before merge  sort
        System.out.println("array before Merge sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // calling merge sort function
        divide(arr, 0, arr.length - 1);
        System.out.println();
        System.out.println("array After Merge sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
