package P3;

class measure
{
	int l;
	int b;
	measure()
	{
		l=0;
		b=0;
	}
	measure(int a,int b)
	{
		l=a;
		b=b;
	}
	measure(int a)
	{
		l=a;
		b=0;
	}
	void display()
	{
		System.out.println(+l+b);
	}
}
class add
{
int l,b;
add(int a,int b)
{
	l=a;
	b=b;
}
void display()
{
	System.out.println(+l+b);
}
	
	
}

public class P4 {
 

	public static void main(String[] args) {
        measure m=new measure(5,6);
        m.display();

	}
	
}
