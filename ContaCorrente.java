/**
 * @author Erick Gomes Barbosa
 * Classe para extender as funcionalidades da classe Conta Bancária
 */

 public class ContaCorrente extends ContaBancaria{
    Double limite;

    public ContaCorrente(String numConta, String titular, Double saldo, Double limite){
        super(numConta, titular, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(Double valor){
        if(saldo<(-1*limite)){
            JOptionPane.showMessageDialog("Seu saldo está abaixo do limite estabelecido");
        }
        else{
            if((saldo-valor)<(-1*limite)){
                JOptionPane.showMessageDialog("O valor requisitado ultrapassa o seu limite");
            }
            else{
                saldo = saldo - valor;
                JOptionPane.showMessageDialog("O saque foi realizado com sucesso");
                exibirSaldo();
            }
        }
    }
 }