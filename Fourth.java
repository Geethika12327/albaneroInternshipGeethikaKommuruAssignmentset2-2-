package First;

import java.util.Arrays;
import java.util.Scanner;

public class Fourth {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{			
			arr[i]=sc.nextInt();		
		}
		int count = 0,sum=0;
		for(int j=0;j<n;j++)
		{
			if(arr[j]>0)
			{
				count++;
			}
			if(arr[j]<=0)
			{
				sum=sum+arr[j];
			}
		}
		System.out.print("["+count+", "+sum+"]");
		
	}

}
