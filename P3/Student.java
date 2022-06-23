package P3;
import java.util.Scanner;
class student 
{
	String usn;
	String name;
	String branch;
	int phno;
	
	void insertrecord(String reg,String name,String branch,int ph)
	{
		usn=reg;
		name=name;
		branch=branch;
		phno=ph;
	}
	
	void display()
	{
		System.out.println(usn+""+name+""+branch+""+phno);
	}
}
public class Student {
	public static void main(String[] args)
	{
		student s[]=new student[100];
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("enter the number of students");
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
				s[i]=new student();
				for(int j=0;j<n;j++)
				{
					System.out.println("enter the usn,name,branch,phno");
					String usn=sc.next();
					String name=sc.next();
					String branch=sc.next();
					int phno=sc.nextInt();
					
					s[j].insertrecord(usn,name,branch,phno);
					
				}
				for(int m=0;m<n;m++)
				{
					s[m].display();
				}
		}
	}
}
