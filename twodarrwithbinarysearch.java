import java.util.Arrays;

public class twodarrwithbinarysearch {
    public static void main(String[] args) {
        int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
        int target =4;
        System.out.println(Arrays.toString(searching(arr,target)));

    }
    static int[] binaryserch(int[][]arr, int target,int cstart, int cend,int rstart){
        while(cstart<=cend){
            int cmid = cstart+(cend-cstart)/2;
            if(arr[rstart][cmid]==target){
                return new int[]{cstart,cend};
            }else if(arr[rstart][cmid]>target){
                cend = cmid-1;
            }else{
                rstart= cmid+1;
            }

        }
        return new int[]{-1,-1};

    }
    static int[] searching(int[][]matrix, int target){
        int rows = matrix.length;
        int columns = matrix[0].length;
        if(rows==1){
            return(binaryserch(matrix,target,0,columns-1,0));
        }

        int rstart =0;
        int rend= rows-1;
        int mid = columns/2;

        while(rstart<(rend-1)){
            int rmid = rstart+(rend-rstart)/2;
            if(matrix[rmid][mid]==target){
                return new int[]{rmid,mid};
            }else if(matrix[rmid][mid]>target){
                rstart =mid;
            }else{
                rend =mid;
            }
        }
       if(matrix[rstart][mid]==target){
           return new int[]{rstart,mid};
       }
       if(matrix[rstart+1][mid]==target){
           return new int[]{rstart+1,mid};
       }

       if(matrix[rstart][mid-1]>target){
           return binaryserch(matrix,target,0,mid-1,rstart);
       }
       if(matrix[rstart][mid+1]<target){
           return binaryserch(matrix,target,mid+1,columns-1,rstart);
       }
       if(matrix[rstart+1][mid-1]>target){
           return binaryserch(matrix,target,0,mid-1,rstart+1);

       }else{
           return binaryserch(matrix,target,mid+1,columns-1,rstart+1);
       }



    }
}
