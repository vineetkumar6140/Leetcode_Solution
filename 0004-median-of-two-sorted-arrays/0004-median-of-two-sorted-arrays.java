class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = merge(nums1 , nums2); 
         if(result.length % 2 == 0){
            double value = (double) (result[result.length/2] + result[result.length/2 -1]) / 2;
             return value;
         }else{
            double  value = (double) result[result.length/2];
              return value;
         }      
    }
    public int[] merge(int[] a1, int[] a2){
        int p1=0;
        int p2=0;
        int p3=0;
        int[] result=new int[a1.length+a2.length];
        while( p1 < a1.length || p2 < a2.length){
            int val1 = p1<a1.length ? a1[p1] : Integer.MAX_VALUE;
            int val2 = p2<a2.length ? a2[p2] : Integer.MAX_VALUE;
            if(val1 < val2){
                result[p3] = val1;
                p1++;
            }else{
                result[p3] = val2;
                p2++;
            }
            p3++;
        }
        return result;
    } 
}