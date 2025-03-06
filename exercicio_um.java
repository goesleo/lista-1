import java.util.Scanner;

public class exercicio_um {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String nome;
        String cidade;
        int idade;

        System.out.print("\n\tDigite seu nome: ");
        nome = in.nextLine();

        System.out.print("\n\tDigite sua cidade: ");
        cidade = in.nextLine();

        System.out.print("\n\tDigite sua idade: ");
        idade = in.nextInt();

        System.out.println("\n\t" + nome + "," + idade + "anos," + cidade);

    }
}
