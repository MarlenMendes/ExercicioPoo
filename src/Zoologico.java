class Animal {
    private String nome;
    private double comprimento;
    private int numPatas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public Animal(String nome, double comprimento, int i, String cor, String mar, double velocidade) {
        this.nome = this.nome;
        this.comprimento = this.comprimento;
        this.numPatas = numPatas;
        this.cor = this.cor;
        this.ambiente = ambiente;
        this.velocidade = this.velocidade;
    }

    public void exibirAnimal() {
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento: " + comprimento + " m");
        System.out.println("Número de patas: " + numPatas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade: " + velocidade + " m/s");
    }

}

class Peixe extends Animal {
    private String caracteristicas;

    public Peixe(String nome, double comprimento, String cor, double velocidade, String caracteristicas) {
        super(nome, comprimento, 0, cor, "mar", velocidade);
        this.caracteristicas = caracteristicas;
    }

    @Override
    public void exibirAnimal() {
        super.exibirAnimal();
        System.out.println("Características: " + caracteristicas);
    }
}

class Foraminifer extends Animal {
    private String alimento;

    public Foraminifer(String nome, double comprimento, int numPatas, String cor, double velocidade, String alimento) {
        super(nome, comprimento, numPatas, cor, "terra", velocidade);
        this.alimento = alimento;
    }

    @Override
    public void exibirAnimal() {
        super.exibirAnimal();
        System.out.println("Alimento: " + alimento);
    }

}

class Zoologico {
    public static void main(String[] args) {
        Animal camelo = new Animal("Camelo", 2.0, 4, "Amarelo", "Terra", 20);
        Peixe tubarao = new Peixe("Tubarão", 3.0, "Cinza", 25, "Barbatanas e cauda");
        Foraminifer ursoDoCanada = new Foraminifer("Urso-do-Canadá", 1.8, 4, "Castanho", 30, "Mel");
        Animal iguana = new Animal("Iguana", 1.2, 4, "Verde", "Terra", 15);
        Animal leao = new Animal("Leão", 2.5, 4, "Amarelo", "Terra", 30);
        Foraminifer micoLeaoDourado = new Foraminifer("Mico-leão-dourado", 0.4, 4, "Dourado", 10, "Frutas");

        camelo.exibirAnimal();
        System.out.println();
        tubarao.exibirAnimal();
        System.out.println();
        ursoDoCanada.exibirAnimal();
        System.out.println();
        iguana.exibirAnimal();
        System.out.println();
        leao.exibirAnimal();
        System.out.println();
        micoLeaoDourado.exibirAnimal();

    }

}