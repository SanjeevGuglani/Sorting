package com.sanjeev;

import java.util.Arrays;

/**
 * Created by Sanjeev Guglani
 */

//Select minimum from Array
public class SelectionSort {

    public static void selection(int arr[])
    {
        int temp,temp2;
        for(int i=0;i<arr.length-1;i++){
            temp = i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[temp]){
                    temp =j;
                }
            }
            temp2 = arr[i];
            arr[i]=arr[temp];
            arr[temp]=temp2;
        }
    }

    public static void main(String[] args) {
        int arr[]=new int[]{5,4,8,2,-1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
