package com.learn.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main instance = new Main();
        int[] input1 = {20, 35, -15, 7, 55, 1, -22};
        instance.bubbleSort(input1);
        System.out.println("bubbleSort: " + Arrays.toString(input1));

        int[] input2 = {20, 35, -15, 7, 55, 1, -22};
        instance.selectionSort(input2);
        System.out.println("selectionSort: " + Arrays.toString(input2));

        int[] input3 = {20, 35, -15, 7, 55, 1, -22};
        instance.insertionSort(input3);
        System.out.println("insertionSort: " + Arrays.toString(input3));

        int[] input4 = {20, 35, -15, 7, 55, 1, -22};
        instance.shellSort(input4);
        System.out.println("shellSort: " + Arrays.toString(input4));

        int[] input5 = {20, 35, -15, 7, 55, 1, -22};
        instance.mergeSort(input5, 0, input5.length);
        System.out.println("mergeSort: " + Arrays.toString(input5));

        int[] input6 = {20, 35, -15, 7, 55, 1, -22};
        instance.quickSort(input6, 0, input6.length);
        System.out.println("quickSort: " + Arrays.toString(input6));

        int[] input7 = {4, 2, 2, 1, 8, 7, 8, 10, 2, 3, 5};
        instance.countingSort(input7, 1, 10);
        System.out.println("countingSort: " + Arrays.toString(input7));

        int[] input8 = {4356, 1234, 7368, 3453, 2345, 5677, 4536};
        instance.radixSort(input8, 4, 10);
        System.out.println("radixSort: " + Arrays.toString(input8));

        int[] input9 = {-22, -15, 1, 7, 20, 35, 55};
        int key = instance.binarySearch(input9, 1);
        System.out.println("key binary search recursive: " + key);
        int key1 = instance.binarySearchIterative(input9, 0);
        System.out.println("key binary search iterative: " + key1);

        int[] input10 = {54, 46, 83, 66, 95, 92, 43};
        instance.bucketSort(input10, 10, Integer.toString(input10[0]).length()-1);
        System.out.println("bucketSort: " + Arrays.toString(input10));

    }

    // {20, 35, -15, 7, 55, 1, -22}
    // 20 35 -15 7 -22 1 55
    // 20 1 -15 7 -22 35 55
    //-22 -15 1 7 20 35 55
    public void bubbleSort(int[] arr) {
        for(int i=arr.length-1; i >= 1; i--){
            for(int j=0; j < i; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    // {20, 35, -15, 7, 55, 1, -22}
    public void selectionSort(int[] arr) {
        for(int i=arr.length-1; i>0; i--) {
            int largest=0;
            for(int j=1; j<=i; j++) {
                if(arr[j] > arr[largest]) {
                    largest = j;
                }
            }
            swap(arr, largest, i);
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // {20, 35, -15, 7, 55, 1, -22}
    public void insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int value=arr[i], j;
            for(j=i; j>0 && arr[j-1]>value; j--) {
                arr[j]=arr[j-1];
            }
            arr[j] = value;
        }
    }

    // {20, 35, -15, 7, 55, 1, -22}
    public void shellSort(int[] arr) {
        for(int gap=arr.length/2; gap>0; gap/=2) {
            for(int i=gap; i<arr.length; i+=gap) {
                int value=arr[i], j;
                for(j=i; j>0 && arr[j-gap]>value; j-=gap) {
                    arr[j] = arr[j-gap];
                }
                arr[j] = value;
            }
        }
    }
    // {20, 35, -15, 7, 55, 1, -22} [32, 36] [33, 34]
    //{-15, 20, 35, -22, 1, 7, 55}
    public void mergeSort(int[] input, int start, int end) {
        if((end-start)<2) {
            return;
        }
        int mid = (start+end)/2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    private void merge(int[] input, int start, int mid, int end) {
        if (input[mid-1] < input[mid]) {
            return;
        }
        int i=start, j = mid, tempIndex=0;
        int[] temp = new int[end-start];
        while(i<mid && j<end) {
            temp[tempIndex++] = input[i]<=input[j] ? input[i++] : input[j++];
        }
        System.arraycopy(input, i, input, start+tempIndex, mid-i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }

    // {20, 35, -15, 7, 55, 1, -22}
    // -22 -15 1 7 20 55 35
    public void quickSort(int[] input, int start, int end) {

    }

    private int partition(int[] input, int start, int end) {
        return -1;
    }


    //{2, 5, 9, 8 ,2, 8, 7, 10, 4, 3, 7}
    //{4, 2, 2, 1, 8, 7, 8, 6, 2, 3, 5}
    public void countingSort(int[] input, int min, int max) {

    }

    //{4356, 1234, 7368, 3453, 2345, 5677, 4536}
    public void  radixSort(int[] input, int width, int radix) {

    }

    // 0 0 0 0 1 2 3 5 6 7

    // 3453 1234 2345 4356 4536 5677 7368
    private void radixSingleSort(int[] input, int position, int radix) {

    }

    private int getDigit(int value, int position, int radix) {
        return -1;
    }

    private int getIndex(String str, int position) {
        return -1;
    }
    //{54, 46, 83, 66, 95, 92, 43}
    public void bucketSort(int[] arr, int radix, int position) {

    }

    private int hashKey(int value, int radix, int position) {
        return -1;
    }
    public int binarySearch(int[] arr, int key) {
        return binarySearchRecursive(arr, key, 0, arr.length);
    }

    public int binarySearchRecursive(int[] arr, int key, int start, int end) {
        return -1;
    }

    public int binarySearchIterative(int[] arr, int key) {
        return -1;
    }

}