import java.util.Scanner;

public class Modulus
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub

				int x;

				Scanner userStringInput = new Scanner(System.in);
				System.out.println("What is your name?");
				String name = userStringInput.nextLine();
				System.out.println("Hello, " + name + "!");

				Scanner userIntInput = new Scanner(System.in);
				System.out.println("Please enter an integer number.");

				Scanner input = new Scanner(System.in);
				x = input.nextInt();

				if (x % 2 == 0)
					System.out.println("Number entered is Even.");
				else
					System.out.println("Number entered is odd.");

				input = new Scanner(System.in);
				System.out.println("Now, enter a year.");
				int year = input.nextInt();

				boolean leap = false;

				if (year % 400 == 0 || year % 4 == 0 && !(year % 100 == 0))
					{
						leap = true;
					}

				if (leap)
					{
						System.out.println(year + " is a leap year.");
					}

				else
					{
						System.out.println(year + " is not a leap year.");
					}

			}
	}
