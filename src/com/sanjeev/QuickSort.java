package com.sanjeev;

import java.util.Arrays;

/**
 * Created by Sanjeev Guglani
 */
public class QuickSort {

        public static void quickSort(int[] input) {
            quickSort(input,0,input.length-1);
        }

        public static void quickSort(int[] input,int si,int ei) {
            if(si>=ei){
                return;
            }
            int p = partition(input,si,ei);
            quickSort(input,si,p-1);
            quickSort(input,p+1,ei);
        }

        public static int partition(int arr[],int si,int ei){
            int pivot = arr[si];
            int low_count=0;
            for(int i=si+1;i<=ei;i++){
                if(pivot>=arr[i]){
                    low_count++;
                }
            }
            //swap pivot and pivot actual location
            arr[si]=arr[si+low_count];
            arr[si+low_count]=pivot;
            pivot = si +low_count;
            for(int i=si,j=ei;i<pivot && j>pivot;i++,j--){
                while(arr[i]<=arr[pivot]){
                    i++;
                }
                while(arr[j]>arr[pivot]){
                    j--;
                }
                if(i<j){
                    int temp=arr[j];
                    arr[j] =arr[i];
                    arr[i] =temp;

                }
            }
            return pivot;
        }

    public static void main(String[] args) {
        int arr[]={4,4,2,3,6,5};
            quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
