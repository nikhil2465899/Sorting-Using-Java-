import java.util.*;
public class BubbleSortExample {
    public static void Bubblesort(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int Bob=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= Bob;
                }
            }
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
        // Printing the array element before bubble sort
        System.out.println("array before bubble sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        // now call the bubble sort function for sorting
        Bubblesort(arr);
        System.out.println();
        // printing the array after the bubble sort
        System.out.println("array after Bubble Sort ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
