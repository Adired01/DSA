public class FindInMountainArray {
    public static void main(String [] args){
        int[] arr = {1,2,3,4,9,6,5};
        int target = 5;
        int ans=mountainArray(arr, target);
        System.out.println(ans);
    }
    public static int mountainArray(int[] arr, int target){
        int peak = findPeakMounatainarry(arr);
        int firstArray = orderAgnosticBS(arr, target, 0, peak);
        if(firstArray != -1){
            return firstArray;
        }else{
            return orderAgnosticBS(arr, target, peak+1, arr.length-1);
        }
    }
    public static int findPeakMounatainarry(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                    end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    public static int orderAgnosticBS(int [] arr, int target, int start, int end){
        boolean isAsc = arr[start]<arr[end];
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
