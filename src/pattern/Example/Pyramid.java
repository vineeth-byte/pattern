package pattern.Example;

public class Pyramid {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=4;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		for(int s=1;s<i;s++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
	 

}
