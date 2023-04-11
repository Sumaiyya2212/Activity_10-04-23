package arrays;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		//Compile time initialization
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<3;i++)//row
		{
			for(int j=0;j<3;j++)//column
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
        Scanner sc = new Scanner(System.in);
        //getting the number of rows and columns from the user
        System.out.println("Enter the no. of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter no. of columns : ");
        int col = sc.nextInt();
        int a[][]= new int[row][col];
        
        System.out.println("Enter elements of 2D Array: ");
        for(int i=0;i<row;i++)//row
		{
			for(int j=0;j<col;j++)//column
			{
				a[i][j] = sc.nextInt();
			}
			System.out.println();
		}
        
        
        for(int i=0;i<row;i++)//row
		{
			for(int j=0;j<col;j++)//column
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
        sc.close();
        Class c = arr.getClass(); // getting class of an  array
        System.out.println("Class Name :"+c.getName());
        

	}

}
