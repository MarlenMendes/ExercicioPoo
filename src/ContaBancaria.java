public class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    protected double saldo;

    public ContaBancaria(String nomeCliente, int numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente. Operação de saque não realizada.");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso. Novo saldo: " + saldo);
    }

    public void mostrarDados() {
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Número da conta: " + numConta);
        System.out.println("Saldo atual: " + saldo);
    }
}

class ContaPoupanca extends ContaBancaria {
    public static final String Darci = null;
    private int diaRendimento;
    public ContaPoupanca() {
        super(Darci,
                1252,
                1000);
        this.diaRendimento = diaRendimento;
    }
    public void calcularNovoSaldo(double taxaRendimento) {
        double rendimento = saldo * taxaRendimento / 100;
        saldo += rendimento;
        System.out.println("Rendimento aplicado. Novo saldo: " + saldo);
    }

    public double calcularTributos() {
        return 0;
    }
}

class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String nomeCliente, int numConta, double saldo, double v) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente. Operação de saque não realizada.");

        }
    }
}



