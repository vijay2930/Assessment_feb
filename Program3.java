package Assignments;

import java.util.Scanner;

public class Program3 {
    public int warnings(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value n:");
        int n=s.nextInt();
        System.out.println("Enter the value d:");
        int d=s.nextInt();
        System.out.println("Enter the list:");
        int arr[]=new int[n];
        float median=0;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            if(i<d){
                median+=arr[i];
            }
        }
        median=(median/d)*2;
        int count=0;
        for(int i=d;i<n;i++){
            if(arr[i]>=median)
                count++;
        }
        s.close();
        return count;
    }
    public static void main(String[] args) {
        Program3 prgm=new Program3();
        System.out.println(prgm.warnings());
        
    }
}
