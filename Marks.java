import java.util.Scanner;
class Marks
{ 
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the marks");
    float mark = sc.nextFloat();
    if(mark>90)
	{
	 System.out.println("first class with distiction");
	}
	else if(mark<75 && mark>75)
        {
         System.out.println("first class");
         }
         else
         {
          System.out.println(" second class");
       }
}
}	