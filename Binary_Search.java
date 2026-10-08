import java.util.*;
public class Binary_Search {
    public static int search (int arr[], int target, int L, int R){
        while(L<=R){
            int mid= L+(R-L)/2;
            if(target>arr[mid]){
                L=mid+1;
            }
            else if(target<arr[mid]){
                R=mid-1;
            }
            else{
                return mid;
            }
        }
return -1;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9};
        int target = 6;
        int L = 0;
        int R = arr.length-1;
        int result = search(arr,target,L,R);
        if(result == -1){
            System.err.println("No data available");
        }
        else{
            System.out.println("Target is in the index : "+result);
        }

    }
}
