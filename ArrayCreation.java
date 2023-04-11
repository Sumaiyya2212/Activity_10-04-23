package arrays;
import java.util.Scanner;
public class ArrayCreation {

	public static void main(String[] args) {
		//create array at compile time
		int arr[] = {2,3,4,5,6};
		
		System.out.println(arr[2]);
		
		//print the array elements using for loop
		for(int i=0;i<5;i++)
		{
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		//create array at run time
		int arr1[] = new int[5];
		System.out.println("Enter the elements : ");
		
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
		}
		//print the array elements using for loop
		System.out.println("printing using For Loop");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		System.out.println();
		System.out.println("Printing using For-each Loop : ");
		for(int element:arr1)
		{
		     System.out.print(element+" ");
		}
		sc.close();
	}

}
