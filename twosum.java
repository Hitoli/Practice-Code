import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int []nums= {-1,-2,-3,-4,-5};
        int target =-8;
        System.out.println(Arrays.toString(twosum(nums,target)));

    }
    public static int[] twosum(int[]nums, int target){
        int i=0;
        int j= nums.length-1;
        while(i<=j){
            if(i!=j){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }else{
                    j--;
                }
            }
            if(j<=0){
                i++;
                j=nums.length-1;
            }
        }
        return new int[]{-1,-1};
    }
}
