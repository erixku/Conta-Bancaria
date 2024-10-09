/**
 * Classe para instanciar a classe Conta Bancária e suas classes filhas
 * @author Erick Gomes Barbosa
 */

 public class AgenciaBancaria{
    public static void main(String[] args) {
        ContaBancaria cb1 = new ContaBancaria("A5474", "Same Anderson Carvalho", 2000.0);

        cb1.sacar(70.0);
    }
 }