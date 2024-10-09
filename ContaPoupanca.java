/**
 * Classe para especializar e extender a classe Conta Bancária
 * @author Erick Gomes Barbosa
 */

 public class ContaPoupanca extends ContaBancaria{
    protected Double taxaDeJuros;

    public ContaPoupanca(String numConta, String titular, Double saldo, Double taxaDeJuros){
        super(numConta, titular, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public void aplicarRendimento(){
        saldo = saldo + (saldo*(taxaDeJuros/100));
        System.out.println("Rendimento aplicado com sucesso");
        exibirSaldo();
    }

    @Override
    public void exibirDadosConta(){
        System.out.println("Número da conta: " + numConta);
        System.out.println("Titular da conta: " + titular);
        exibirSaldo();
        System.out.println("Taxa de juros aplicada: " + taxaDeJuros + "%");
    }
 }