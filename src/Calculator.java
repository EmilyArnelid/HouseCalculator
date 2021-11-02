import java.util.Scanner;

public class Calculator {
    private static void createHome() {
        System.out.println("Vilken typ av boende väljer du? ");
        System.out.println("1. Hyresrätt");
        System.out.println("2. Bostadsrätt");
        System.out.println("3. Äganderätt");
        Scanner input = new Scanner(System.in);
        int houseTypes = input.nextInt();

        switch (houseTypes) {
            case 1:
                System.out.println("1. Hyresrätt");
                break;
            case 2:
                System.out.println("2. Bostadsrätt");
                break;
            case 3:
                System.out.println("3. Äganderätt");
                break;
            default:
                System.out.println("Välj en typ av boende!");


        }
    }
    public static void main(String[] args){
        createHome();
        System.out.print("Skriv in månadshyran: ");
       // Scanner input = new Scanner(System.in);

       // String monthlyRent = input.nextLine();

    }

}
