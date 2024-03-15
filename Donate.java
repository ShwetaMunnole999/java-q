import java.util.Scanner;
 class Donate
{
  public static void main(String [] args )
	{
	  Scanner sc = new Scanner(System.in);
	 System.out.println("enter the age");	
         int age = sc.nextInt();
         if(age>20)
         {
           System.out.println(" you have drink or cigrate(yes/no):");
           String drink = sc.next();
           if(drink.equals("no"))
		{
			System.out.println("you can donate");
                 else
		{
			System.out.println("you can't donate);
                 }
}
}