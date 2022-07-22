public class binarysearchgreatestsmallno {
    public static void main(String[]args){
        int []arr = {3,4,5,6,7,9,10,11};
        int target = 4;
        System.out.println(gsno(target,arr));
    }
    static int gsno(int target, int [] arr){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid =(start+end)-start/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end =mid-1;
            }else{
                start =mid+1;
            }
        }
        return start;
    }
}
