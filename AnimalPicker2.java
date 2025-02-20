
import java.util.Scanner;

public class AnimalPicker2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Type \"CAT\" to display a cat or \"DOG\" to display a dog." );

        String catOrDog = input.nextLine();

        if (catOrDog.equalsIgnoreCase("CAT"))
        {
            System.out.println("DISPLAY CAT ASCII HERE.");
        }
        else if (catOrDog.equalsIgnoreCase("DOG"))
        {
            System.out.println("DISPLAY DOG ASCII HERE.");
        }
        else 
        {
            System.out.println("Please enter either \"CAT\" or \"DOG\".");
        }
    }
}
