package com.stackroute.pe3;

import java.util.Scanner;

public class AddMatrices {
    private int m,n;
    private int[][] matrix1;
    private int[][] matrix2;
    private int[][] result;
    private Scanner sc = new Scanner(System.in);

    public void setM() {
        System.out.println("Enter value  of rows in matrix:");
        this.m = sc.nextInt();
    }

    public void setN() {
        System.out.println("Enter value  of columns in matrix:");
        this.n = sc.nextInt();
    }
    public void addMatrices(){

        matrix1 =new int[m][n];
        matrix2 =new int[m][n];
        result =new int[m][n];
        System.out.println("enter the elements of matrix 1:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the elements of matrix 2:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum of the matrices  is:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                result[i][j] = matrix1[i][j]+matrix2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        AddMatrices obj = new AddMatrices();
        obj.setM();
        obj.setN();
        obj.addMatrices();
    }

}
