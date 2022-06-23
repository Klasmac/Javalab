package P1;
import java.util.Scanner;
public class Temp_Conv {

	public static void main(String[] args) {
		float f,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the fahrenite");
		f=sc.nextFloat();
		c=(f-32)*5/9;
		System.out.println("fahrenite to celisius"+c);

	}

}
