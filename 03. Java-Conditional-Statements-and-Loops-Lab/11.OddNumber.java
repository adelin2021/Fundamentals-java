import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

            while (n % 2 == 0) {
                System.out.println("Please write an odd number.");
                n=Integer.parseInt(scan.nextLine());
            }
                System.out.println("The number is: "+Math.abs(n));

        }
    }

