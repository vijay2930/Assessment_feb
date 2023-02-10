package Assignments;

import java.util.Scanner;


public class Program9 {
    public void print(int n){
        int left=0;
        int right=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1)
                    System.out.print(1);
                else if((i>=2 && j>=2 )&&(i<=n-3 && j<=n-3)){
                    if(i==2 ||i==n-3 || j==2 || j==n-3)
                        System.out.print(1);
                    else if(j<left || j>right){
                        System.out.print(1);
                    }
                    else
                        System.out.print(0);
                }
                else
                    System.out.print(0);
            }
            if(i<n/2){
                left++;
                right--;
            }else{
                left--;
                right++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Program9 prgm=new Program9();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the n:");
        int n=s.nextInt();
        prgm.print(n);
        s.close();
    }
}
