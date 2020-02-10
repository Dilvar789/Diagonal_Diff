import java.util.*;
public class Diagonal_Diff 
{ 
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=3;
		int arr[][]= {{11, 2, 4}, 
	            {4 , 5, 6}, 
	            {10, 8, -12}  };
		int sum=0,sum1=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					sum+=arr[i][j];
					System.out.println("D1_Values="+arr[i][j]);
				}
				if (i == n - j - 1) 
                    sum1 += arr[i][j];
				System.out.println("D2_Values="+arr[i][j]);
			}
		}
		System.out.println(Math.abs(sum-sum1));
		sc.close();
	}

}
