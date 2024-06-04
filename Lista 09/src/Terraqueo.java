// Definição da classe Terraqueo que herda de PersonagemDragonBall
public class Terraqueo extends PersonagemDragonBall {
    // Declaração de variáveis privadas específicas da classe Terraqueo
    private String pais;   // País onde o personagem Terraqueo vive
    private String cidade; // Cidade onde o personagem Terraqueo vive

    // Construtor da classe Terraqueo, inicializa os atributos
    public Terraqueo(String nome, int idade, String sexo, String temporada, int ki, String poderEspecial, String pais, String cidade) {
        // Chama o construtor da classe base (PersonagemDragonBall) para inicializar os atributos herdados
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        // Inicializa os atributos específicos da classe Terraqueo
        this.pais = pais;
        this.cidade = cidade;
    }

    // Sobrescreve o método calcularPoder da classe base
    @Override
    public int calcularPoder() {
        // Retorna o ki do Terraqueo sem modificações
        return ki;
    }

    // Sobrescreve o método toString da classe base para incluir informações específicas de Terraqueo
    @Override
    public String toString() {
        // Retorna a representação em string do objeto, incluindo os atributos da classe base e os específicos
        return super.toString() + String.format(", País: %s, Cidade: %s", pais, cidade);
    }
}
