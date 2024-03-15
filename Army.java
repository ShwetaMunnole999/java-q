import java.util.Scanner;
class Army
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the age");
    int age = sc.nextInt();
    System.out.println("enter the height");
    float height = sc.nextFloat();
    System.out.println("enter the weight");
    int weight = sc.nextInt();
    if(age>=18)
    {
      System.out.println("able");
     }
     else if(height>=162)
     {
      System.out.println("eligble");
     }
     else if(weight>56)
     {
      System.out.println("eligible");
     }
     else 
       {
         System.out.println("not eligible");
        }
}
}
 