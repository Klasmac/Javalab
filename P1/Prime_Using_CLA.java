package P1;
import java.util.Scanner;
public class Prime_Using_CLA {

	public static void main(String[] args) 
	{
		int n,i;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		for(i=2;i<=n/2;++i)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(n+ "is prime number");
		}
			else
			{
				System.out.println(n+ "is not prime number");
		}

	}

}
