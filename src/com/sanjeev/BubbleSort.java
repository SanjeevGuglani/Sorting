package com.sanjeev;

import java.util.Arrays;

/**
 * Created by Sanjeev Guglani
 */
public class BubbleSort {
    public static void bubble(int arr[])
    {
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]=new int[]{5,4,8,2,-1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
