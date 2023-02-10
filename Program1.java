package Assignments;

import java.util.Scanner;

public class Program1 {
    public void cost(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the money:");
        int m=s.nextInt();
        System.out.print("Enter the no of Elemets:");
        int n=s.nextInt();
        System.out.println("Enter the elements one by one");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int i=0;
        int j=n-1;
        while(i<j){
            int val=arr[i]+arr[j];
            if(val==m){
                System.out.printf("[%d ,%d]",arr[i],arr[j]);
            }
            i++;
            if(i==j){
                i=0;
                j--;
            }
        }
        s.close();
        // return (new int[]{-1,-1});
    }
    public static void main(String[] args) {
        Program1 prgm=new Program1();
        prgm.cost();
        // System.out.println(Arrays.toString(res));
    }
}