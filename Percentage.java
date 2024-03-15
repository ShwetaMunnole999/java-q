import java.util.Scanner;
class Percentage
{ 
  public static void main(String [] args)
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the percentage=");
   float per = sc.nextFloat();
   if(per>60)
   {
    System.out.println("eligible");
   }
   else
   {
    System.out.println("not eligible");
}
}
}