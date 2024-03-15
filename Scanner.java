import java.util.Scanner;
class Scanner
{
    public static void main (String [] args) 
{
		Scanner sc = new Scanner(System.in)  ;
                System.out.println("enter your name= ");
		String name= sc.next();
 		char ch = name.charAt(0);
		System.out.println("name is "+name+"and may first char is"+ch);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("character"+ch+"is a vowel");
		}
		else
		{
			System.out.println("charater"+ch+"is a consonent");
}
}
}