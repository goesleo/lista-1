import java.util.Scanner;
public class exercicio_oito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double areaRetangulo = largura * altura;
        System.out.printf("Área do retângulo: %.2f\n", areaRetangulo);

        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();

        double areaQuadrado = lado * lado;
        System.out.printf("Área do quadrado: %.2f\n", areaQuadrado);
    }

}

