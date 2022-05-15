import com.sun.source.doctree.StartElementTree;

import java.util.ArrayList;
import java.util.Arrays;

public class prac {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(insertionsort(arr)));

    }

    public static int[] insertionsort(int[]arr){
        int n =arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                }else{
                    break;
                }
            }
        }
        return arr;
    }

    public static int[] selectionsort(int[] arr){
       for(int i=0; i<arr.length; i++){
           int last = arr.length-i-1;
           int maxindex= findingmax(arr,0,last);

       }
       return arr;
    }
    public static int[] swap(int []arr, int start, int end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        return arr;
    }
    public static int findingmax(int[]arr,int start, int last){
        int max=start;
        for(int i=start; i<=last; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    public static int[] bubblesort(int[] arr){
        boolean swapped= false;
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }
    public static int[] findingmatrix(int [][]arr, int target){
        int start =0;
        int end = arr.length-1;
        while(start<arr.length && end>=0){
             if(arr[start][end]==target){
                 return new int []{start,end};
             }else if(arr[start][end]>target){
                 end--;
             }else{
                 start++;
             }
        }
        return new int[] {-1,-1};
    }
    public static int findingmaxsum(int []arr,int start ,int end,int sum,int m){
        int mid = start+(end-start)/2;
        int pieces =1;
        while(start<=end){
            for(int i=0; i<arr.length; i++){
                 if(sum+arr[i]>mid){
                     sum=arr[i];
                     pieces++;
                 }else{
                     sum+=arr[i];
                 }
            }
            if(pieces>m){
                start=mid+1;
            }else{
                end = mid-1;
            }
        }
        return end;
    }
    public static int findingpeak(int [] arr, int start, int end){

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
            return mid;
            }
            if(arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(arr[start]>arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static int solution(int[] arr,int target,int sta,int  en){


        while (sta <= en) {
            int mid = sta + (en - sta) / 2;
            if(arr[mid]==target){
                return mid;
            }
            if (arr[mid] > target) {
                en = mid - 1;
            }else {
                sta = mid + 1;
            }

        }
        return -1;

    }
}

