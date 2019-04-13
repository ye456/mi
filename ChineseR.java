import java.util.Scanner;  
public class ChineseR
 
{	
	int [] a = new int[10];
	int [] m = new int[10];

	int [] y = new int[10];
	int [] z = new int[10];
	int X;
	int n;
	public int FindY(int m, int z, int y)
	{
		int i = 1;
		
		y = z % m;
		
		while( y * i < m )
		{
			i++;
			if( (y*i)%m == 1 )
			{
				y = i;
				break;
			}
		}		
		return y;
	}
	
	public void FindRem()
	{
		int M,i;
		
		//Calculating M
		M = 1;
		for(i=0;i<n;i++)
		{
			M = M * m[i];
		}
		System.out.println("\nValue of M = "+M);
		
		//calculating Z
		System.out.println("\n\nValues of Z");
		for(i=0;i<n;i++)
		{
			z[i] = M / m[i];
			System.out.println("\n Z["+(i+1)+"] = " +z[i]);
		}
		
		//calculating Y
		System.out.println("\n\nValues of Y");
		for(i=0;i<n;i++)
		{
			y[i] = FindY(m[i],z[i],y[i]);
			System.out.println("\n Y["+(i+1)+"] = " +y[i]);
		}
		
		//calculating X
		X=0;
		for(i=0;i<n;i++)
		{
			X = X + (a[i]*y[i]*z[i]);  
		}
		X = X % M;
		System.out.println("\n\n");
		System.out.println("Value of X = " +X);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChineseR ch = new ChineseR();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total numbers (count) ");
		ch.n = sc.nextInt();
		
		int i;
		System.out.println("Enter array a and m of size "+ch.n+" each");
		for(i=0;i<ch.n;i++)
		{
			System.out.print("a["+(i+1)+"] = ");
			ch.a[i] = sc.nextInt();
		}
		System.out.println();
		for(i=0;i<ch.n;i++)
		{
			System.out.print("m["+(i+1)+"] = ");
			ch.m[i] = sc.nextInt();
		}
		sc.close();
		ch.FindRem();
	}
}