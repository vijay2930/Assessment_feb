package Assignments;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Program6 prgm = new Program6();
        prgm.rotateClockWise();
    }

    public void rotateClockWise() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = s.nextInt();
        int mat[][] = new int[n][n];
        System.out.println("Enter the List : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = s.nextInt();
            }
            System.out.println();
        }
        s.close();
        transpose(mat, n);
        print(mat);
    }

    public void transpose(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        reverse(mat, n);
    }

    public void reverse(int[][] mat, int n) {
        int k,l;
        for (int i = 0; i < n; i++) {
            k=0;
            l=n-1;
            while (k < l) {
                int temp = mat[i][k];
                mat[i][k++] = mat[i][l];
                mat[i][l--] = temp;
            }
        }
    }

    public void print(int mat[][]) {
        for (int val[] : mat) {
            for (int v : val) {
                System.out.printf("%d ", v);
            }
            System.out.println();
        }
    }
}