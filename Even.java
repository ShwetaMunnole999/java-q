import java.util.Scanner;
class Even
{ 
 public static void main (String [] args)
{
 Scanner sc = new Scanner(System.in);
 System.out.println ("enter the number");
 int num = sc.nextInt();
 if(num>0)
 {
  System.out.println("num is even");
  }
else
  {
   System.out.println("num is odd");
  }
}
}