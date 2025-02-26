
import java.util.Scanner;

public class AnimalPicker2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Type \"CAT\" to display a cat or \"DOG\" to display a dog." );

        boolean valid = false;

        while (!valid)
        {
            String catOrDog = input.nextLine();

            if (catOrDog.equalsIgnoreCase("CAT"))
            {
                System.out.println("|\\---/|\n| o_o |\n \\_^_/\n");
                valid = true;
            }
            else if (catOrDog.equalsIgnoreCase("DOG"))
            {
                System.out.println(",-.___,-.\n\\_/_ _\\_/\n  )O_O(\n { (_) }\n  `-^-\'  ");
                valid = true;
            }
            else
            {
                System.out.println("Error: Invalid Entry.\nNew Entry: ");
                valid = false;
            }
        }
    }
}
