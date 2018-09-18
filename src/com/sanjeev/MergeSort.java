package com.sanjeev;

import java.util.Arrays;

/**
 * Created by Sanjeev Guglani
 */
public class MergeSort {
    public static void mergeSort(int[] input){
        mergeSort(input,0,input.length-1);
    }

    public static void mergeSort(int[] input,int start,int end){
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(input,0,mid);
        mergeSort(input,mid+1,end);
        merge(input,start,mid,end);
    }

    private static void merge(int arr[],int start,int mid,int end){
        int temp[]=new int[end-start+1];
        int res;
        int right=mid+1;
        int left=start;
       for(int i=0;i<temp.length;i++) {
           if (start <= mid && right <= end) {
               if (arr[start] < arr[right]) {
                   res = arr[start];
                   start++;
               } else {
                   res = arr[right];
                   right++;
               }
           } else if (start > mid) {
               res = arr[right];
               right++;
           } else {
               res = arr[start];
               start++;
           }
           temp[i] = res;
       }
        System.arraycopy(temp,0,arr,left,temp.length);
    }

    public static void main(String[] args) {
        int arr[]={4,4,2,3,6,5};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
