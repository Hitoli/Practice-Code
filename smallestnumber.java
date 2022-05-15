public class smallestnumber {
    public static void main(String[] args) {
        int [] nums = {5,6,7,0,1,2,3};
        int n =nums.length;
        int end =n-1;
        int start =0;
        while(start<end){
            int mid = start+(end-start)/2;
            if(nums[mid]>=nums[start]){
                start = mid+1;
            }else{
                end = mid;
            }
            System.out.println(mid);

        }

        System.out.println("hellpo");
    }
}
