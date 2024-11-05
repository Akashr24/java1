package pkg1;

import java.util.Scanner;
public class MatrixAddition1{
    public static void main(String[]args){
        int N=2;
        int[][] matrix1=new int[N][N];
        int[][] matrix2=new int[N][N];
        @SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
        System.out.println("enter the elements of first matrix :");
        for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
          matrix1[i][j]=scanner.nextInt();}}
        System.out.println("enter the elements of second matrix :");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
              matrix2[i][j]=scanner.nextInt();}}
for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
          System.out.print(matrix1[i][j]+matrix2[i][j]+"  ");}
System.out.println();}


}}
         