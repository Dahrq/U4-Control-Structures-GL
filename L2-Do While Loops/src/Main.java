import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
       /*int number = 1;

        do{
            System.out.println(number);
            number++;
        }while(number < 10);*/

       /* int number = 10;

        do{
            System.out.println(number);
            number--;
        }while(number > 0);*/

        /*int number = 1;

        do{
            System.out.println(number);
            number+=3;
        }while(number<30);*/

        /*int number;
        Random rand = new Random();

        do{
            number = rand.nextInt(19)+1;
        }while(number%2 == 0);

        System.out.println(number);*/

        String password = "chicken nugget";

        Scanner read = new Scanner(System.in);

        String userInput;

        do{
            System.out.println("Please enter your password");
            userInput = read.nextLine();
        }while(!userInput.equals(password));

    }
}
