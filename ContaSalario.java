import javax.swing.JOptionPane;

/**
 * Classe para especializar e extender a classe Conta Bancária
 * @author Erick Gomes Barbosa
 */

 public class ContaSalario extends ContaBancaria{
    Integer qtdSaque;

    public ContaSalario(String numConta, String titular, Double saldo, Integer qtdSaque){
        super(numConta, titular, saldo);
        this.qtdSaque = qtdSaque;
    }

    @Override
    public void sacar(Double valor){
        if(qtdSaque == 0){
            System.out.println("Seu limite de saques por mês foi atingido");
        }
        else{
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
    }
 }