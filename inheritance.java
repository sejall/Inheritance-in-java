import java.util.Scanner;
class A 
{
	private int x;
	A()
	{
		x=0;
	}
	A(int x1)
	{
		x=x1;
	}
	void setdata(int x1)
	{
		x=x1;
	}
	void getdata()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter value of x:");
		x= sc.nextInt();
	}
	void display()
	{
		System.out.print(x);
	}
	
}
class B extends A
{
	private int y;
	B()
	{
		super();
		y=0;
	}
	B( int x1, int y1)
	{
		super(x1);
		y=y1;
	}
	void setdata(int x1,int y1)
	{
		setdata(x1);
		y=y1;
	}
	void getdata()
	{
		super.getdata();
		Scanner sc = new Scanner (System.in);
		System.out.print(" enter value of y:");
		y= sc.nextInt();
	}
	void display()
	{
		super.display();
		System.out.println(","+y);
	}	
}
class ABTest
{
	public static void main(String args[])
	{
		B b1=new B();
		b1.setdata(5,10);
		b1.display();
		B b2= new B(5,10);
		b2.display();
		B b3= new B();
		b3.getdata();
		b3.display();
	}
}