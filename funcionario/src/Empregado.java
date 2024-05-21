public class Empregado {
    //declaração das variaveris 
    private String nome;
    private int idade;
    private double salario;

    public Empregado(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }
    //Get e Set nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //Get e Set idade
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    //Get e Set Salario
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    //método para promover o empregado
    public void promover() {
        if (idade > 18) {
            aumentarSalario(25);
        } else {
            System.out.println("Empregado deve ter mais de 18 anos para ser promovido.");
        }
    }
    //método para aumentar o salário do empregado 
    public void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100);
    }
    //método para demitir o empregado (Com switch case para as causas da demissão)
    public void demitir(int motivo) {
        switch (motivo) {
            case 1:
                System.out.println("Empregado demitido por justa causa.\nO funcionário deve cumprir aviso o prévio.");
                break;
            case 2:
                double multa = salario * 0.40;
                System.out.println("Empregado demitido por decisão do empregador.\nMulta de 40% do salário: R$ " + multa);
                break;
            case 3:
                double salarioAposentadoria;
                if (salario <= 2000) {
                    salarioAposentadoria = 1500;
                } else if (salario <= 3000) {
                    salarioAposentadoria = 2500;
                } else if (salario <= 4000) {
                    salarioAposentadoria = 3500;
                } else {
                    salarioAposentadoria = 4000;
                }
                System.out.println("Empregado aposentado.\nSalário do aposentado: R$ " + salarioAposentadoria);
                break;
            default:
                System.out.println("Motivo inválido.");
        }
    }
    //método para o empregado "fazer aniversário" (Adiciona +1 ano de vida ao empregado)
    public void fazerAniversario() {
        idade++;
    }
    //método para retornar os dados do empregado
    public String toString() {
        return "Empregado [nome=" + nome + ", idade=" + idade + ", salario=" + salario + "]";
    }
}