import java.util.Scanner;

public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Length: ");
        double lenght = Double.parseDouble(console.nextLine());
        System.out.print("Width: ");
        double width = Double.parseDouble(console.nextLine());
        System.out.print("Height: ");
        double height = Double.parseDouble(console.nextLine());

        double volume = (lenght * width * height)/3 ;
        System.out.printf("Pyramid Volume: %.2f", volume);
    }
}
