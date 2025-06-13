package Models;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Conta {
    List<Integer> Numero = new ArrayList<>();
    String Agencia;
    String NomeCliente;
    double Saldo;
    static int contadorNumero = 1;

    public Conta (String nomeCliente, String agencia, double saldo)
    {
        Numero.add(contadorNumero++);
        Agencia = agencia;
        NomeCliente = nomeCliente;
        Saldo = saldo;
    }

    public void ExibirConta () {
        System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de U$ %.2f já está disponível para saque.", NomeCliente,  Agencia, Numero.getFirst(), Saldo );
    }


}
