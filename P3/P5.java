package P3;

class hp
{
	String name;
	int id;
	hp(String a,int b)
	{
		name=a;
		id=b;
	}
	hp()
	{
		name=null;
		id=0;
	}
	void display()
	{
		System.out.println("name is "+name+" and id is "+id);
	}
}
class hp1 extends hp
{
	int age;
	long phno;
	hp1(int a,int b)
	{
		age=a;
		phno=b;
	}
	hp1()
	{
		name=null;
		id=0;
		age=0;
		phno=0;
	}
	void display()
	{
		System.out.println("age is "+age+" and phno is "+phno);
	}
}

public class P5 {

	public static void main(String[] args) {
		hp m=new hp("amith",01);
		m.display();
		hp1 s=new hp1(21,9876543);
		s.display();
		

	}
	
}
