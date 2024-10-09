/**
 * Classe para instanciar a classe Conta Bancária e suas classes filhas
 * @author Erick Gomes Barbosa
 */

 public class AgenciaBancaria{
    public static void main(String[] args) {
        //ContaBancaria cb1 = new ContaBancaria("A5474", "Same Anderson Carvalho", 2000.0);
        ContaCorrente cc2 = new ContaCorrente("W245454", "Washington Antunes", 5486369.0, 10000000.0);


        //cb1.sacar(2000.0);
        cc2.sacar(15000000.0);
        //cc2.sacar(2000000.0);
        cc2.depositar(20000000.0);
        cc2.exibirDadosConta();

    }
 }