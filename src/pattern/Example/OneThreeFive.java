package pattern.Example;

public class OneThreeFive {
	public static void main(String[] args) {
		int x = 1;
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(x);
			}
			for(int l=1;l<i;l++)
			{
				System.out.print(x);
			}
			System.out.println();
			x=x+2;
		}
	}

}
