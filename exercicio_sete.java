import java.util.Scanner;

public class exercicio_sete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("Temperatura em Fahrenheit: %.2f\n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f\n", kelvin);

    }
}
