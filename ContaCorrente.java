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
            System.out.println("Seu saldo está abaixo do limite estabelecido");
        }
        else{
            if((saldo-valor)<(-1*limite)){
                System.out.println("O valor requisitado ultrapassa o seu limite");
            }
            else{
                saldo = saldo - valor;
                System.out.println("O saque foi realizado com sucesso");
                exibirSaldo();
            }
        }
    }

    @Override
    public void exibirDadosConta(){
        System.out.println("Número da conta: " + numConta);
        System.out.println("Titular da conta: " + titular);
        exibirSaldo();
        System.out.println("Limite atual da conta: " + limite);
    }
 }