import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class MinMaxSumAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int inputeNumbers = Integer.parseInt(scan.nextLine());
            numbers.add(inputeNumbers);
        }
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        int min = numbers.stream().mapToInt(Integer::intValue).min().getAsInt();
        int max = numbers.stream().mapToInt(Integer::intValue).max().getAsInt();
        double average = numbers.stream().mapToInt(Integer::intValue).average().getAsDouble();

        DecimalFormat df = new DecimalFormat("#.###########");

        System.out.printf("Sum = %d%n", sum);
        System.out.printf("Min = %d%n", min);
        System.out.printf("Max = %d%n", max);
        System.out.printf("Average = %s%n", df.format(average));
    }
}
