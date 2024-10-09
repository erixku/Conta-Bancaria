/**
 * @author Erick Gomes Barbosa
 * Classe para criação de contas bancárias simples, com finalidade de especialização posteriormente
 */

 import javax.swing.*;

 public class ContaBancaria {
    protected String numConta, titular;
    protected Double saldo;

    public ContaBancaria(String numConta, String titular, Double saldo){
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(Double valor){
        saldo = saldo+valor;
        System.out.println("Depósito realizado com sucesso");
    }

    public void sacar(Double valor){
        if(saldo == 0){
            System.out.println("Seu saldo se encontra vazio");
        }
        else{
            if(valor>saldo){
                System.out.println("O valor requisitado é maior do que o disponível na conta");
            }
            else{
                saldo = saldo - valor;
                System.out.println("Seu saque foi realizado com sucesso!");
                exibirSaldo();
            }
        }
    }

    public void exibirSaldo(){
        System.out.println("O saldo atual da conta é de: " + saldo);
    }

    public void exibirDadosConta(){
        System.out.println("Número da conta: " + numConta);
        System.out.println("Titular da conta: " + titular);
        exibirSaldo();
    }
 }