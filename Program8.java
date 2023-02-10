package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Program8 {
    public void insertionSort(int arr[],int n){
        int i=1;
        while(i<n){
            while(i>0){
                if(arr[i-1]>arr[i]){
                    int temp=arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=temp;
                }else{
                    break;
                }
                i--;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        Program8 prgm=new Program8();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of Elements:");
        int n=s.nextInt();
        System.out.print("Enter the List:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        s.close();
        prgm.insertionSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
