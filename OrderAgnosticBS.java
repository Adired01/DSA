import java.io.OptionalDataException;

public class OrderAgnosticBS {
    public static void main(String[] args){
        int[] arr = {45,42,34,24,16,7,3,1};
        int target = 16;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = (start+(end-start)/2);
            if(target == arr[mid]){
                return mid;
            }if (isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }

            }
        }
        return -1;

    }

}
