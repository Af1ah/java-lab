import java.util.Scanner;
public class matrix
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m[][]=new int[2][2];
		int trace=0;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				m[i][j]=sc.nextInt();
				if(i==j)
				{
					trace += m[i][j];
				}
			}
		}
		System.out.println("Trace:" + trace);
		System.out.println("Transpose:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(m[j][i] + "");
			}
			System.out.println();
			
		}
		sc.close();
		
	}
	
}
