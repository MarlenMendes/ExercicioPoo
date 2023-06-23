public class Teste {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("João", 1, 1000.0);
        ContaPoupancadois conta2 = new ContaPoupancadois("Maria", 2, 2000.0, 10);
        ContaEspecial conta3 = new ContaEspecial("Carlos", 3, 3000.0, 1000.0);


        conta1.sacar(500.0);
        conta2.sacar(1500.0);
        conta3.sacar(4000.0);


        conta1.depositar(200.0);
        conta2.depositar(300.0);
        conta3.depositar(500.0);


        conta2.calcularNovoSaldo(2.5);


        conta1.mostrarDados();
        conta2.mostrarDados();
        conta3.mostrarDados();

    }

}
