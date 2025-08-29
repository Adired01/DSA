public class Median {
    public static void main(String[] args){
        Median median = new Median();
        int[] nums1 = {1, 3, 5, 6};
        int[] nums2 = {2,4,9,11,23,55};
        System.out.println("Median is " + median.findMedianSortedArrays(nums1, nums2));
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int n = nums1.length;
        int m = nums2.length;
        int i=0, j=0, m1=0, m2=0;

        //Find Median
        for(int count =0; count <= (n+m)/2; count++){
            m2=m1;
            if(i != n && j != m){
                if(nums1[i] > nums2[j]){
                    m1 = nums2[j++];
                }else{
                    m1 = nums1[i++];
                }
            } else if (i<n) {
                m1 = nums1[i++];

            }else{
               m1 = nums2[j++];
            }
        }
        // check if the sum of n and m is ood.
        if((n+m)%2 == 1){
            return(double) m1;
        }else{
            double ans = (double) m1 + (double) m2;
            return ans / 2.0;
        }
    }
}
