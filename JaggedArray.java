package arrays;
import java.util.Scanner;
public class JaggedArray {

	public static void main(String[] args) {
		int jag[][]= new int[3][];
		jag[0] = new int[3]; //row 1 columns 3
		jag[1] = new int[4]; //row 2 columns 4
		jag[2] = new int[2]; //row 3 columns 2
		
		//initializing the jagged array
		//int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements : ");
		for(int i=0;i<jag.length;i++)
		{
			for(int j=0;j<jag[i].length;j++)
			{
				//jag[i][j]=count++;
				jag[i][j] = sc.nextInt();
			}
		}
		sc.close();
         //printing jagged Array
		System.out.println("Jagged Array : ");
		for(int i=0;i<jag.length;i++)
		{
			for(int j=0;j<jag[i].length;j++)
			{
				System.out.print(jag[i][j]+" ");
			}
			System.out.println();
		}
	}

}
