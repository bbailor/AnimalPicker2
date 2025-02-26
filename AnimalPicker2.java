
import java.util.Scanner;

public class AnimalPicker2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Type \"CAT\" to display a cat, \"DOG\" to display a dog, or \"FISH\" to display a fish." );

        boolean valid = false;

        while (!valid)
        {
            String animal = input.nextLine();

            if (animal.equalsIgnoreCase("CAT"))
            {
                System.out.println("|\\---/|\n| o_o |\n \\_^_/\n");
                valid = true;
            }
            else if (animal.equalsIgnoreCase("DOG"))
            {
                System.out.println(",-.___,-.\n\\_/_ _\\_/\n  )O_O(\n { (_) }\n  `-^-\'  ");
                valid = true;
            }
            else if (animal.equalsIgnoreCase("FISH"))
            {
                System.out.println("|\\   \\\\\\\\__     o\n| \\_/    o \\    o \n> _   (( <_  oo  \n| / \\__+___/      \n|/     |/");
                System.out.println("\n    ><((((°> \n    <°))))>< \n");
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
