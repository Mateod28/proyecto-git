import java.util.Scanner;
public class cadenas_1 {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        String name;
        int number;

        System.out.print("Ingrese su nombre: ");
        name = inputData.nextLine();
        System.out.print("Ingrese un numero entero: ");
        number = inputData.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(i + "-" + name);
        }
    }
}
