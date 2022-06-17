package com.company;

import java.util.Scanner;

public class CH_06_PS_QUESTIONS {
    public static void main(String[] args) {
//QUESTION 01:
//        System.out.println("To fid the sum of the array");
//        float arr[]={2.9f,23.0f,19.0f,009.0f};
//        float sum=0;
//        for(float element:arr){
//            sum=sum+element;
//        }
//        System.out.println("The vlue of sum of array is:");
//        System.out.println(sum);

//QUESTION 02:
//        System.out.println("To search the element in array");
//        int arr[]={21,45,32,77,1499,100};
//        Scanner S=new Scanner(System.in);
//        System.out.println("Enter the number you want to search");
//        int num=S.nextInt();
//        boolean isInArray= false;
//        for(int element:arr){
//            if(element==num){
//                isInArray =true;
//                break;
//            }
//        }
//        if(isInArray){
//            System.out.println("The value is present in array.");
//        }
//        else {
//            System.out.println("The value is not present in array");
//        }


////QUESTION 03:
//        System.out.println("To find the average marks of physics  in the array");
//        float arr[]={2.9f,23.0f,19.0f,9.0f};
//        float sum=0;
//        for(float marks:arr){
//            sum=sum+marks;
//        }
//        System.out.println(sum);
//        float avg=(sum)/arr.length;
//        System.out.println("The average of the marks of all the students in physics are: "+ avg);

//QUESTION 04:
//        System.out.println("To find the sum of the 2d array");
//        int arr1[][]={{12,45,33},
//                {23,55,43}};
//        int arr2[][]={{92,15,37},
//                {3,5,40}};
//        int result[][]={{0,0,0},
//                {0,0,0}};
//        for (int i=0; i<arr1.length;i++){
//            for (int j=0;j<arr1[i].length;j++){
//                result[i][j]=arr1[i][j]+arr2[i][j];
//                System.out.print(result[i][j]+" ");
//            }
//        }

//QUESTION 05:
 // Process 1:
        System.out.println("To reverse the array:");
        int [] arr = {12, 34, 55, -1,-89, 11, 2};
        int l= arr.length;
        int n=Math.floorDiv(l,2);
        int temp;
        for (int i=0;i<n;i++) {
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }
        for (int ele:arr){
            System.out.print(ele+" ");
        }
//Process 2:
//        System.out.println("The original array is: ");
//        int arr[] = {12, 34, 55, -1,-89, 11, 02};
//        for (int i = 0; i <= arr.length-1; i++) {
//            System.out.print(arr[i] + " ");
//        }
//            System.out.println("\n\nTo print the array in reverse way");
//            for (int i = arr.length - 1; i >= 0; i--) {
//                System.out.print(arr[i] + " ");
//            }

//QUESTION 06:
//        System.out.println("To find the maximum element in the array:\n");
//        int arr[] = {12, 34, 55, 89, 11, 02};
//        int max=0;
//        for(int element:arr){
//            if (element>max){
//                max=element;
//            }
//        }
//        System.out.println("The maximum element in an array is " + max);


//QUESTION 07:
//        System.out.println("To find the minimum element in the array:\n");
//        int arr[] = {12, 34, 55, 89, 11, 02,-1,0};
//        int min= arr.length;
//        for(int element:arr){
//            if (element<min){
//                min=element;
//            }
//        }
//        System.out.println("The minimum element in an array is " + min);

////QUESTION 08:
//        System.out.println("\nTo check whether the array is sorted or not:\n");
//        int arr[] = {12, 34, 55, 89, 11, 2,-1,0};
//        boolean isSorted=true;
//        for(int i=0;i< arr.length-1;i++){
//            if (arr[i]>arr[i+1]){
//                isSorted=false;
//            }
//        }
//        if (isSorted){
//            System.out.println("The array is sorted");
//        }
//        else {
//            System.out.println("The array is not sorted");
//
//        }
    }
    }

