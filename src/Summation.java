
import java.util.Scanner;

public class Summation {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        String input;


        while (!(input = scanner.nextLine()).equals("ENTER")) {

            sum = sum + Integer.parseInt(input);

        }

        System.out.println(sum);


    }


}



