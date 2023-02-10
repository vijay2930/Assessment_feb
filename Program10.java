package Assignments;

import java.util.Scanner;


public class Program10 {
    public void pairs(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of K: ");
        int k=s.nextInt();
        System.out.print("Enter the no of Elements: ");
        int n=s.nextInt();
        System.out.println("Enter the Elements one by one: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int i=0;
        int j=n-1;
        while(i<j){
            int val=arr[i]+arr[j];
            if(val%k==0){
                System.out.printf("[%d ,%d] ",arr[i],arr[j]);
            }
            i++;
            if(i==j){
                i=0;
                j--;
            }
        }
        s.close();
    }
    public static void main(String[] args) {
        Program10 prgm=new Program10();
        prgm.pairs();
    }
}
