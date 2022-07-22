public class binarysearchsmallestsclosest {
    public static void main(){
        int[] arr = {3,4,5,6,7,9,10,11};
        int target =8;
        System.out.println(sgno(target,arr));
    }
    static int sgno(int target, int[]arr){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+end-start/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start =mid+1;
            }else{
                end=mid-1;
            }
        }
        return end;
    }
}
