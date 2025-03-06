import  java.util.Scanner;

public class exercicio_seis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();


        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        if (peso <= 0 || altura <= 0) {
            System.out.println("Erro: Peso e altura devem ser valores positivos e maiores que zero.");
        } else {

            double imc = peso / (altura * altura);


            System.out.printf("Seu IMC é: %.2f\n", imc);


            if (imc < 18.5) {
                System.out.println("Classificação: Abaixo do peso");
            } else if (imc >= 18.5 && imc < 24.9) {
                System.out.println("Classificação: Peso normal");
            } else if (imc >= 25 && imc < 29.9) {
                System.out.println("Classificação: Sobrepeso");
            } else if (imc >= 30) {
                System.out.println("Classificação: Obesidade");
            }
        }

    }

}
