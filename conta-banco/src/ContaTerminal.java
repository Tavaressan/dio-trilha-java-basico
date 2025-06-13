import Models.Conta;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //Obter e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        String agencia;
        String nomeCliente;
        double saldo;

        //Exibir as mensagens para o nosso usuário
        System.out.println("Bem-vindo ao Terminal de Criação de Conta!");



        // Obter pela scanner os valores digitados no terminal

        System.out.println("Por favor, insira seu nome");
        nomeCliente = scanner.next();

        System.out.println("Por favor, insira sua agência (e.g.: 067-8)");
        agencia = scanner.next();

        System.out.println("Por favor, adicione o saldo desejado");
        saldo = scanner.nextDouble();

        Conta c = new Conta(nomeCliente, agencia, saldo);


        //Exibir a mensagem conta criada

        System.out.println("Sua conta foi criada com sucesso!");
        c.ExibirConta();

    }
}
