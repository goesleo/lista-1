import java.util.Scanner;

public class exercicio_dois {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = in.nextLine();

        System.out.print("Digite o seu cpf: ");
        String cpf = in.nextLine();

        System.out.print("Digite o seu rg: ");
        String rg = in.nextLine();

        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);

            in.close();

    }


}

