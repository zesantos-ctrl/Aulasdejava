package OrientacaoPorObjetos.Desafio2;

public class Conta {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("1234-5", "João", 0.0);

        System.out.println("Número da conta: " + minhaConta.getNumeroConta());
        System.out.println("Titular da conta: " + minhaConta.titular);
        System.out.println("Saldo da conta: " + minhaConta.getSaldo());

        minhaConta.depositar(100.0);
        System.out.println("Novo saldo da conta: " + minhaConta.getSaldo());

        minhaConta.sacar(50.0);
        System.out.println("Saldo da conta após o saque: " + minhaConta.getSaldo());

        minhaConta.setNumeroConta("6785-3");
        System.out.println("Novo número da conta: " + minhaConta.getNumeroConta());
    }
}
