import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your Total: ");
        double initialTotal = scan.nextDouble();
        System.out.println("Choose a tip percentage AS A WHOLE #: ");
        double tipWholenumb = scan.nextDouble();
        System.out.println("How many people are in your party: ");
        int numbPeople = scan.nextInt();

        double tipPercent = (tipWholenumb / 100);
        double totaltipAmnt = (tipPercent * initialTotal);
        double totalwithTip = (totaltipAmnt + initialTotal);
        double tipperPerson = (totaltipAmnt / numbPeople);
        double totalperPerson = (totalwithTip / numbPeople);

        System.out.println("Your total tip ammount is $" + totaltipAmnt);
        System.out.println("Your total bill including tip is $" + totalwithTip);
        System.out.println("The total tip paid per person should be $" + tipperPerson);
        System.out.println("The total paid per person should be $" + totalperPerson);
        System.out.println("Thank you for eating at our restaraunt!");
    }
}
