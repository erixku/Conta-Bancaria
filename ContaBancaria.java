/**
 * @author Erick Gomes Barbosa
 * Classe para criação de contas bancárias simples, com finalidade de especialização posteriormente
 */

 import javax.swing.*;

 public class ContaBancaria {
    protected String numConta, titular;
    protected Double saldo;

    public Contabancaria(String numConta, String titular, Double saldo){
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(Double valor){
        saldo = saldo+valor;
        JOptionPane.showMessageDialog("Depósito realizado com sucesso");
    }

    public void sacar(Double valor){
        if(saldo == 0){
            JOptionPane.showMessageDialog(null, "Seu saldo se encontra vazio");
        }
        else{
            if(valor>saldo){
                JOptionPane.showMessageDialog("O valor requisitado é maior do que o disponível na conta");
            }
            else{
                saldo = saldo - valor;
                JOptionPane.showMessageDialog("Seu saque foi realizado com sucesso!");
                exibirSaldo();
            }
        }
    }

    public void exibirSaldo(){
        JOptionPane.showMessageDialog("O saldo atual da conta é de: " + saldo);
    }
 }