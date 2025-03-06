import java.util.Scanner;

public class exercicio_cinco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero real: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero real: ");
        double num2 = scanner.nextDouble();

        double quociente = num1 / num2;
        double soma = num1 + num2;
        double produto = num1 * num2;
        double diferenca = num1 - num2;

        System.out.printf("quociente: %.2f%n", quociente);
        System.out.printf("soma: %.2f%n", soma);
        System.out.printf("produto: %.2f%n", produto);
        System.out.printf("diferenca: %.2f%n", diferenca);
    }

}
