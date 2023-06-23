interface Tributavel {
    double calcularTributos();

    void sacar(double v);

    void calcularNovoSaldo(double v);
}

class ContaPoupancadois implements Tributavel {

    public ContaPoupancadois(String maria, int i, double v, int i1) {
    }

    @Override
    public double calcularTributos() {
        return 0;
    }

    @Override
    public void sacar(double v) {

    }

    @Override
    public void calcularNovoSaldo(double v) {

    }

    public void mostrarDados() {
    }

    public void depositar(double v) {
    }
}

abstract class ContaCorrente implements Tributavel {
    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double calcularTributos() {
        return saldo * 0.01;
    }

    @Override
    public void sacar(double v) {

    }

}

class SeguroDeVida implements Tributavel {

    @Override
    public double calcularTributos() {
        return 42;
    }

    @Override
    public void sacar(double v) {
        
    }

    @Override
    public void calcularNovoSaldo(double v) {

    }
}

class SV {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        ContaCorrente contaCorrente = new ContaCorrente(5000) {
            @Override
            public void calcularNovoSaldo(double v) {

            }
        };
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        double tributosContaPoupanca = contaPoupanca.calcularTributos();
        double tributosContaCorrente = contaCorrente.calcularTributos();
        double tributosSeguroDeVida = seguroDeVida.calcularTributos();

        System.out.println("Tributos da Conta Poupança: " + tributosContaPoupanca);
        System.out.println("Tributos da Conta Corrente: " + tributosContaCorrente);
        System.out.println("Tributos do Seguro de Vida: " + tributosSeguroDeVida);


    }
}