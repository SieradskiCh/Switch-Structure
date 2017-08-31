import java.util.Scanner;
public class SwitchStructure
	{
//hi
	public static void main(String[] args)
		{
		generateNumber();
		rollMagicBall();
		}
	private static void generateNumber()
		{
		int randomNumber = (int) ((Math.random() * 20) + 1);
		System.out.println("Your number is " + randomNumber);
		switch (randomNumber)
			{
			case 1:
			case 2:
			case 4:
			case 5:
			case 6:
			case 10:
			case 12:
			case 14:
			case 18:
			case 20:
				{
				System.out.println("You win!");
				break;
				}
			case 8:
			case 16:
				{
				System.out.println("You lose!");
				break;
				}
			case 3:
			case 7:
			case 9:
			case 11:
			case 15:
			case 17:
			case 19:
				{
				System.out.println("You tied with the computer!");
				break;
				}
			}
		}
	private static void rollMagicBall()
		{
		System.out.println("What do you want to know?");
		Scanner userInput = new Scanner (System.in);
		String worthless = userInput.nextLine();
		int randomNumber = (int) ((Math.random() * 20) + 1);
		switch (randomNumber)
			{
			case 1:
				{
				System.out.println("It is certain");
				break;
				}
			case 2:
				{
				System.out.println("It is decidedly so");
				break;
				}
			case 3:
				{
				System.out.println("Without a doubt");
				break;
				}
			case 4:
				{
				System.out.println("Yes definitely");
				break;
				}
			case 5:
				{
				System.out.println("You may rely on it");
				break;
				}
			case 6: 
				{
				System.out.println("As I see it, yes");
				break;
				}
			case 7:
				{
				System.out.println("Most likely");
				break;
				}
			case 8:
				{
				System.out.println("Outlook good");
				break;
				}
			case 9:
				{
				System.out.println("Yes");
				break;
				}
			case 10:
				{
				System.out.println("Reply hazy try again");
				break;
				}
			case 11:
				{
				System.out.println("Ask again later");
				break;
				}
			case 12:
				{
				System.out.println("Better not tell you now");
				break;
				}
			case 13:
				{
				System.out.println("Cannot predict now");
				break;
				}
			case 14:
				{
				System.out.println("Concentrate and ask again");
				break;
				}
			case 15:
				{
				System.out.println("Don't count on it");
				break;
				}
			case 16:
				{
				System.out.println("My reply is no");
				break;
				}
			case 17:
				{
				System.out.println("My sources say no");
				break;
				}
			case 18:
				{
				System.out.println("Outlook not so good");
				break;
				}
			case 19:
				{
				System.out.println("Very doubtful");
				}
			case 20:
				{
				System.out.println("Signs point to yes");
				}
			}
		}
	}
