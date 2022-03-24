package com.company;

public class SelectionSort {
    void sort(int arr[]){
        int temp=0;
        int n = arr.length;
        for(int i=0;i< arr.length;i++){
            for(int j =i+1;j<n;j++){
                if (arr[j]<arr[i])
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    void showArray(int arr[]){
        int n = arr.length;
        for (int i =0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
