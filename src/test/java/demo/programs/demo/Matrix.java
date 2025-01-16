package demo.programs.demo;

import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the matrix a size");
		int r=s.nextInt();
		int c=s.nextInt();
		System.out.println("Enter the matrix b size");
		int p=s.nextInt();
		int q=s.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[p][q];
		int x[][]=new int[c][p];
		if(c==p)
		{
			System.out.println("Matrix multiplication is possible");
			System.out.println("Enter the elements into matrix a");
			int i,j;
			for(i=0;i<c;i++)
			{
				for(j=0;j<c;j++)
				{
					a[i][j]=s.nextInt();
					
				}
			}
			System.out.println("The entered elements in matrix a are");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					System.out.println(a[i][j]+" ");
				}
				System.out.println();
			}
			for(i=0;i<c;i++)
			{
				for(j=0;j<p;j++)
				{
					x[i][j]=0;
					for(int k=0;k<p;k++)
					{
						x[i][j]=x[i][j]*b[k][j];
					}
				}
			}
			System.out.println("The resultant matrix c is");
			for(i=0;i<c;i++)
			{
				for(j=0;j<p;j++)
				{
					System.out.println(x[i][j]+" ");
				}
				System.out.println();
			}
		}
		else{
			System.out.println("Matrix multiplication is not possible");
		}
	}

}
