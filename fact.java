package inter;

import java.util.Scanner;

public class fact
{
	Scanner d=new Scanner(System.in);
	void meth1()
	{
		System.out.println("enter number");
		int n=d.nextInt();
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println(f);
	}
	public static void main(String[] args) {
		new fact().meth1();
	}
}
