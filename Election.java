import java.util.Scanner;
class Election
{ 
	publiv static void main(String [] args)
	{
		Scanner sc = new Scanner();
		System.out.println("enter your age");
		int age = sc.nextInt();'
		if(age>18)
		{
			System.out.println("do u have voter id(yes/no);");
			String voterId = sc.next().toLowerCase();
			if(votreId.equals("yes"))
			{
				System.out.println("welcome");
				System.out.println("BJP");
				System.out.println("AAP");
                                System.out.println("MNS");
				System.out.println("NOTA");
                              
				System.out.println("enter the option");
				String vote = sc.nect().toUpperCase();
				if(vote.equals("BJP")){
				System.out.println("you have voted for bjp");
				else if(vote.equals("AAP")){
				System.out.println("you have voted for AAP");
				else if(vote.equals("NOTA")){
				System.out.println("you have voted for NOTA");
				else
                                    {
				       System.out.println("invalid input");
				     }
			}
