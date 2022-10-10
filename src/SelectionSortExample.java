import java.util.Scanner;
public class SelectionSortExample {
    public static void SelectionSort(int arr[]){
        for(int i=0;i< arr.length;i++){
            // now select the first element of array as smallest element and compare with whole array element
            int smallest=i;
            for(int j=i+1;j< arr.length;j++){
                // suppose we take (6,5,7,1,2) array element
                // if smallest is contain arr[i] means arr[0]= 6;
                // now we take 6 is smallest element so compare with remaining array element, we take another loop for traversing
                // the array element after 0th position
                // so, arr[j]= i+1, then our smallest element greater than arr[j] then select smallest element is arr[j]
                if(arr[smallest]>arr[j]){
                    smallest= j;
                }
            }
            // after j loop end then we switch the array element as per below sorting technique
            int Sorted= arr[smallest];
            arr[smallest]= arr[i];
            arr[i]= Sorted;
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
        SelectionSort(arr);
        System.out.println();
        System.out.println("array After Selection sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
