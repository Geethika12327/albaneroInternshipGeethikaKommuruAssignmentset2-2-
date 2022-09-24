package First;

import java.util.Arrays;
import java.util.Scanner;

public class second {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			
			arr[i]=sc.nextInt();
			
			  			
		}
		System.out.print("[");
		for(int j=0;j<n;j++)
		{
			if(j!=n-1)
			System.out.print(arr[j]+", ");
			if(j==n-1)
			{
				System.out.print(arr[j]);
			}
		}
		System.out.print("]");
		System.out.println();
		Arrays.sort(arr);
		
		System.out.print("[");
		for(int j=0;j<n;j++)
		{
			if(j!=n-1)
				System.out.print(arr[j]+", ");
				if(j==n-1)
				{
					System.out.print(arr[j]);
				}
		}
		System.out.print("]");
	}

}
