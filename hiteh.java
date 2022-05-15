import java.util.Arrays;

public class hiteh {
    public static void main(String[] args) {
        int[] nums = {6,7,8,0,1,2,3};
        int target =6;
        int n = nums.length;
        int start =0; int end = n-1;
        while(start<=end){
            int mid = start +(end -start)/2;
            if(nums[mid]==target){
                System.out.println(true);
                break;
            }
            else if(nums[start]<nums[mid]){
                if(nums[mid]<target && nums[start]<target){
                    start = mid+1;
                }else{
                    end =mid-1;
                }
            }
            else if(nums[start]>nums[mid]){
                if(nums[mid]>target && nums[end]>target){
                    end = mid-1;
                }else{
                    start =mid+1;
                }
            }

        }
        System.out.println(false);


    }


}

