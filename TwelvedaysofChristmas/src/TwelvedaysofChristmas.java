import java.util.Scanner;

public class TwelvedaysofChristmas {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to twelve days!");

        int increment = 1;

        while (increment < 12) {

            System.out.println("Enter a name");
        String name = scanner.nextLine();

        System.out.println("Enter a present");
           String present = scanner.nextLine();

            System.out.println("Enter a day");
        int day = scanner.nextInt();

        System.out.println("On the" + day + "day of Christmas," +name+ "gave to me" +day+ " "+present);
            increment++;

        if (increment == 12){

            System.out.println("The Twelve days are over! Merry Christmas Girls Who Code.");
        }





        }
    }
}
