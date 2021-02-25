package pattern.Example;

public class M {
public static void main(String[] args) {
	int s =0;
	for(int row=1;row<=4;row++)
	{
		for(int col=4;col>=row;col--)
		{
			System.out.print("*");
		}
		for(int gap=s;gap>=1;gap--)
		{
			System.out.print(" ");
		}
		s=s+2;
		for(int col2=4;col2>=row;col2--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	int g=4;
	for(int row=1;row<=3;row++)
	{
		for(int col=0;col<=row;col++)
		{
			System.out.print("*");
		}
		for(int gap=g;gap>=1;gap--)
		{
			System.out.print(" ");
		}
		g=g-2;
		for(int col2=0;col2<=row;col2++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
