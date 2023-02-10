package Assignments;

import java.util.Scanner;

public class Program2 {
    public void sort(int nums[],String str[],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    String s=str[j];
                    str[j]=str[j+1];
                    str[j+1]=s;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of Element:");
        int n=s.nextInt();
        System.out.println("Enter the elements:");
        int nums[]=new int[n];
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            nums[i]=s.nextInt();
            str[i]=s.nextLine();
        }
        s.close();
        for(int i=0;i<n/2;i++){
            str[i]="-";
        }
        Program2 prgm=new Program2();
        prgm.sort(nums, str,n);
        for(int i=0;i<n;i++){
            if(str[i].equals("-"))
                System.out.print(str[i]);
            else
                System.out.printf("%s ",str[i].strip());
        }
    }
}
