import java.util.Scanner;
class Addition
{
 	public static void main(String [] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enater num=");
			int num1 = sc.nextInt();
			System.out.println("enater num=");
			int num2 = sc.nextInt();
			int add = num1+num2;
			System.out.println("addition is="+add);
		}
}