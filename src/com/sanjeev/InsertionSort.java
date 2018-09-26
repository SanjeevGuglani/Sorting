package com.sanjeev;

import java.util.Arrays;

/**
 * Created by Sanjeev Guglani
 */
public class InsertionSort {
    public static void insert(int arr[])
    {
        for(int i=0;i<arr.length-1;i++){
            int j=i+1;
            int temp = arr[j];
            while(j>0 && temp<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
    }

    public static void main(String[] args) {
        int arr[]=new int[]{5,4,3,2,1};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }
}
