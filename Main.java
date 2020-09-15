import java.util.Scanner;
/**
 * The program sorts the users two numbers by smallest to largest
 * @author Thomas Quigley
 */
public class Main {


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // gets and stores the users two numbers
    System.out.println("Please enter an integer:");
    int userIntA = input.nextInt();
    System.out.println("Please enter another integer:");
    int userIntB = input.nextInt();

    // determines which number is larger and gives them to the user in order from smallest to largest
    if (userIntA > userIntB) {
      System.out.println("Your numbers in ascending order are " + userIntB + ", " + userIntA);
    } else if (userIntA < userIntB) {
      System.out.println("Your numbers in ascending order are " + userIntA + ", " + userIntB);
    }
  }
}
