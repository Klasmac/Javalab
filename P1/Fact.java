package P1;
import java.util.Scanner;
public class Fact {

	public static void main(String[] args) {
		int n,i;
		long fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number\n");
		n=sc.nextInt();
			for(i=1;i<=n;i++)
			{
				fact=fact*i;
				
			}
			System.out.println("the factorial: \n"+fact);
	}

}
