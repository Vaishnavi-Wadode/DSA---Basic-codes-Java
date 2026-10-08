import java.util.*;
public class Linear_Search {
    public static int search (int arr[], int target){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == target){
                return i; 
            }
        }
return -1;
    }
    public static void main(String[] args) {
        int []arr = {20,17,98,65,69,56,89,90,87,69};
        int target = 69;
        int result = search(arr,target);
        if(result == -1){
            System.out.println("No data available");
        }
        else{
            System.out.println("Target is in index : "+result);
        }
    }
}
