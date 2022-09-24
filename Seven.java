package First;

import java.util.Arrays;
import java.util.Scanner;

public class Seven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int k=0;k<n;k++)
			{
			arr[i][k]=sc.nextInt();
			}
			  			
		}
		int sum=0;
		for(int j=0;j<m;j++)
		{
			for(int l=0;l<n;l++)
			{
				if(arr[j][l]%2==0)
				{
					sum = sum+arr[j][l];
			    }
			}
			
		}
		System.out.print(sum);
		
	}

}