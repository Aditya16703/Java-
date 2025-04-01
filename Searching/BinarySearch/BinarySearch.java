import java.util.*;
public class BinarySearch{
    public static void main(String args[]){
        int [] arr = {2,4,7,9,12,14,16,17,23};
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of target element:");
        int target = sc.nextInt();
        int ans = BS(arr,target);
        System.out.println(ans);
        if(ans == -1){
            System.out.println("Target not exist in arr");

        }
    
    }

    public static int BS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        

        while(start<= end){
            int mid = start + (end - start)/2;

            if( arr[mid]==target){
                return mid;
            }

            if( target < arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}